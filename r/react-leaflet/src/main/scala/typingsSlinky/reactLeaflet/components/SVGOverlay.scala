package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.SVGOverlay_
import typingsSlinky.reactLeaflet.mod.SVGOverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object SVGOverlay {
  @JSImport("react-leaflet", "SVGOverlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: SVGOverlayProps, E <: SVGOverlay_] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.SVGOverlay[js.Any, js.Any]]
  
  def apply[P <: SVGOverlayProps, E <: SVGOverlay_](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: SVGOverlayProps, E <: SVGOverlay_](companion: SVGOverlay.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

