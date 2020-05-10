package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLayerDefaults extends js.Object {
  var bing: js.UndefOr[MapLayerDefaultsBing] = js.native
  var bubble: js.UndefOr[MapLayerDefaultsBubble] = js.native
  var marker: js.UndefOr[MapLayerDefaultsMarker] = js.native
  var shape: js.UndefOr[MapLayerDefaultsShape] = js.native
  var tile: js.UndefOr[MapLayerDefaultsTile] = js.native
  var tileSize: js.UndefOr[Double] = js.native
}

object MapLayerDefaults {
  @scala.inline
  def apply(): MapLayerDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaults]
  }
  @scala.inline
  implicit class MapLayerDefaultsOps[Self <: MapLayerDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBing(value: MapLayerDefaultsBing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bing")(js.undefined)
        ret
    }
    @scala.inline
    def withBubble(value: MapLayerDefaultsBubble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: MapLayerDefaultsMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: MapLayerDefaultsShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withTile(value: MapLayerDefaultsTile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(js.undefined)
        ret
    }
  }
  
}

