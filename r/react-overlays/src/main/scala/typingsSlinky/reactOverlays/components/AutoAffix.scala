package typingsSlinky.reactOverlays.components

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.reactOverlays.autoAffixMod.AutoAffixProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutoAffix {
  
  @JSImport("react-overlays", "AutoAffix")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.AutoAffix] {
    
    @scala.inline
    def affixClassName(value: String): this.type = set("affixClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def affixStyle(value: CSSProperties): this.type = set("affixStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bottomClassName(value: String): this.type = set("bottomClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bottomStyle(value: CSSProperties): this.type = set("bottomStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerElement(value: Element): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerFunction0(value: () => ReactInstance): this.type = set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def containerComponent(value: ReactComponentClass[js.Any]): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: ReactInstance | js.Function0[ReactInstance]): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetBottom(value: Double): this.type = set("offsetBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAffix(value: () => Unit): this.type = set("onAffix", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAffixBottom(value: () => Unit): this.type = set("onAffixBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAffixTop(value: () => Unit): this.type = set("onAffixTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAffixed(value: () => Unit): this.type = set("onAffixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAffixedBottom(value: () => Unit): this.type = set("onAffixedBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAffixedTop(value: () => Unit): this.type = set("onAffixedTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def topClassName(value: String): this.type = set("topClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def topStyle(value: CSSProperties): this.type = set("topStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewportOffsetTop(value: Double): this.type = set("viewportOffsetTop", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoAffixProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: AutoAffix.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
