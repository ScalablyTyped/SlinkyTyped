package typingsSlinky.hcaptchaReactHcaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HCaptchaState extends js.Object {
  var captchaId: String = js.native
  var elementId: String = js.native
  var isApiReady: Boolean = js.native
  var isRemoved: Boolean = js.native
}

object HCaptchaState {
  @scala.inline
  def apply(captchaId: String, elementId: String, isApiReady: Boolean, isRemoved: Boolean): HCaptchaState = {
    val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], isApiReady = isApiReady.asInstanceOf[js.Any], isRemoved = isRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[HCaptchaState]
  }
  @scala.inline
  implicit class HCaptchaStateOps[Self <: HCaptchaState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptchaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsApiReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isApiReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemoved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

