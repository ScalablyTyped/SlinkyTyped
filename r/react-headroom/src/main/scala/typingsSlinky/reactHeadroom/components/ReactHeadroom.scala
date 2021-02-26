package typingsSlinky.reactHeadroom.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactHeadroom.mod.ReactHeadroomProps
import typingsSlinky.reactHeadroom.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHeadroom {
  
  @JSImport("react-headroom", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def calcHeightOnResize(value: Boolean): this.type = set("calcHeightOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableInlineStyles(value: Boolean): this.type = set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def downTolerance(value: Double): this.type = set("downTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPin(value: () => Unit): this.type = set("onPin", js.Any.fromFunction0(value))
    
    @scala.inline
    def onUnfix(value: () => Unit): this.type = set("onUnfix", js.Any.fromFunction0(value))
    
    @scala.inline
    def onUnpin(value: () => Unit): this.type = set("onUnpin", js.Any.fromFunction0(value))
    
    @scala.inline
    def parent(value: () => _): this.type = set("parent", js.Any.fromFunction0(value))
    
    @scala.inline
    def pinStart(value: Double): this.type = set("pinStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def upTolerance(value: Double): this.type = set("upTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactHeadroom.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactHeadroomProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
