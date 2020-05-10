package typingsSlinky.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPlaceholder extends js.Object {
  var placeholder: String = js.native
  var submitButtonTitle: String = js.native
}

object AnonPlaceholder {
  @scala.inline
  def apply(placeholder: String, submitButtonTitle: String): AnonPlaceholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], submitButtonTitle = submitButtonTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlaceholder]
  }
  @scala.inline
  implicit class AnonPlaceholderOps[Self <: AnonPlaceholder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

