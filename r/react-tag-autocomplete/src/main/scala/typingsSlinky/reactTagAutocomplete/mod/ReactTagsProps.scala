package typingsSlinky.reactTagAutocomplete.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTagsProps extends js.Object {
  /**
    * Creates a tag from the current input value when focus on the input is lost. Default: false.
    */
  var addOnBlur: js.UndefOr[Boolean] = js.native
  /**
    * Disables ability to delete the selected tags when backspace is pressed while focussed on the text input. Default: true.
    */
  var allowBackspace: js.UndefOr[Boolean] = js.native
  /**
    * Allows users to add new (not suggested) tags. Default: false.
    */
  var allowNew: js.UndefOr[Boolean] = js.native
  /**
    * Boolean parameter to control whether the text-input should be autofocused on mount. Default: true.
    */
  var autofocus: js.UndefOr[Boolean] = js.native
  /**
    * Boolean parameter to control whether the text-input should be automatically resized to fit its value. Default: true.
    */
  var autoresize: js.UndefOr[Boolean] = js.native
  var classNames: js.UndefOr[ClassNames] = js.native
  /**
    * Clear the text input when a tag is deleted. Default: true.
    */
  var clearInputOnDelete: js.UndefOr[Boolean] = js.native
  /**
    * Array of characters matching keyboard event key values. This is useful when needing to support a specific character irrespective of the keyboard layout.
    * Note, that this list is separate from the one specified by the delimiters option, so you'll need to set the value there to [],
    * if you wish to disable those keys. Example usage: delimiterChars={[',', ' ']}. Default: []
    */
  var delimiterChars: js.UndefOr[js.Array[String]] = js.native
  /**
    * Array of integers matching keyboard event keyCode values. When a corresponding key is pressed, the preceding string is finalised as tag. Default: [9, 13] (Tab and return keys).
    */
  var delimiters: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Optional event handler when focus on the input is lost. Receives no arguments.
    */
  var handleBlur: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional event handler when the input receives focus. Receives no arguments.
    */
  var handleFocus: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional event handler when the input changes. Receives the current input value.
    */
  var handleInputChange: js.UndefOr[js.Function1[/* input */ String, Unit]] = js.native
  /**
    * Optional validation function that determines if tag should be added to tags. Receives a tag object. Should return a boolean.
    */
  var handleValidate: js.UndefOr[js.Function1[/* tag */ Tag, Boolean]] = js.native
  /**
    * An object containing additional attributes that will be applied to the underlying <input /> field.
    */
  var inputAttributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Maximum number of suggestions to display. Default: 6.
    */
  var maxSuggestionsLength: js.UndefOr[Double] = js.native
  /**
    * How many characters are needed for suggestions to appear. Default: 2.
    */
  var minQueryLength: js.UndefOr[Double] = js.native
  /**
    * Message shown if there are no matching suggestions. Default: null.
    */
  var noSuggestionsText: js.UndefOr[String] = js.native
  /**
    * The placeholder string shown for the input. Default: 'Add new tag'.
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * An array of suggestions that are used as basis for showing suggestions. Each suggestion must have an id and a name property and an optional disabled property. Default: []
    */
  var suggestions: js.UndefOr[js.Array[Tag]] = js.native
  /**
    * A callback function to filter suggestion items with. The callback receives two arguments; a suggestion and the current query and must return a boolean value.
    * If no function is supplied the default filter is applied. Default: null.
    */
  var suggestionsFilter: js.UndefOr[js.Function2[/* suggestion */ Tag, /* query */ String, Boolean]] = js.native
  /**
    * Provide a custom tag component to render. Default: null.
    */
  var tagComponent: js.UndefOr[ReactComponentClass[TagComponentProps]] = js.native
  /**
    * An array of tags that are displayed as pre-selected. Each tag must have an id and a name property. Default: []
    */
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  /**
    * Function called when the user wants to add a tag. Receives the tag
    */
  def handleAddition(tag: Tag): Unit = js.native
  /**
    * Function called when the user wants to delete a tag. Receives the tag index.
    */
  def handleDelete(index: Double): Unit = js.native
}

object ReactTagsProps {
  @scala.inline
  def apply(handleAddition: Tag => Unit, handleDelete: Double => Unit): ReactTagsProps = {
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
    def withHandleAddition(value: Tag => Unit): Self = {
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
    def withAddOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowBackspace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBackspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowBackspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBackspace")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowNew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNew")(js.undefined)
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
    def withAutoresize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoresize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoresize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoresize")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNames(value: ClassNames): Self = {
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
    def withClearInputOnDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInputOnDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearInputOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInputOnDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiterChars(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterChars")(js.undefined)
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
    def withHandleBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHandleBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHandleFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleInputChange(value: /* input */ String => Unit): Self = {
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
    def withHandleValidate(value: /* tag */ Tag => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleValidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withInputAttributes(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSuggestionsLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuggestionsLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSuggestionsLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuggestionsLength")(js.undefined)
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
    def withNoSuggestionsText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSuggestionsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSuggestionsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSuggestionsText")(js.undefined)
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
    def withSuggestionsFilter(value: (/* suggestion */ Tag, /* query */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSuggestionsFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withTagComponent(value: ReactComponentClass[TagComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagComponent")(js.undefined)
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

