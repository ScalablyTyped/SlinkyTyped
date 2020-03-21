package typingsSlinky.materialCheckbox.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`Dotmdc-checkbox__native-control`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`aria-checked`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.checked
import typingsSlinky.materialCheckbox.materialCheckboxStrings.indeterminate
import typingsSlinky.materialCheckbox.materialCheckboxStrings.init
import typingsSlinky.materialCheckbox.materialCheckboxStrings.mixed
import typingsSlinky.materialCheckbox.materialCheckboxStrings.unchecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_CHECKED_ATTR: `aria-checked`
  var ARIA_CHECKED_INDETERMINATE_VALUE: mixed
  var NATIVE_CONTROL_SELECTOR: `Dotmdc-checkbox__native-control`
  var TRANSITION_STATE_CHECKED: checked
  var TRANSITION_STATE_INDETERMINATE: indeterminate
  var TRANSITION_STATE_INIT: init
  var TRANSITION_STATE_UNCHECKED: unchecked
}

object strings {
  @scala.inline
  def apply(
    ARIA_CHECKED_ATTR: `aria-checked`,
    ARIA_CHECKED_INDETERMINATE_VALUE: mixed,
    NATIVE_CONTROL_SELECTOR: `Dotmdc-checkbox__native-control`,
    TRANSITION_STATE_CHECKED: checked,
    TRANSITION_STATE_INDETERMINATE: indeterminate,
    TRANSITION_STATE_INIT: init,
    TRANSITION_STATE_UNCHECKED: unchecked,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR.asInstanceOf[js.Any], ARIA_CHECKED_INDETERMINATE_VALUE = ARIA_CHECKED_INDETERMINATE_VALUE.asInstanceOf[js.Any], NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any], TRANSITION_STATE_CHECKED = TRANSITION_STATE_CHECKED.asInstanceOf[js.Any], TRANSITION_STATE_INDETERMINATE = TRANSITION_STATE_INDETERMINATE.asInstanceOf[js.Any], TRANSITION_STATE_INIT = TRANSITION_STATE_INIT.asInstanceOf[js.Any], TRANSITION_STATE_UNCHECKED = TRANSITION_STATE_UNCHECKED.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

