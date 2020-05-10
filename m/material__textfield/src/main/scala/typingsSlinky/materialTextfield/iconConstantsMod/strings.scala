package typingsSlinky.materialTextfield.iconConstantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTextfield.materialTextfieldStrings.MDCTextFieldColonicon
import typingsSlinky.materialTextfield.materialTextfieldStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var ICON_EVENT: MDCTextFieldColonicon = js.native
  var ICON_ROLE: button = js.native
}

object strings {
  @scala.inline
  def apply(ICON_EVENT: MDCTextFieldColonicon, ICON_ROLE: button): strings = {
    val __obj = js.Dynamic.literal(ICON_EVENT = ICON_EVENT.asInstanceOf[js.Any], ICON_ROLE = ICON_ROLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withICON_EVENT(value: MDCTextFieldColonicon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICON_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withICON_ROLE(value: button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICON_ROLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

