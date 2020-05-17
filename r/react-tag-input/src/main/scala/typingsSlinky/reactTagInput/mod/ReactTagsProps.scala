package typingsSlinky.reactTagInput.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.reactTagInput.anon.ActiveSuggestion
import typingsSlinky.reactTagInput.anon.Id
import typingsSlinky.reactTagInput.reactTagInputNumbers.`1`
import typingsSlinky.reactTagInput.reactTagInputStrings.`inline`
import typingsSlinky.reactTagInput.reactTagInputStrings.bottom
import typingsSlinky.reactTagInput.reactTagInputStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTagsProps extends js.Object {
  var allowAdditionFromPaste: js.UndefOr[Boolean] = js.native
  var allowDeleteFromEmptyInput: js.UndefOr[Boolean] = js.native
  var allowDragDrop: js.UndefOr[Boolean] = js.native
  var allowUnique: js.UndefOr[Boolean] = js.native
  var autocomplete: js.UndefOr[Boolean | `1`] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var classNames: js.UndefOr[ActiveSuggestion] = js.native
  var delimiters: js.UndefOr[js.Array[Double]] = js.native
  var handleDrag: js.UndefOr[js.Function3[/* tag */ Id, /* currPos */ Double, /* newPos */ Double, Unit]] = js.native
  var handleFilterSuggestions: js.UndefOr[
    js.Function2[
      /* textInputValue */ String, 
      /* possibleSuggestionsArray */ js.Array[Tag], 
      js.Array[Tag]
    ]
  ] = js.native
  var handleInputBlur: js.UndefOr[js.Function1[/* textInputValue */ String, Unit]] = js.native
  var handleInputChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var handleInputFocus: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var handleTagClick: js.UndefOr[js.Function1[/* i */ Double, Unit]] = js.native
  var id: js.UndefOr[String] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var inputFieldPosition: js.UndefOr[top | bottom | `inline`] = js.native
  var inputValue: js.UndefOr[String] = js.native
  var labelField: js.UndefOr[String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var minQueryLength: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var removeComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  var renderSuggestion: js.UndefOr[js.Function2[/* tag */ Tag, /* query */ String, ReactChild | Unit]] = js.native
  var resetInputOnDelete: js.UndefOr[Boolean] = js.native
  var shouldRenderSuggestions: js.UndefOr[js.Function1[/* query */ String, Boolean]] = js.native
  var suggestions: js.UndefOr[js.Array[Tag]] = js.native
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  def handleAddition(tag: Id): Unit = js.native
  def handleDelete(i: Double): Unit = js.native
}

object ReactTagsProps {
  @scala.inline
  def apply(handleAddition: Id => Unit, handleDelete: Double => Unit): ReactTagsProps = {
    val __obj = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    __obj.asInstanceOf[ReactTagsProps]
  }
  @scala.inline
  implicit class ReactTagsPropsOps[Self <: ReactTagsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleAddition(value: Id => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleAddition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleDelete(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAllowAdditionFromPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdditionFromPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAdditionFromPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdditionFromPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeleteFromEmptyInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteFromEmptyInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleteFromEmptyInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteFromEmptyInput")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDragDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUnique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnique")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocomplete(value: Boolean | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNames(value: ActiveSuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiters(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleDrag(value: (/* tag */ Id, /* currPos */ Double, /* newPos */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDrag")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandleDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleFilterSuggestions(
      value: (/* textInputValue */ String, /* possibleSuggestionsArray */ js.Array[Tag]) => js.Array[Tag]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFilterSuggestions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHandleFilterSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFilterSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleInputBlur(value: /* textInputValue */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleInputBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleInputBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleInputBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleInputChange(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleInputChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleInputChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleInputChange")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleInputFocus(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleInputFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleInputFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleInputFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleTagClick(value: /* i */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTagClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleTagClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTagClick")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFieldPosition(value: top | bottom | `inline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFieldPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFieldPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFieldPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelField")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinQueryLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minQueryLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinQueryLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minQueryLength")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSuggestion(value: (/* tag */ Tag, /* query */ String) => ReactChild | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuggestion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withResetInputOnDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetInputOnDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetInputOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetInputOnDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRenderSuggestions(value: /* query */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldRenderSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRenderSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

