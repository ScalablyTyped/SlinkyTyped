package typingsSlinky.reactDashTagDashInput.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.ReactChild
import typingsSlinky.reactDashTagDashInput.Anon_ActiveSuggestion
import typingsSlinky.reactDashTagDashInput.Anon_Id
import typingsSlinky.reactDashTagDashInput.reactDashTagDashInputMod.ReactTagsProps
import typingsSlinky.reactDashTagDashInput.reactDashTagDashInputMod.Tag
import typingsSlinky.reactDashTagDashInput.reactDashTagDashInputNumbers.`1`
import typingsSlinky.reactDashTagDashInput.reactDashTagDashInputStrings.`inline`
import typingsSlinky.reactDashTagDashInput.reactDashTagDashInputStrings.bottom
import typingsSlinky.reactDashTagDashInput.reactDashTagDashInputStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ReactTagsProps1362711866[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: id, name, placeholder, readOnly */
  def apply(
    handleAddition: Anon_Id => Unit,
    handleDelete: Double => Unit,
    allowAdditionFromPaste: js.UndefOr[Boolean] = js.undefined,
    allowDeleteFromEmptyInput: js.UndefOr[Boolean] = js.undefined,
    allowDragDrop: js.UndefOr[Boolean] = js.undefined,
    allowUnique: js.UndefOr[Boolean] = js.undefined,
    autocomplete: Boolean | `1` = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    classNames: Anon_ActiveSuggestion = null,
    delimiters: js.Array[Double] = null,
    handleDrag: (/* tag */ Anon_Id, /* currPos */ Double, /* newPos */ Double) => Unit = null,
    handleFilterSuggestions: (/* textInputValue */ String, /* possibleSuggestionsArray */ js.Array[Tag]) => js.Array[Tag] = null,
    handleInputBlur: /* textInputValue */ String => Unit = null,
    handleInputChange: /* value */ String => Unit = null,
    handleInputFocus: /* value */ String => Unit = null,
    handleTagClick: /* i */ Double => Unit = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inputFieldPosition: top | bottom | `inline` = null,
    inputValue: String = null,
    labelField: String = null,
    maxLength: Int | Double = null,
    minQueryLength: Int | Double = null,
    removeComponent: ReactComponentClass[_] = null,
    renderSuggestion: (/* tag */ Tag, /* query */ String) => ReactChild | Unit = null,
    resetInputOnDelete: js.UndefOr[Boolean] = js.undefined,
    shouldRenderSuggestions: /* query */ String => Boolean = null,
    suggestions: js.Array[Tag] = null,
    tags: js.Array[Tag] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    if (!js.isUndefined(allowAdditionFromPaste)) __obj.updateDynamic("allowAdditionFromPaste")(allowAdditionFromPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteFromEmptyInput)) __obj.updateDynamic("allowDeleteFromEmptyInput")(allowDeleteFromEmptyInput.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDragDrop)) __obj.updateDynamic("allowDragDrop")(allowDragDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnique)) __obj.updateDynamic("allowUnique")(allowUnique.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (handleDrag != null) __obj.updateDynamic("handleDrag")(js.Any.fromFunction3(handleDrag))
    if (handleFilterSuggestions != null) __obj.updateDynamic("handleFilterSuggestions")(js.Any.fromFunction2(handleFilterSuggestions))
    if (handleInputBlur != null) __obj.updateDynamic("handleInputBlur")(js.Any.fromFunction1(handleInputBlur))
    if (handleInputChange != null) __obj.updateDynamic("handleInputChange")(js.Any.fromFunction1(handleInputChange))
    if (handleInputFocus != null) __obj.updateDynamic("handleInputFocus")(js.Any.fromFunction1(handleInputFocus))
    if (handleTagClick != null) __obj.updateDynamic("handleTagClick")(js.Any.fromFunction1(handleTagClick))
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inputFieldPosition != null) __obj.updateDynamic("inputFieldPosition")(inputFieldPosition.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (labelField != null) __obj.updateDynamic("labelField")(labelField.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minQueryLength != null) __obj.updateDynamic("minQueryLength")(minQueryLength.asInstanceOf[js.Any])
    if (removeComponent != null) __obj.updateDynamic("removeComponent")(removeComponent.asInstanceOf[js.Any])
    if (renderSuggestion != null) __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction2(renderSuggestion))
    if (!js.isUndefined(resetInputOnDelete)) __obj.updateDynamic("resetInputOnDelete")(resetInputOnDelete.asInstanceOf[js.Any])
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1(shouldRenderSuggestions))
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactTagsProps
}

