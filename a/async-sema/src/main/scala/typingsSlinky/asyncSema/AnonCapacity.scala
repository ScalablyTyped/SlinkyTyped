package typingsSlinky.asyncSema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCapacity extends js.Object {
  var capacity: js.UndefOr[Double] = js.native
  var initFn: js.UndefOr[js.Function0[_]] = js.native
  var pauseFn: js.UndefOr[js.Function0[Unit]] = js.native
  var resumeFn: js.UndefOr[js.Function0[Unit]] = js.native
}

object AnonCapacity {
  @scala.inline
  def apply(): AnonCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCapacity]
  }
  @scala.inline
  implicit class AnonCapacityOps[Self <: AnonCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withInitFn(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFn")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseFn(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPauseFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseFn")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeFn(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResumeFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeFn")(js.undefined)
        ret
    }
  }
  
}

