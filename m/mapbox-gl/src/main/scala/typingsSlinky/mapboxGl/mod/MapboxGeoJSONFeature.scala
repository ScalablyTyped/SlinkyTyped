package typingsSlinky.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.geojson.mod.BBox
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Geometry
import typingsSlinky.mapboxGl.mapboxGlStrings.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined geojson.geojson.Feature<geojson.geojson.Geometry, geojson.geojson.GeoJsonProperties> & {  layer  :mapbox-gl.mapbox-gl.Layer,   source  :string,   sourceLayer  :string,   state  :{[key: string] : any}} */
@js.native
trait MapboxGeoJSONFeature extends js.Object {
  /**
    * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
    * The value of the bbox member is an array of length 2*n where n is the number of dimensions
    * represented in the contained geometries, with all axes of the most southwesterly point
    * followed by all axes of the more northeasterly point.
    * The axes order of a bbox follows the axes order of geometries.
    * https://tools.ietf.org/html/rfc7946#section-5
    */
  var bbox: js.UndefOr[BBox] = js.native
  /**
    * The feature's geometry
    */
  var geometry: Geometry = js.native
  /**
    * A value that uniquely identifies this feature in a
    * https://tools.ietf.org/html/rfc7946#section-3.2.
    */
  var id: js.UndefOr[String | Double] = js.native
  var layer: Layer = js.native
  /**
    * Properties associated with this feature.
    */
  var properties: GeoJsonProperties = js.native
  var source: String = js.native
  var sourceLayer: String = js.native
  var state: StringDictionary[js.Any] = js.native
  var `type`: Feature = js.native
}

object MapboxGeoJSONFeature {
  @scala.inline
  def apply(
    geometry: Geometry,
    layer: Layer,
    source: String,
    sourceLayer: String,
    state: StringDictionary[js.Any],
    `type`: Feature
  ): MapboxGeoJSONFeature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceLayer = sourceLayer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxGeoJSONFeature]
  }
  @scala.inline
  implicit class MapboxGeoJSONFeatureOps[Self <: MapboxGeoJSONFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayer(value: Layer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLayer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
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

