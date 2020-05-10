package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFrame extends js.Object {
  val Frame: js.Any = js.native
  val RedirectURL: js.Any = js.native
  val StartURL: js.Any = js.native
  val StatusCode: js.Any = js.native
  val pDisp: js.Any = js.native
}

object AnonFrame {
  @scala.inline
  def apply(Frame: js.Any, RedirectURL: js.Any, StartURL: js.Any, StatusCode: js.Any, pDisp: js.Any): AnonFrame = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], RedirectURL = RedirectURL.asInstanceOf[js.Any], StartURL = StartURL.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrame]
  }
  @scala.inline
  implicit class AnonFrameOps[Self <: AnonFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrame(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectURL(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartURL(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
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

