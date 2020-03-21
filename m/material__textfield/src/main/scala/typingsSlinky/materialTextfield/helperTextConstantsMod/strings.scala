package typingsSlinky.materialTextfield.helperTextConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTextfield.materialTextfieldStrings.`aria-hidden`
import typingsSlinky.materialTextfield.materialTextfieldStrings.role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_HIDDEN: `aria-hidden`
  var ROLE: role
}

object strings {
  @scala.inline
  def apply(ARIA_HIDDEN: `aria-hidden`, ROLE: role, StringDictionary: StringDictionary[String] = null): strings = {
    val __obj = js.Dynamic.literal(ARIA_HIDDEN = ARIA_HIDDEN.asInstanceOf[js.Any], ROLE = ROLE.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

