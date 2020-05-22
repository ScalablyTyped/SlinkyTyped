package typingsSlinky.reactBootstrapTypeahead.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.combobox
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputContainerPropsSingle[T /* <: TypeaheadModel */] extends js.Object {
  var `aria-activedescendant`: String
  var `aria-autocomplete`: list | both
  var `aria-expanded`: Boolean
  var `aria-haspopup`: listbox
  var `aria-owns`: String
  var autoComplete: String
  var disabled: Boolean
  var inputRef: LegacyRef[HTMLInputElement]
  var placeholder: String | Null
  var role: combobox
  var value: String
  def onBlur(e: Event): Unit
  def onChange(selected: js.Array[T]): Unit
  def onClick(e: Event): Unit
  def onFocus(e: Event): Unit
  def onKeyDown(e: Event): Unit
}

object InputContainerPropsSingle {
  @scala.inline
  def apply[T](
    `aria-activedescendant`: String,
    `aria-autocomplete`: list | both,
    `aria-expanded`: Boolean,
    `aria-haspopup`: listbox,
    `aria-owns`: String,
    autoComplete: String,
    disabled: Boolean,
    onBlur: Event => Unit,
    onChange: js.Array[T] => Unit,
    onClick: Event => Unit,
    onFocus: Event => Unit,
    onKeyDown: Event => Unit,
    role: combobox,
    value: String,
    inputRef: LegacyRef[HTMLInputElement] = null,
    placeholder: String = null
  ): InputContainerPropsSingle[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), role = role.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], inputRef = inputRef.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContainerPropsSingle[T]]
  }
}

