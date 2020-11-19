package typingsSlinky.reactSpring.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringConfig
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spring {
  
  @JSImport("react-spring/renderprops", "Spring")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[DS /* <: js.Object */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSpring.renderpropsMod.Spring[DS]] {
    
    @scala.inline
    def after(value: Partial[DS]): this.type = set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: DS => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def configFunction1(value: /* key */ String => SpringConfig): this.type = set("config", js.Any.fromFunction1(value))
    
    @scala.inline
    def config(value: SpringConfig | (js.Function1[/* key */ String, SpringConfig])): this.type = set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def force(value: Boolean): this.type = set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def from(value: Partial[DS]): this.type = set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def immediateFunction1(value: /* key */ String => Boolean): this.type = set("immediate", js.Any.fromFunction1(value))
    
    @scala.inline
    def immediate(value: Boolean | (js.Function1[/* key */ String, Boolean])): this.type = set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inject(value: js.Any): this.type = set("inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def native(value: Boolean): this.type = set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFrame(value: DS => Unit): this.type = set("onFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRest(value: DS => Unit): this.type = set("onRest", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStart(value: () => Unit): this.type = set("onStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def reset(value: Boolean): this.type = set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def to(value: DS): this.type = set("to", value.asInstanceOf[js.Any])
  }
  
  def withProps[DS /* <: js.Object */](p: SpringProps[DS]): Builder[DS] = new Builder[DS](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[DS /* <: js.Object */](): Builder[DS] = {
    val __props = js.Dynamic.literal()
    new Builder[DS](js.Array(this.component, __props.asInstanceOf[SpringProps[DS]]))
  }
  
  implicit def make[DS /* <: js.Object */](companion: Spring.type): Builder[DS] = new Builder[DS](js.Array(this.component, js.Dictionary.empty))()
}
