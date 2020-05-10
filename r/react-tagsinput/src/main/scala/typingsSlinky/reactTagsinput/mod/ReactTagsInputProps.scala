package typingsSlinky.reactTagsinput.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Props
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTagsInputProps[Tag] extends Props[TagsInput[Tag]] {
  var addKeys: js.UndefOr[js.Array[Double | String]] = js.native
  var addOnBlur: js.UndefOr[Boolean] = js.native
  var addOnPaste: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var currentValue: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var focusedClassName: js.UndefOr[String] = js.native
  var inputProps: js.UndefOr[InputProps] = js.native
  var inputValue: js.UndefOr[String] = js.native
  var maxTags: js.UndefOr[Double] = js.native
  var onChangeInput: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onValidationReject: js.UndefOr[js.Function1[/* tags */ js.Array[String], Unit]] = js.native
  var onlyUnique: js.UndefOr[Boolean] = js.native
  var pasteSplit: js.UndefOr[js.Function1[/* data */ String, js.Array[String]]] = js.native
  var preventSubmit: js.UndefOr[Boolean] = js.native
  var removeKeys: js.UndefOr[js.Array[Double]] = js.native
  var renderInput: js.UndefOr[js.Function1[/* props */ RenderInputProps[Tag], TagMod[Any]]] = js.native
  var renderLayout: js.UndefOr[RenderLayout] = js.native
  var renderTag: js.UndefOr[js.Function1[/* props */ RenderTagProps[Tag], TagMod[Any]]] = js.native
  var tagDisplayProp: js.UndefOr[(/* keyof Tag */ String) | Null] = js.native
  var tagProps: js.UndefOr[TagProps] = js.native
  var validationRegex: js.UndefOr[js.RegExp] = js.native
  var value: js.Array[Tag] = js.native
  def onChange(tags: js.Array[Tag], changed: js.Array[Tag], changedIndexes: js.Array[Double]): Unit = js.native
}

object ReactTagsInputProps {
  @scala.inline
  def apply[Tag](onChange: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Unit, value: js.Array[Tag]): ReactTagsInputProps[Tag] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction3(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTagsInputProps[Tag]]
  }
  @scala.inline
  implicit class ReactTagsInputPropsOps[Self[tag] <: ReactTagsInputProps[tag], Tag] (val x: Self[Tag]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Tag] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Tag]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Tag] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Tag] with Other]
    @scala.inline
    def withOnChange(value: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Unit): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Array[Tag]): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddKeys(value: js.Array[Double | String]): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddKeys: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnBlur(value: Boolean): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOnBlur: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnPaste(value: Boolean): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOnPaste: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentValue(value: String): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentValue: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusedClassName(value: String): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusedClassName: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: InputProps): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputValue: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTags(value: Double): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTags: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTags")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeInput(value: /* value */ String => Unit): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeInput: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValidationReject(value: /* tags */ js.Array[String] => Unit): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidationReject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValidationReject: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidationReject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyUnique(value: Boolean): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyUnique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyUnique: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyUnique")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteSplit(value: /* data */ String => js.Array[String]): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteSplit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPasteSplit: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteSplit")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventSubmit(value: Boolean): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventSubmit: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveKeys(value: js.Array[Double]): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveKeys: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderInput(value: /* props */ RenderInputProps[Tag] => TagMod[Any]): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderInput: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInput")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderLayout(value: (/* tagElements */ js.Array[ReactElement], /* inputElement */ ReactElement) => ReactChild): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderLayout: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTag(value: /* props */ RenderTagProps[Tag] => TagMod[Any]): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTag: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTag")(js.undefined)
        ret
    }
    @scala.inline
    def withTagDisplayProp(value: /* keyof Tag */ String): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagDisplayProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagDisplayProp: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagDisplayProp")(js.undefined)
        ret
    }
    @scala.inline
    def withTagDisplayPropNull: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagDisplayProp")(null)
        ret
    }
    @scala.inline
    def withTagProps(value: TagProps): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagProps: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagProps")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRegex(value: js.RegExp): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRegex: Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRegex")(js.undefined)
        ret
    }
  }
  
}

