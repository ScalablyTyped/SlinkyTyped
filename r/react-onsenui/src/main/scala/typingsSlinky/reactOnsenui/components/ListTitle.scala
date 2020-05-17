package typingsSlinky.reactOnsenui.components

import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassNameClassNameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListTitle {
  @JSImport("react-onsenui", "ListTitle")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.ListTitle] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[_] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameClassNameId): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListTitle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

