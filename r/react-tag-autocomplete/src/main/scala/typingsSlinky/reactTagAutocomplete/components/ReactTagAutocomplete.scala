package typingsSlinky.reactTagAutocomplete.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTagAutocomplete.mod.ClassNames
import typingsSlinky.reactTagAutocomplete.mod.ReactTagsProps
import typingsSlinky.reactTagAutocomplete.mod.Tag
import typingsSlinky.reactTagAutocomplete.mod.TagComponentProps
import typingsSlinky.reactTagAutocomplete.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTagAutocomplete {
  @JSImport("react-tag-autocomplete", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def addOnBlur(value: Boolean): this.type = set("addOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def allowBackspace(value: Boolean): this.type = set("allowBackspace", value.asInstanceOf[js.Any])
    @scala.inline
    def allowNew(value: Boolean): this.type = set("allowNew", value.asInstanceOf[js.Any])
    @scala.inline
    def autofocus(value: Boolean): this.type = set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def autoresize(value: Boolean): this.type = set("autoresize", value.asInstanceOf[js.Any])
    @scala.inline
    def classNames(value: ClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def clearInputOnDelete(value: Boolean): this.type = set("clearInputOnDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def delimiterChars(value: js.Array[String]): this.type = set("delimiterChars", value.asInstanceOf[js.Any])
    @scala.inline
    def delimiters(value: js.Array[Double]): this.type = set("delimiters", value.asInstanceOf[js.Any])
    @scala.inline
    def handleBlur(value: () => Unit): this.type = set("handleBlur", js.Any.fromFunction0(value))
    @scala.inline
    def handleFocus(value: () => Unit): this.type = set("handleFocus", js.Any.fromFunction0(value))
    @scala.inline
    def handleInputChange(value: /* input */ String => Unit): this.type = set("handleInputChange", js.Any.fromFunction1(value))
    @scala.inline
    def handleValidate(value: /* tag */ Tag => Boolean): this.type = set("handleValidate", js.Any.fromFunction1(value))
    @scala.inline
    def maxSuggestionsLength(value: Double): this.type = set("maxSuggestionsLength", value.asInstanceOf[js.Any])
    @scala.inline
    def minQueryLength(value: Double): this.type = set("minQueryLength", value.asInstanceOf[js.Any])
    @scala.inline
    def noSuggestionsText(value: String): this.type = set("noSuggestionsText", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestions(value: js.Array[Tag]): this.type = set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestionsFilter(value: (/* suggestion */ Tag, /* query */ String) => Boolean): this.type = set("suggestionsFilter", js.Any.fromFunction2(value))
    @scala.inline
    def tagComponent(value: ReactComponentClass[TagComponentProps]): this.type = set("tagComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def tags(value: js.Array[Tag]): this.type = set("tags", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactTagsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(handleAddition: Tag => Unit, handleDelete: Double => Unit): Builder = {
    val __props = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactTagsProps]))
  }
}

