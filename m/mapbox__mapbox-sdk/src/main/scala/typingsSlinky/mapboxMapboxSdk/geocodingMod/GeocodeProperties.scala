package typingsSlinky.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeProperties extends GeocodeFeature {
  /**
    * A string of comma-separated categories for the returned  poi feature.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * A boolean value indicating whether a  poi feature is a landmark. Landmarks are
    * particularly notable or long-lived features like schools, parks, museums and places of worship.
    */
  var landmark: js.UndefOr[Boolean] = js.native
  /**
    * The name of a suggested Maki icon to visualize a  poi feature based on its  category .
    */
  var maki: js.UndefOr[String] = js.native
  /**
    * The ISO 3166-1 country and ISO 3166-2 region code for the returned feature.
    */
  var short_code: String = js.native
  /**
    * A formatted string of the telephone number for the returned  poi feature.
    */
  var tel: js.UndefOr[String] = js.native
  /**
    * The Wikidata identifier for the returned feature.
    */
  var wikidata: js.UndefOr[String] = js.native
}

object GeocodeProperties {
  @scala.inline
  def apply(
    center: js.Array[Double],
    context: js.Array[GeocodeFeature],
    geometry: Geometry,
    id: String,
    language: String,
    matching_place_name: String,
    matching_text: String,
    place_name: String,
    place_type: js.Array[String],
    properties: GeocodeProperties,
    relevance: Double,
    short_code: String,
    text: String,
    `type`: String
  ): GeocodeProperties = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], matching_place_name = matching_place_name.asInstanceOf[js.Any], matching_text = matching_text.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], short_code = short_code.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeProperties]
  }
  @scala.inline
  implicit class GeocodePropertiesOps[Self <: GeocodeProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShort_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withLandmark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmark")(js.undefined)
        ret
    }
    @scala.inline
    def withMaki(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maki")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaki: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maki")(js.undefined)
        ret
    }
    @scala.inline
    def withTel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tel")(js.undefined)
        ret
    }
    @scala.inline
    def withWikidata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wikidata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWikidata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wikidata")(js.undefined)
        ret
    }
  }
  
}

