package typingsSlinky.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerProviderOptions extends BaseProviderOptions {
  var bufferRadius: js.UndefOr[Double] = js.native
  var formatSuggestion: js.UndefOr[js.Function1[/* featureInformation */ js.Any, String]] = js.native
  var searchFields: js.UndefOr[String | js.Array[String]] = js.native
  var url: String = js.native
}

object FeatureLayerProviderOptions {
  @scala.inline
  def apply(url: String): FeatureLayerProviderOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerProviderOptions]
  }
  @scala.inline
  implicit class FeatureLayerProviderOptionsOps[Self <: FeatureLayerProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatSuggestion(value: /* featureInformation */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSuggestion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchFields(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFields")(js.undefined)
        ret
    }
  }
  
}

