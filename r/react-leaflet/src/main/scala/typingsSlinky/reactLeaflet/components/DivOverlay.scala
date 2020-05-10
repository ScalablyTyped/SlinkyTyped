package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLeaflet.mod.DivOverlayProps
import typingsSlinky.reactLeaflet.mod.DivOverlayTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object DivOverlay {
  @JSImport("react-leaflet", "DivOverlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: DivOverlayProps, E <: DivOverlayTypes] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.DivOverlay[js.Any, js.Any]]
  
  def apply[P <: DivOverlayProps, E <: DivOverlayTypes](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: DivOverlayProps, E <: DivOverlayTypes](companion: DivOverlay.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

