package typingsSlinky.reactLeafletMarkercluster.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLeafletMarkercluster.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object ReactLeafletMarkercluster {
  @JSImport("react-leaflet-markercluster", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactLeafletMarkercluster.mod.MarkerClusterGroupProps */ P] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[P]]
  
  def apply[/* <: typingsSlinky.reactLeafletMarkercluster.mod.MarkerClusterGroupProps */ P](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.reactLeafletMarkercluster.mod.MarkerClusterGroupProps */ P](companion: ReactLeafletMarkercluster.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}

