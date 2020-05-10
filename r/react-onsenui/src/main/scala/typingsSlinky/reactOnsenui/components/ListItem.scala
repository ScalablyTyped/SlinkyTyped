package typingsSlinky.reactOnsenui.components

import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameExpandable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  @JSImport("react-onsenui", "ListItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.ListItem] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def expanded(value: Boolean): this.type = set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def lockOnDrag(value: Boolean): this.type = set("lockOnDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[_] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tapBackgroundColor(value: String): this.type = set("tapBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tappable(value: Boolean): this.type = set("tappable", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameExpandable): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

