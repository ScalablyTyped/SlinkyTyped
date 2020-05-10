package typingsSlinky.hoxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hoxy.hoxy.Slow> */
@js.native
trait PartialSlow extends js.Object {
  var down: js.UndefOr[Double] = js.native
  var latency: js.UndefOr[Double] = js.native
  var rate: js.UndefOr[Double] = js.native
  var up: js.UndefOr[Double] = js.native
}

object PartialSlow {
  @scala.inline
  def apply(): PartialSlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSlow]
  }
  @scala.inline
  implicit class PartialSlowOps[Self <: PartialSlow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
        ret
    }
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.undefined)
        ret
    }
    @scala.inline
    def withUp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.undefined)
        ret
    }
  }
  
}

