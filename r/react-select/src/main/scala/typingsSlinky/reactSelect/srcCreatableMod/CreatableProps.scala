package typingsSlinky.reactSelect.srcCreatableMod

import slinky.core.TagMod
import typingsSlinky.reactSelect.reactSelectStrings.first
import typingsSlinky.reactSelect.reactSelectStrings.last
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatableProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /* Allow options to be created while the `isLoading` prop is true. Useful to
    prevent the "create new ..." option being displayed while async results are
    still being loaded. */
  var allowCreateWhileLoading: js.UndefOr[Boolean] = js.native
  /* Sets the position of the createOption element in your options list. Defaults to 'last' */
  var createOptionPosition: js.UndefOr[first | last] = js.native
  /* Gets the label for the "create new ..." option in the menu. Is given the
    current input value. */
  var formatCreateLabel: js.UndefOr[js.Function1[/* inputValue */ String, TagMod[Any]]] = js.native
  /* Returns the data for the new option when it is created. Used to display the
    value, and is passed to `onChange`. */
  var getNewOptionData: js.UndefOr[js.Function2[/* inputValue */ String, /* optionLabel */ TagMod[Any], OptionType]] = js.native
  /* Determines whether the "create new ..." option should be displayed based on
    the current input value, select value and options array. */
  var isValidNewOption: js.UndefOr[
    js.Function3[
      /* inputValue */ String, 
      /* value */ ValueType[OptionType], 
      /* options */ OptionsType[OptionType], 
      Boolean
    ]
  ] = js.native
  /* If provided, this will be called with the input value when a new option is
    created, and `onChange` will **not** be called. Use this when you need more
    control over what happens when new options are created. */
  var onCreateOption: js.UndefOr[js.Function1[/* inputValue */ String, Unit]] = js.native
}

object CreatableProps {
  @scala.inline
  def apply[OptionType](): CreatableProps[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatableProps[OptionType]]
  }
  @scala.inline
  implicit class CreatablePropsOps[Self[optiontype] <: CreatableProps[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withAllowCreateWhileLoading(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreateWhileLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCreateWhileLoading: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreateWhileLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateOptionPosition(value: first | last): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOptionPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateOptionPosition: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOptionPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatCreateLabel(value: /* inputValue */ String => TagMod[Any]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatCreateLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatCreateLabel: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatCreateLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNewOptionData(value: (/* inputValue */ String, /* optionLabel */ TagMod[Any]) => OptionType): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewOptionData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetNewOptionData: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewOptionData")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValidNewOption(
      value: (/* inputValue */ String, /* value */ ValueType[OptionType], /* options */ OptionsType[OptionType]) => Boolean
    ): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidNewOption")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutIsValidNewOption: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidNewOption")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreateOption(value: /* inputValue */ String => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateOption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCreateOption: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateOption")(js.undefined)
        ret
    }
  }
  
}

