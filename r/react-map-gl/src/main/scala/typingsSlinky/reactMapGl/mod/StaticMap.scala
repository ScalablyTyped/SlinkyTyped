package typingsSlinky.reactMapGl.mod

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.GeometryObject
import typingsSlinky.mapboxGl.mod.Map
import typingsSlinky.mapboxGl.mod.PointLike
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "StaticMap")
@js.native
class StaticMap ()
  extends Component[StaticMapProps, js.Object, js.Any] {
  def getMap(): Map = js.native
  def queryRenderedFeatures(): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: js.Array[PointLike]): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: js.Array[PointLike], parameters: QueryRenderedFeaturesParams): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: PointLike): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: PointLike, parameters: QueryRenderedFeaturesParams): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
}

