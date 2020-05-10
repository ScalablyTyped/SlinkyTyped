package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import typingsSlinky.leaflet.mod.TileLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for `L.esri.BasemapLayer`
  */
@js.native
trait BasemapLayerOptions extends TileLayerOptions {
  /**
    * 	Will use this token to authenticate all calls to the service.
    *
    */
  var token: js.UndefOr[String] = js.native
}

object BasemapLayerOptions {
  @scala.inline
  def apply(): BasemapLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapLayerOptions]
  }
  @scala.inline
  implicit class BasemapLayerOptionsOps[Self <: BasemapLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

