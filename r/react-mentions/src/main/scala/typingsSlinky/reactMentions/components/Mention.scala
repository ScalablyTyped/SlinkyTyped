package typingsSlinky.reactMentions.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMentions.mod.DataFunc
import typingsSlinky.reactMentions.mod.MentionProps
import typingsSlinky.reactMentions.mod.SuggestionDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mention {
  @JSImport("react-mentions", "Mention")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def appendSpaceOnAdd(value: Boolean): this.type = set("appendSpaceOnAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def displayTransform(value: (/* id */ String, /* display */ String) => String): this.type = set("displayTransform", js.Any.fromFunction2(value))
    @scala.inline
    def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def markup(value: String): this.type = set("markup", value.asInstanceOf[js.Any])
    @scala.inline
    def onAdd(value: (/* id */ String | Double, /* display */ String) => Unit): this.type = set("onAdd", js.Any.fromFunction2(value))
    @scala.inline
    def regex(value: js.RegExp): this.type = set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def renderSuggestion(
      value: (/* suggestion */ SuggestionDataItem, /* search */ String, /* highlightedDisplay */ ReactElement, /* index */ Double, /* focused */ Boolean) => ReactElement
    ): this.type = set("renderSuggestion", js.Any.fromFunction5(value))
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MentionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[SuggestionDataItem] | DataFunc, trigger: String | js.RegExp): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MentionProps]))
  }
}

