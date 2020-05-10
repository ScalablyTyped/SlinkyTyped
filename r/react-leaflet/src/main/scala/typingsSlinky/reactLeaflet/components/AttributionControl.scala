package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.Control_.Attribution
import typingsSlinky.reactLeaflet.mod.AttributionControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object AttributionControl {
  @JSImport("react-leaflet", "AttributionControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: AttributionControlProps, E <: Attribution] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.AttributionControl[js.Any, js.Any]]
  
  def apply[P <: AttributionControlProps, E <: Attribution](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: AttributionControlProps, E <: Attribution](companion: AttributionControl.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

