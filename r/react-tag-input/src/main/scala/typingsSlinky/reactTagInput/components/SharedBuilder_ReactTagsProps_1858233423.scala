package typingsSlinky.reactTagInput.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.reactTagInput.anon.ActiveSuggestion
import typingsSlinky.reactTagInput.anon.Id
import typingsSlinky.reactTagInput.mod.Tag
import typingsSlinky.reactTagInput.reactTagInputNumbers.`1`
import typingsSlinky.reactTagInput.reactTagInputStrings.`inline`
import typingsSlinky.reactTagInput.reactTagInputStrings.bottom
import typingsSlinky.reactTagInput.reactTagInputStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ReactTagsProps_1858233423[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def allowAdditionFromPaste(value: Boolean): this.type = set("allowAdditionFromPaste", value.asInstanceOf[js.Any])
  @scala.inline
  def allowDeleteFromEmptyInput(value: Boolean): this.type = set("allowDeleteFromEmptyInput", value.asInstanceOf[js.Any])
  @scala.inline
  def allowDragDrop(value: Boolean): this.type = set("allowDragDrop", value.asInstanceOf[js.Any])
  @scala.inline
  def allowUnique(value: Boolean): this.type = set("allowUnique", value.asInstanceOf[js.Any])
  @scala.inline
  def autocomplete(value: Boolean | `1`): this.type = set("autocomplete", value.asInstanceOf[js.Any])
  @scala.inline
  def autofocus(value: Boolean): this.type = set("autofocus", value.asInstanceOf[js.Any])
  @scala.inline
  def classNames(value: ActiveSuggestion): this.type = set("classNames", value.asInstanceOf[js.Any])
  @scala.inline
  def delimitersVarargs(value: Double*): this.type = set("delimiters", js.Array(value :_*))
  @scala.inline
  def delimiters(value: js.Array[Double]): this.type = set("delimiters", value.asInstanceOf[js.Any])
  @scala.inline
  def handleDrag(value: (/* tag */ Id, /* currPos */ Double, /* newPos */ Double) => Unit): this.type = set("handleDrag", js.Any.fromFunction3(value))
  @scala.inline
  def handleFilterSuggestions(
    value: (/* textInputValue */ String, /* possibleSuggestionsArray */ js.Array[Tag]) => js.Array[Tag]
  ): this.type = set("handleFilterSuggestions", js.Any.fromFunction2(value))
  @scala.inline
  def handleInputBlur(value: /* textInputValue */ String => Unit): this.type = set("handleInputBlur", js.Any.fromFunction1(value))
  @scala.inline
  def handleInputChange(value: /* value */ String => Unit): this.type = set("handleInputChange", js.Any.fromFunction1(value))
  @scala.inline
  def handleInputFocus(value: /* value */ String => Unit): this.type = set("handleInputFocus", js.Any.fromFunction1(value))
  @scala.inline
  def handleTagClick(value: /* i */ Double => Unit): this.type = set("handleTagClick", js.Any.fromFunction1(value))
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  @scala.inline
  def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
  @scala.inline
  def inputFieldPosition(value: top | bottom | `inline`): this.type = set("inputFieldPosition", value.asInstanceOf[js.Any])
  @scala.inline
  def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
  @scala.inline
  def labelField(value: String): this.type = set("labelField", value.asInstanceOf[js.Any])
  @scala.inline
  def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
  @scala.inline
  def minQueryLength(value: Double): this.type = set("minQueryLength", value.asInstanceOf[js.Any])
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  @scala.inline
  def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  @scala.inline
  def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  @scala.inline
  def removeComponent(value: ReactComponentClass[_]): this.type = set("removeComponent", value.asInstanceOf[js.Any])
  @scala.inline
  def renderSuggestion(value: (/* tag */ Tag, /* query */ String) => ReactChild | Unit): this.type = set("renderSuggestion", js.Any.fromFunction2(value))
  @scala.inline
  def resetInputOnDelete(value: Boolean): this.type = set("resetInputOnDelete", value.asInstanceOf[js.Any])
  @scala.inline
  def shouldRenderSuggestions(value: /* query */ String => Boolean): this.type = set("shouldRenderSuggestions", js.Any.fromFunction1(value))
  @scala.inline
  def suggestionsVarargs(value: Tag*): this.type = set("suggestions", js.Array(value :_*))
  @scala.inline
  def suggestions(value: js.Array[Tag]): this.type = set("suggestions", value.asInstanceOf[js.Any])
  @scala.inline
  def tagsVarargs(value: Tag*): this.type = set("tags", js.Array(value :_*))
  @scala.inline
  def tags(value: js.Array[Tag]): this.type = set("tags", value.asInstanceOf[js.Any])
}

