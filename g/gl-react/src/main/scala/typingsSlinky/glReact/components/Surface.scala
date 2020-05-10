package typingsSlinky.glReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glReact.mod.SurfaceProps
import typingsSlinky.glReact.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Surface {
  @JSImport("gl-react", "Surface")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.glReact.mod.Surface[js.Any]] {
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def onLoadError(value: /* e */ js.Error => Unit): this.type = set("onLoadError", js.Any.fromFunction1(value))
    @scala.inline
    def preload(value: js.Array[_]): this.type = set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def visitor(value: Visitor): this.type = set("visitor", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: SurfaceProps): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: Surface.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

