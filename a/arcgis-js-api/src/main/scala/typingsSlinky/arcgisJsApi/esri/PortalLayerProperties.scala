package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalLayerProperties extends js.Object {
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.native
}

object PortalLayerProperties {
  @scala.inline
  def apply(): PortalLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalLayerProperties]
  }
  @scala.inline
  implicit class PortalLayerPropertiesOps[Self <: PortalLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPortalItem(value: PortalItemProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalItem")(js.undefined)
        ret
    }
  }
  
}

