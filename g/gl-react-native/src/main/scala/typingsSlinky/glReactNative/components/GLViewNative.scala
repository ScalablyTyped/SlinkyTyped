package typingsSlinky.glReactNative.components

import org.scalajs.dom.raw.WebGLRenderingContext
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glReactNative.glviewnativeMod.GLViewNativeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GLViewNative {
  
  @JSImport("gl-react-native/GLViewNative", "GLViewNative")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.glReactNative.glviewnativeMod.GLViewNative] {
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onContextCreate(value: /* gl */ WebGLRenderingContext => Unit): this.type = set("onContextCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextFailure(value: /* e */ js.Error => Unit): this.type = set("onContextFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GLViewNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GLViewNative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
