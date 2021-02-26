package typingsSlinky.glReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glReact.mod.SurfaceProps
import typingsSlinky.glReact.mod.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Surface {
  
  @JSImport("gl-react-native", "Surface")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.glReactNative.mod.Surface] {
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLoadError(value: /* e */ js.Error => Unit): this.type = set("onLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def preload(value: js.Array[_]): this.type = set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preloadVarargs(value: js.Any*): this.type = set("preload", js.Array(value :_*))
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visitor(value: Visitor): this.type = set("visitor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Surface.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SurfaceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
