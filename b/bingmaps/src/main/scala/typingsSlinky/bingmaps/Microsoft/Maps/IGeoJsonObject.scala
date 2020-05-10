package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoJsonObject extends js.Object {
  /** Geometric coordinates of the object */
  var coordinates: js.UndefOr[js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]] = js.native
  /** Set of features (only applicable if the type is 'featurecollection') */
  var features: js.UndefOr[js.Array[IGeoJsonObject]] = js.native
  /** Set of geometries (only applicable if the type is 'geometrycollection') */
  var geometries: js.UndefOr[js.Array[IGeoJsonObject]] = js.native
  /** Geometry (only applicable if the type is 'feature') */
  var geometry: js.UndefOr[IGeoJsonObject] = js.native
  /** identifier of a feature (only applicable if the type is 'feature') */
  var id: js.UndefOr[js.Any] = js.native
  /** Additional properties of the object as a key,value pair */
  var properties: js.UndefOr[js.Any] = js.native
  /** 
    * Type of the object 
    * could be one of the following: 
    * Point
    * LineString
    * Polygon
    * MultiPoint
    * MultiLineString
    * MultiPolygon
    * GeometryCollection
    * Feature
    * FeatureCollection 
    */
  var `type`: String = js.native
}

object IGeoJsonObject {
  @scala.inline
  def apply(`type`: String): IGeoJsonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJsonObject]
  }
  @scala.inline
  implicit class IGeoJsonObjectOps[Self <: IGeoJsonObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinates(value: js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[IGeoJsonObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometries(value: js.Array[IGeoJsonObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometry(value: IGeoJsonObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
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
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

