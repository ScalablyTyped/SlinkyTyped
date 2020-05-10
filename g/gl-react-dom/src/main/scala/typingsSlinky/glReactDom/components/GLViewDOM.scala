package typingsSlinky.glReactDom.components

import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glReactDom.glviewdomMod.GLViewDOMProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GLViewDOM {
  @JSImport("gl-react-dom/GLViewDOM", "GLViewDOM")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.glReactDom.glviewdomMod.GLViewDOM] {
    @scala.inline
    def debug(value: Double): this.type = set("debug", value.asInstanceOf[js.Any])
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
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def webglContextAttributes(value: WebGLContextAttributes): this.type = set("webglContextAttributes", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GLViewDOMProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GLViewDOMProps]))
  }
}

