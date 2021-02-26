package typingsSlinky.glReactExpo.components

import org.scalajs.dom.raw.WebGLRenderingContext
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glReactExpo.glviewnativeMod.GLViewNativeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GLViewNative {
  
  @JSImport("gl-react-expo/GLViewNative", "GLViewNative")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.glReactExpo.glviewnativeMod.GLViewNative] {
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onContextCreate(value: /* gl */ WebGLRenderingContext => Unit): this.type = set("onContextCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GLViewNative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GLViewNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
