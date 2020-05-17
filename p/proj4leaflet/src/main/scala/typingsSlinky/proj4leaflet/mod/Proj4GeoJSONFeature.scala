package typingsSlinky.proj4leaflet.mod

import typingsSlinky.geojson.mod.BBox
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.GeometryObject
import typingsSlinky.proj4leaflet.anon.Properties
import typingsSlinky.proj4leaflet.proj4leafletStrings.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined geojson.geojson.Feature<geojson.geojson.GeometryObject, geojson.geojson.GeoJsonProperties> & {  crs ? :{  type  :string,   properties  :{  name  :string}}} */
@js.native
trait Proj4GeoJSONFeature extends js.Object {
  /**
    * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
    * The value of the bbox member is an array of length 2*n where n is the number of dimensions
    * represented in the contained geometries, with all axes of the most southwesterly point
    * followed by all axes of the more northeasterly point.
    * The axes order of a bbox follows the axes order of geometries.
    * https://tools.ietf.org/html/rfc7946#section-5
    */
  var bbox: js.UndefOr[BBox] = js.native
  var crs: js.UndefOr[Properties] = js.native
  /**
    * The feature's geometry
    */
  var geometry: GeometryObject = js.native
  /**
    * A value that uniquely identifies this feature in a
    * https://tools.ietf.org/html/rfc7946#section-3.2.
    */
  var id: js.UndefOr[String | Double] = js.native
  /**
    * Properties associated with this feature.
    */
  var properties: GeoJsonProperties = js.native
  var `type`: Feature = js.native
}

object Proj4GeoJSONFeature {
  @scala.inline
  def apply(geometry: GeometryObject, `type`: Feature): Proj4GeoJSONFeature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proj4GeoJSONFeature]
  }
  @scala.inline
  implicit class Proj4GeoJSONFeatureOps[Self <: Proj4GeoJSONFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: GeometryObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBbox(value: BBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(js.undefined)
        ret
    }
    @scala.inline
    def withCrs(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: GeoJsonProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertiesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(null)
        ret
    }
  }
  
}

