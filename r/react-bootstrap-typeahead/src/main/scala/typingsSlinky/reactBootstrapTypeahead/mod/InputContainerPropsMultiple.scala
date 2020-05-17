package typingsSlinky.reactBootstrapTypeahead.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings._empty
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.Omit<react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>, 'role'> */
@js.native
trait InputContainerPropsMultiple[T /* <: TypeaheadModel */] extends js.Object {
  var `aria-activedescendant`: String = js.native
  var `aria-autocomplete`: list | both = js.native
  var `aria-expanded`: Boolean = js.native
  var `aria-haspopup`: listbox = js.native
  var `aria-owns`: String = js.native
  var autoComplete: String = js.native
  var disabled: Boolean = js.native
  var inputClassName: String = js.native
  var inputRef: LegacyRef[HTMLInputElement] = js.native
  var labelKey: TypeaheadLabelKey[T] = js.native
  var onBlur: js.Function1[/* e */ Event, Unit] = js.native
  var onChange: js.Function1[/* selected */ js.Array[T], Unit] = js.native
  var onClick: js.Function1[/* e */ Event, Unit] = js.native
  var onFocus: js.Function1[/* e */ Event, Unit] = js.native
  var onKeyDown: js.Function1[/* e */ Event, Unit] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var role: _empty = js.native
  var selected: js.Array[T] = js.native
  var value: String = js.native
  def onRemove(e: Event): Unit = js.native
  def renderToken(selectedItem: T, props: TypeaheadMenuProps[T], index: Double): TagMod[Any] = js.native
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
    value: String
  ): InputContainerPropsMultiple[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], inputClassName = inputClassName.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onRemove = js.Any.fromFunction1(onRemove), renderToken = js.Any.fromFunction3(renderToken), role = role.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContainerPropsMultiple[T]]
  }
  @scala.inline
  implicit class InputContainerPropsMultipleOps[Self[t] <: InputContainerPropsMultiple[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def `withAria-activedescendant`(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAria-autocomplete`(value: list | both): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAria-expanded`(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAria-haspopup`(value: listbox): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAria-owns`(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-owns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoComplete(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelKeyFunction1(value: T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelKey(value: TypeaheadLabelKey[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBlur(value: /* e */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnChange(value: /* selected */ js.Array[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClick(value: /* e */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnFocus(value: /* e */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* e */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRemove(value: Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderToken(value: (T, TypeaheadMenuProps[T], Double) => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToken")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRole(value: _empty): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputRefRefObject(value: ReactRef[HTMLInputElement]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInputRef(value: LegacyRef[HTMLInputElement]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputRefNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(null)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
  }
  
}

