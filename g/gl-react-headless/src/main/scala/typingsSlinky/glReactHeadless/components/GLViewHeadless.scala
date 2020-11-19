package typingsSlinky.glReactHeadless.components

import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glReactHeadless.glviewheadlessMod.GLViewHeadlessProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GLViewHeadless {
  
  @JSImport("gl-react-headless/GLViewHeadless", "GLViewHeadless")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.glReactHeadless.glviewheadlessMod.GLViewHeadless] {
    
    @scala.inline
    def onContextCreate(value: /* gl */ WebGLRenderingContext => Unit): this.type = set("onContextCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextFailure(value: /* e */ js.Error => Unit): this.type = set("onContextFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextLost(value: () => Unit): this.type = set("onContextLost", js.Any.fromFunction0(value))
    
    @scala.inline
    def onContextRestored(value: /* gl */ WebGLRenderingContext => Unit): this.type = set("onContextRestored", js.Any.fromFunction1(value))
    
    @scala.inline
    def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def webglContextAttributes(value: WebGLContextAttributes): this.type = set("webglContextAttributes", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GLViewHeadlessProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GLViewHeadlessProps]))
  }
}
