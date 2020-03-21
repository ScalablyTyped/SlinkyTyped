package typingsSlinky.reactPlacesAutocomplete

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.combobox
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.list
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.off
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAriaactivedescendant extends js.Object {
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-autocomplete`: list
  var `aria-expanded`: Boolean
  var autoComplete: off
  var disabled: Boolean
  var onBlur: FocusEventHandler[Element]
  var onKeyDown: KeyboardEventHandler[Element]
  var role: combobox
  var `type`: text
  var value: js.UndefOr[String] = js.undefined
  def onChange(ev: AnonTarget): Unit
}

object AnonAriaactivedescendant {
  @scala.inline
  def apply(
    `aria-autocomplete`: list,
    `aria-expanded`: Boolean,
    autoComplete: off,
    disabled: Boolean,
    onBlur: SyntheticFocusEvent[Element] => Unit,
    onChange: AnonTarget => Unit,
    onKeyDown: SyntheticKeyboardEvent[Element] => Unit,
    role: combobox,
    `type`: text,
    `aria-activedescendant`: String = null,
    value: String = null
  ): AnonAriaactivedescendant = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onKeyDown = js.Any.fromFunction1(onKeyDown), role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAriaactivedescendant]
  }
}

