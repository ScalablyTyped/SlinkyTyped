package typingsSlinky.d3Geo.mod

import typingsSlinky.geojson.mod.GeoJsonObject
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.GeoJsonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedFeature[GeometryType /* <: GeoGeometryObjects | Null */, Properties /* <: GeoJsonProperties */]
  extends GeoJsonObject
     with GeoPermissibleObjects {
  var geometry: GeometryType = js.native
  var id: js.UndefOr[String | Double] = js.native
  var properties: Properties = js.native
}

object ExtendedFeature {
  @scala.inline
  def apply[GeometryType, Properties](geometry: GeometryType, properties: Properties, `type`: GeoJsonTypes): ExtendedFeature[GeometryType, Properties] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedFeature[GeometryType, Properties]]
  }
  @scala.inline
  implicit class ExtendedFeatureOps[Self[geometrytype, properties] <: ExtendedFeature[geometrytype, properties], GeometryType, Properties] (val x: Self[GeometryType, Properties]) extends AnyVal {
    @scala.inline
    def duplicate: Self[GeometryType, Properties] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[GeometryType, Properties]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[GeometryType, Properties]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[GeometryType, Properties]) with Other]
    @scala.inline
    def withGeometry(value: GeometryType): Self[GeometryType, Properties] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: Properties): Self[GeometryType, Properties] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self[GeometryType, Properties] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[GeometryType, Properties] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

