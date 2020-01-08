package typingsSlinky.atMaterialTextfield.iconConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atMaterialBase.foundationMod.MDCStrings
import typingsSlinky.atMaterialTextfield.atMaterialTextfieldStrings.MDCTextFieldColonicon
import typingsSlinky.atMaterialTextfield.atMaterialTextfieldStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ICON_EVENT: MDCTextFieldColonicon
  var ICON_ROLE: button
}

object strings {
  @scala.inline
  def apply(
    ICON_EVENT: MDCTextFieldColonicon,
    ICON_ROLE: button,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ICON_EVENT = ICON_EVENT.asInstanceOf[js.Any], ICON_ROLE = ICON_ROLE.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

