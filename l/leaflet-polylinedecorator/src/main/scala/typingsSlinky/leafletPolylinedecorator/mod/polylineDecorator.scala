package typingsSlinky.leafletPolylinedecorator.mod

import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "polylineDecorator")
@js.native
object polylineDecorator extends js.Object {
  
  def apply(
    paths: (Polyline_[LineString | MultiLineString, _]) | (js.Array[Polyline_[LineString | MultiLineString, _]]),
    options: js.UndefOr[PolylineDecoratorOptions]
  ): PolylineDecorator_ = js.native
}
