package typingsSlinky.reactBootstrapTypeahead.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings._empty
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.Omit<react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>, 'role'> */
trait InputContainerPropsMultiple[T /* <: TypeaheadModel */] extends js.Object {
  var `aria-activedescendant`: String
  var `aria-autocomplete`: list | both
  var `aria-expanded`: Boolean
  var `aria-haspopup`: listbox
  var `aria-owns`: String
  var autoComplete: String
  var disabled: Boolean
  var inputClassName: String
  var inputRef: LegacyRef[HTMLInputElement]
  var labelKey: TypeaheadLabelKey[T]
  var onBlur: js.Function1[/* e */ Event, Unit]
  var onChange: js.Function1[/* selected */ js.Array[T], Unit]
  var onClick: js.Function1[/* e */ Event, Unit]
  var onFocus: js.Function1[/* e */ Event, Unit]
  var onKeyDown: js.Function1[/* e */ Event, Unit]
  var placeholder: js.UndefOr[String] = js.undefined
  var role: _empty
  var selected: js.Array[T]
  var value: String
  def onRemove(e: Event): Unit
  def renderToken(selectedItem: T, props: TypeaheadMenuProps[T], index: Double): TagMod[Any]
}

object InputContainerPropsMultiple {
  @scala.inline
  def apply[T](
    `aria-activedescendant`: String,
    `aria-autocomplete`: list | both,
    `aria-expanded`: Boolean,
    `aria-haspopup`: listbox,
    `aria-owns`: String,
    autoComplete: String,
    disabled: Boolean,
    inputClassName: String,
    labelKey: TypeaheadLabelKey[T],
    onBlur: /* e */ Event => Unit,
    onChange: /* selected */ js.Array[T] => Unit,
    onClick: /* e */ Event => Unit,
    onFocus: /* e */ Event => Unit,
    onKeyDown: /* e */ Event => Unit,
    onRemove: Event => Unit,
    renderToken: (T, TypeaheadMenuProps[T], Double) => TagMod[Any],
    role: _empty,
    selected: js.Array[T],
    value: String,
    inputRef: LegacyRef[HTMLInputElement] = null,
    placeholder: String = null
  ): InputContainerPropsMultiple[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], inputClassName = inputClassName.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onRemove = js.Any.fromFunction1(onRemove), renderToken = js.Any.fromFunction3(renderToken), role = role.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], inputRef = inputRef.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContainerPropsMultiple[T]]
  }
}

