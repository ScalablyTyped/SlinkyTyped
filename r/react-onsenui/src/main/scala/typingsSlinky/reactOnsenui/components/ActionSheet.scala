package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassNameIsDisabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionSheet {
  
  @JSImport("react-onsenui", "ActionSheet")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.ActionSheet] {
    
    @scala.inline
    def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationOptions(value: js.Object): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isCancelable(value: Boolean): this.type = set("isCancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskColor(value: String): this.type = set("maskColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCancel(value: () => Unit): this.type = set("onCancel", js.Any.fromFunction0(value))
    
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
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameIsDisabled): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ActionSheet.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
