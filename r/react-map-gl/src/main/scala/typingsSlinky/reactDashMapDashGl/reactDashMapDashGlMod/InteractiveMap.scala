package typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod

import typingsSlinky.geojson.geojsonMod.Feature
import typingsSlinky.geojson.geojsonMod.GeoJsonProperties
import typingsSlinky.geojson.geojsonMod.GeometryObject
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.Map
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.PointLike
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "InteractiveMap")
@js.native
class InteractiveMap ()
  extends Component[InteractiveMapProps, js.Object, js.Any] {
  def getMap(): Map = js.native
  def queryRenderedFeatures(): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: js.Array[PointLike]): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: js.Array[PointLike], parameters: QueryRenderedFeaturesParams): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: PointLike): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: PointLike, parameters: QueryRenderedFeaturesParams): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
}

