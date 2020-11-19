package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.leaflet.mod.Polyline_
import typingsSlinky.reactLeaflet.mod.PolylineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Polyline {
  
  @JSImport("react-leaflet", "Polyline")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P /* <: PolylineProps */, E /* <: Polyline_[LineString | MultiLineString, js.Any] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.Polyline[P, E]]
  
  def apply[P /* <: PolylineProps */, E /* <: Polyline_[LineString | MultiLineString, js.Any] */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[P /* <: PolylineProps */, E /* <: Polyline_[LineString | MultiLineString, js.Any] */](companion: Polyline.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
