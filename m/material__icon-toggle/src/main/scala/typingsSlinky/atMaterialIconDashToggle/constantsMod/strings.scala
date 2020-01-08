package typingsSlinky.atMaterialIconDashToggle.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atMaterialBase.foundationMod.MDCStrings
import typingsSlinky.atMaterialIconDashToggle.atMaterialIconDashToggleStrings.MDCIconToggleColonchange
import typingsSlinky.atMaterialIconDashToggle.atMaterialIconDashToggleStrings.`aria-disabled`
import typingsSlinky.atMaterialIconDashToggle.atMaterialIconDashToggleStrings.`aria-label`
import typingsSlinky.atMaterialIconDashToggle.atMaterialIconDashToggleStrings.`aria-pressed`
import typingsSlinky.atMaterialIconDashToggle.atMaterialIconDashToggleStrings.`data-toggle-off`
import typingsSlinky.atMaterialIconDashToggle.atMaterialIconDashToggleStrings.`data-toggle-on`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_DISABLED: `aria-disabled`
  var ARIA_LABEL: `aria-label`
  var ARIA_PRESSED: `aria-pressed`
  var CHANGE_EVENT: MDCIconToggleColonchange
  var DATA_TOGGLE_OFF: `data-toggle-off`
  var DATA_TOGGLE_ON: `data-toggle-on`
}

object strings {
  @scala.inline
  def apply(
    ARIA_DISABLED: `aria-disabled`,
    ARIA_LABEL: `aria-label`,
    ARIA_PRESSED: `aria-pressed`,
    CHANGE_EVENT: MDCIconToggleColonchange,
    DATA_TOGGLE_OFF: `data-toggle-off`,
    DATA_TOGGLE_ON: `data-toggle-on`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_DISABLED = ARIA_DISABLED.asInstanceOf[js.Any], ARIA_LABEL = ARIA_LABEL.asInstanceOf[js.Any], ARIA_PRESSED = ARIA_PRESSED.asInstanceOf[js.Any], CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], DATA_TOGGLE_OFF = DATA_TOGGLE_OFF.asInstanceOf[js.Any], DATA_TOGGLE_ON = DATA_TOGGLE_ON.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

