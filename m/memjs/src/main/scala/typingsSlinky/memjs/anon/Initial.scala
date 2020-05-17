package typingsSlinky.memjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Initial extends js.Object {
  var expires: js.UndefOr[Double] = js.native
  var initial: js.UndefOr[Double] = js.native
}

object Initial {
  @scala.inline
  def apply(): Initial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initial]
  }
  @scala.inline
  implicit class InitialOps[Self <: Initial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
  }
  
}

