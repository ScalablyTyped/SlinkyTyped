package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMLLayerProperties
  extends LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  /**
    * A collection of [KMLSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[KMLSublayerProperties]] = js.native
  /**
    * The publicly accessible URL for a .kml or .kmz file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object KMLLayerProperties {
  @scala.inline
  def apply(): KMLLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KMLLayerProperties]
  }
  @scala.inline
  implicit class KMLLayerPropertiesOps[Self <: KMLLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSublayers(value: CollectionProperties[KMLSublayerProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSublayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublayers")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

