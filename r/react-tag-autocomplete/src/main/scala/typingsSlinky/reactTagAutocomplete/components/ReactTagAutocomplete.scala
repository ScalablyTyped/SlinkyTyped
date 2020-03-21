package typingsSlinky.reactTagAutocomplete.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactTagAutocomplete.mod.ClassNames
import typingsSlinky.reactTagAutocomplete.mod.ReactTagsProps
import typingsSlinky.reactTagAutocomplete.mod.Tag
import typingsSlinky.reactTagAutocomplete.mod.TagComponentProps
import typingsSlinky.reactTagAutocomplete.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTagAutocomplete
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-tag-autocomplete", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: placeholder */
  def apply(
    handleAddition: Tag => Unit,
    handleDelete: Double => Unit,
    addOnBlur: js.UndefOr[Boolean] = js.undefined,
    allowBackspace: js.UndefOr[Boolean] = js.undefined,
    allowNew: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    autoresize: js.UndefOr[Boolean] = js.undefined,
    classNames: ClassNames = null,
    clearInputOnDelete: js.UndefOr[Boolean] = js.undefined,
    delimiterChars: js.Array[String] = null,
    delimiters: js.Array[Double] = null,
    handleBlur: () => Unit = null,
    handleFocus: () => Unit = null,
    handleInputChange: /* input */ String => Unit = null,
    handleValidate: /* tag */ Tag => Boolean = null,
    maxSuggestionsLength: Int | Double = null,
    minQueryLength: Int | Double = null,
    noSuggestionsText: String = null,
    suggestions: js.Array[Tag] = null,
    suggestionsFilter: (/* suggestion */ Tag, /* query */ String) => Boolean = null,
    tagComponent: ReactComponentClass[TagComponentProps] = null,
    tags: js.Array[Tag] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBackspace)) __obj.updateDynamic("allowBackspace")(allowBackspace.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNew)) __obj.updateDynamic("allowNew")(allowNew.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autoresize)) __obj.updateDynamic("autoresize")(autoresize.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(clearInputOnDelete)) __obj.updateDynamic("clearInputOnDelete")(clearInputOnDelete.asInstanceOf[js.Any])
    if (delimiterChars != null) __obj.updateDynamic("delimiterChars")(delimiterChars.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (handleBlur != null) __obj.updateDynamic("handleBlur")(js.Any.fromFunction0(handleBlur))
    if (handleFocus != null) __obj.updateDynamic("handleFocus")(js.Any.fromFunction0(handleFocus))
    if (handleInputChange != null) __obj.updateDynamic("handleInputChange")(js.Any.fromFunction1(handleInputChange))
    if (handleValidate != null) __obj.updateDynamic("handleValidate")(js.Any.fromFunction1(handleValidate))
    if (maxSuggestionsLength != null) __obj.updateDynamic("maxSuggestionsLength")(maxSuggestionsLength.asInstanceOf[js.Any])
    if (minQueryLength != null) __obj.updateDynamic("minQueryLength")(minQueryLength.asInstanceOf[js.Any])
    if (noSuggestionsText != null) __obj.updateDynamic("noSuggestionsText")(noSuggestionsText.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (suggestionsFilter != null) __obj.updateDynamic("suggestionsFilter")(js.Any.fromFunction2(suggestionsFilter))
    if (tagComponent != null) __obj.updateDynamic("tagComponent")(tagComponent.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactTagsProps
}

