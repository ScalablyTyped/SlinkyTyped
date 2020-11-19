package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassNameFixedContent
import typingsSlinky.reactOnsenui.mod.PullHookChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullHook {
  
  @JSImport("react-onsenui", "PullHook")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.PullHook] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixedContent(value: Boolean): this.type = set("fixedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* e */ PullHookChangeEvent => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: /* done */ js.Function0[Unit] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPull(value: () => Unit): this.type = set("onPull", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thresholdHeight(value: Double): this.type = set("thresholdHeight", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameFixedContent): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PullHook.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
