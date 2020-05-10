package typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod

import typingsSlinky.materialUiLab.materialUiLabBooleans.`false`
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseAutocompleteSingleProps[T]
  extends UseAutocompleteCommonProps[T]
     with UseAutocompleteProps[T] {
  /**
    * The default input value. Use when the component is not controlled.
    */
  var defaultValue: js.UndefOr[T] = js.native
  /**
    * If `true`, `value` must be an array and the menu will support multiple selections.
    */
  var multiple: js.UndefOr[`false`] = js.native
  /**
    * Callback fired when the value changes.
    *
    * @param {object} event The event source of the callback.
    * @param {T} value
    * @param {string} reason One of "create-option", "select-option", "remove-option", "blur" or "clear".
    */
  var onChange: js.UndefOr[
    js.Function4[
      /* event */ ChangeEvent[js.Object], 
      /* value */ T | Null, 
      /* reason */ AutocompleteChangeReason, 
      /* details */ js.UndefOr[AutocompleteChangeDetails[T]], 
      Unit
    ]
  ] = js.native
  /**
    * The value of the autocomplete.
    *
    * The value must have reference equality with the option in order to be selected.
    * You can customize the equality behavior with the `getOptionSelected` prop.
    */
  var value: js.UndefOr[T | Null] = js.native
}

object UseAutocompleteSingleProps {
  @scala.inline
  def apply[T](options: js.Array[T]): UseAutocompleteSingleProps[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseAutocompleteSingleProps[T]]
  }
  @scala.inline
  implicit class UseAutocompleteSinglePropsOps[Self[t] <: UseAutocompleteSingleProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDefaultValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: `false`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* event */ ChangeEvent[js.Object], /* value */ T | Null, /* reason */ AutocompleteChangeReason, /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

