package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Tooltip {
  @JSImport("react-leaflet", "Tooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactLeaflet.mod.AttributionControlProps */ P, /* <: typingsSlinky.leaflet.mod.Control_.Attribution */ E] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.Tooltip[P, E]]
  
  def apply[/* <: typingsSlinky.reactLeaflet.mod.TooltipProps */ P, /* <: typingsSlinky.leaflet.mod.Tooltip_ */ E](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.reactLeaflet.mod.TooltipProps */ P, /* <: typingsSlinky.leaflet.mod.Tooltip_ */ E](companion: Tooltip.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

