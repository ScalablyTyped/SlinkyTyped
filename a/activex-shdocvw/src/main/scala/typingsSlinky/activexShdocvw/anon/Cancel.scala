package typingsSlinky.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancel extends js.Object {
  var Cancel: Boolean = js.native
  val Frame: js.Any = js.native
  val StatusCode: js.Any = js.native
  val URL: js.Any = js.native
  val pDisp: js.Any = js.native
}

object Cancel {
  @scala.inline
  def apply(Cancel: Boolean, Frame: js.Any, StatusCode: js.Any, URL: js.Any, pDisp: js.Any): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURL(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDisp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pDisp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

