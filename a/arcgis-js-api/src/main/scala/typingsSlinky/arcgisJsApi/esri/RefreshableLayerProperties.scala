package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshableLayerProperties extends js.Object {
  /**
    * Refresh interval of the layer in minutes. Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  var refreshInterval: js.UndefOr[Double] = js.native
}

object RefreshableLayerProperties {
  @scala.inline
  def apply(): RefreshableLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshableLayerProperties]
  }
  @scala.inline
  implicit class RefreshableLayerPropertiesOps[Self <: RefreshableLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefreshInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshInterval")(js.undefined)
        ret
    }
  }
  
}

