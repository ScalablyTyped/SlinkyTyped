package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSStyleProperties extends js.Object {
  /**
    * Description for the WMTS style. This defaults to the value of the Abstract property from the WMTS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The unique ID assigned to the style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#id)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The URL to the legend which gets used in [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget. This defaults to the value of the LegendURL property from the WMTS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#legendUrl)
    */
  var legendUrl: js.UndefOr[String] = js.native
  /**
    * The title of the WMTS style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#title)
    */
  var title: js.UndefOr[String] = js.native
}

object WMTSStyleProperties {
  @scala.inline
  def apply(): WMTSStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMTSStyleProperties]
  }
  @scala.inline
  implicit class WMTSStylePropertiesOps[Self <: WMTSStyleProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withLegendUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

