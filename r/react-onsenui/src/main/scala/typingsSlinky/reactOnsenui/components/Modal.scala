package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameIsOpen
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.fade
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.lift
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  @JSImport("react-onsenui", "Modal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Modal] {
    @scala.inline
    def animation(value: fade | lift | none): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def onDeviceBackButton(value: () => Unit): this.type = set("onDeviceBackButton", js.Any.fromFunction0(value))
    @scala.inline
    def onPostHide(value: () => Unit): this.type = set("onPostHide", js.Any.fromFunction0(value))
    @scala.inline
    def onPostShow(value: () => Unit): this.type = set("onPostShow", js.Any.fromFunction0(value))
    @scala.inline
    def onPreHide(value: () => Unit): this.type = set("onPreHide", js.Any.fromFunction0(value))
    @scala.inline
    def onPreShow(value: () => Unit): this.type = set("onPreShow", js.Any.fromFunction0(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameIsOpen): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

