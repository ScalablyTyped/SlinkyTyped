package typingsSlinky.materialTextfield.helperTextConstantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTextfield.materialTextfieldStrings.`aria-hidden`
import typingsSlinky.materialTextfield.materialTextfieldStrings.role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var ARIA_HIDDEN: `aria-hidden` = js.native
  var ROLE: role = js.native
}

object strings {
  @scala.inline
  def apply(ARIA_HIDDEN: `aria-hidden`, ROLE: role): strings = {
    val __obj = js.Dynamic.literal(ARIA_HIDDEN = ARIA_HIDDEN.asInstanceOf[js.Any], ROLE = ROLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARIA_HIDDEN(value: `aria-hidden`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROLE(value: role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

