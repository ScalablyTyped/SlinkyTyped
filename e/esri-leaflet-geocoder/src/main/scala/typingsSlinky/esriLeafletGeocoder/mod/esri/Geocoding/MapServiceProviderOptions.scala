package typingsSlinky.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapServiceProviderOptions extends BaseProviderOptions {
  var bufferRadius: Double | js.Array[Double] = js.native
  var layers: Double | js.Array[Double] = js.native
  var searchFields: String | js.Array[String] = js.native
  var url: String = js.native
  def formatSuggestion(featureInformation: js.Any): String = js.native
}

object MapServiceProviderOptions {
  @scala.inline
  def apply(
    bufferRadius: Double | js.Array[Double],
    formatSuggestion: js.Any => String,
    layers: Double | js.Array[Double],
    searchFields: String | js.Array[String],
    url: String
  ): MapServiceProviderOptions = {
    val __obj = js.Dynamic.literal(bufferRadius = bufferRadius.asInstanceOf[js.Any], formatSuggestion = js.Any.fromFunction1(formatSuggestion), layers = layers.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapServiceProviderOptions]
  }
  @scala.inline
  implicit class MapServiceProviderOptionsOps[Self <: MapServiceProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferRadius(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatSuggestion(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSuggestion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayers(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchFields(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

