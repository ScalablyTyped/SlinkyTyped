package typingsSlinky.puppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorText extends js.Object {
  var errorText: String = js.native
}

object AnonErrorText {
  @scala.inline
  def apply(errorText: String): AnonErrorText = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorText]
  }
  @scala.inline
  implicit class AnonErrorTextOps[Self <: AnonErrorText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

