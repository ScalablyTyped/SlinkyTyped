package typingsSlinky.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeResponse extends js.Object {
  /**
    * A string attributing the results of the Mapbox Geocoding API to Mapbox and links to Mapbox's terms of service and data sources.
    */
  var attribution: String = js.native
  /**
    * An array of feature objects.
    */
  var features: js.Array[GeocodeFeature] = js.native
  /**
    * An array of space and punctuation-separated strings from the original query.
    */
  var query: js.Array[String] = js.native
  /**
    * "Feature Collection" , a GeoJSON type from the GeoJSON specification.
    */
  var `type`: String = js.native
}

object GeocodeResponse {
  @scala.inline
  def apply(attribution: String, features: js.Array[GeocodeFeature], query: js.Array[String], `type`: String): GeocodeResponse = {
    val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeResponse]
  }
  @scala.inline
  implicit class GeocodeResponseOps[Self <: GeocodeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[GeocodeFeature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

