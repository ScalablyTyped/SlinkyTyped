package typingsSlinky.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayerOptions
  extends typingsSlinky.leaflet.mod.TileLayerOptions {
  var retinaVersion: js.UndefOr[String] = js.native
}

object TileLayerOptions {
  @scala.inline
  def apply(): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerOptions]
  }
  @scala.inline
  implicit class TileLayerOptionsOps[Self <: TileLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetinaVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retinaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetinaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retinaVersion")(js.undefined)
        ret
    }
  }
  
}

