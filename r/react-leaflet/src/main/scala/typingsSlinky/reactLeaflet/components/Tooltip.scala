package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.Tooltip_
import typingsSlinky.reactLeaflet.mod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Tooltip {
  @JSImport("react-leaflet", "Tooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: TooltipProps, E <: Tooltip_] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.Tooltip[js.Any, js.Any]]
  
  def apply[P <: TooltipProps, E <: Tooltip_](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: TooltipProps, E <: Tooltip_](companion: Tooltip.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

