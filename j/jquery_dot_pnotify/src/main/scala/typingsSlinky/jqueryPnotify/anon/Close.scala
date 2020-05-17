package typingsSlinky.jqueryPnotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Close extends js.Object {
  var close: js.UndefOr[String] = js.native
  var stick: js.UndefOr[String] = js.native
  var unstick: js.UndefOr[String] = js.native
}

object Close {
  @scala.inline
  def apply(): Close = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Close]
  }
  @scala.inline
  implicit class CloseOps[Self <: Close] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withStick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stick")(js.undefined)
        ret
    }
    @scala.inline
    def withUnstick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnstick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstick")(js.undefined)
        ret
    }
  }
  
}

