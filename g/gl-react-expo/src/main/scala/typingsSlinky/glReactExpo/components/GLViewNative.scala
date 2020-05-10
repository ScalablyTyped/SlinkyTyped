package typingsSlinky.glReactExpo.components

import org.scalajs.dom.raw.WebGLRenderingContext
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glReactExpo.glviewnativeMod.GLViewNativeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GLViewNative {
  @JSImport("gl-react-expo/GLViewNative", "GLViewNative")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.glReactExpo.glviewnativeMod.GLViewNative] {
    @scala.inline
    def onContextCreate(value: /* gl */ WebGLRenderingContext => Unit): this.type = set("onContextCreate", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GLViewNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GLViewNative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

