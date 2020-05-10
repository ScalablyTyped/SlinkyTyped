package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameContentStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Page {
  @JSImport("react-onsenui", "Page")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Page] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentStyle(value: js.Any): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def onHide(value: () => Unit): this.type = set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def onInit(value: () => Unit): this.type = set("onInit", js.Any.fromFunction0(value))
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def renderBottomToolbar(value: () => Unit): this.type = set("renderBottomToolbar", js.Any.fromFunction0(value))
    @scala.inline
    def renderFixed(value: () => Unit): this.type = set("renderFixed", js.Any.fromFunction0(value))
    @scala.inline
    def renderModal(value: () => Unit): this.type = set("renderModal", js.Any.fromFunction0(value))
    @scala.inline
    def renderToolbar(value: () => Unit): this.type = set("renderToolbar", js.Any.fromFunction0(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameContentStyle): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Page.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

