package typingsSlinky.inboxsdk.mod.NavMenu

import typingsSlinky.inboxsdk.inboxsdkStrings.DROPDOWN_BUTTON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownButtonAccessoryDescriptor extends js.Object {
  var buttonBackgroundColor: String = js.native
  var buttonForegroundColor: String = js.native
  var `type`: DROPDOWN_BUTTON = js.native
  def onClick(event: DropdownButtonClickEvent): Unit = js.native
}

object DropdownButtonAccessoryDescriptor {
  @scala.inline
  def apply(
    buttonBackgroundColor: String,
    buttonForegroundColor: String,
    onClick: DropdownButtonClickEvent => Unit,
    `type`: DROPDOWN_BUTTON
  ): DropdownButtonAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(buttonBackgroundColor = buttonBackgroundColor.asInstanceOf[js.Any], buttonForegroundColor = buttonForegroundColor.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownButtonAccessoryDescriptor]
  }
  @scala.inline
  implicit class DropdownButtonAccessoryDescriptorOps[Self <: DropdownButtonAccessoryDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonForegroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: DropdownButtonClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: DROPDOWN_BUTTON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

