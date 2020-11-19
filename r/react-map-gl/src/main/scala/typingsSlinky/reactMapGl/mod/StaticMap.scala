package typingsSlinky.reactMapGl.mod

import typingsSlinky.mapboxGl.mod.Map
import typingsSlinky.mapboxGl.mod.MapboxGeoJSONFeature
import typingsSlinky.mapboxGl.mod.PointLike
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-map-gl", "StaticMap")
@js.native
class StaticMap ()
  extends Component[StaticMapProps, js.Object, js.Any] {
  
  def getMap(): Map = js.native
  
  def queryRenderedFeatures(): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: js.UndefOr[PointLike], parameters: QueryRenderedFeaturesParams): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: js.Tuple2[PointLike, PointLike]): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: js.Tuple2[PointLike, PointLike], parameters: QueryRenderedFeaturesParams): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: PointLike): js.Array[MapboxGeoJSONFeature] = js.native
}
