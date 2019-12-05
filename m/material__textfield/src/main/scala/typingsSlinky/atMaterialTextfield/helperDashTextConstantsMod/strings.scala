package typingsSlinky.atMaterialTextfield.helperDashTextConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atMaterialBase.foundationMod.MDCStrings
import typingsSlinky.atMaterialTextfield.atMaterialTextfieldStrings.`aria-hidden`
import typingsSlinky.atMaterialTextfield.atMaterialTextfieldStrings.role
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

