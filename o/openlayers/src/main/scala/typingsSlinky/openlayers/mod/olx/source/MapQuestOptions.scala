package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.Tile
import typingsSlinky.openlayers.mod.TileLoadFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapQuestOptions extends js.Object {
  var cacheSize: js.UndefOr[Double] = js.native
  var layer: String = js.native
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.native
  var url: js.UndefOr[String] = js.native
}

object MapQuestOptions {
  @scala.inline
  def apply(layer: String): MapQuestOptions = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapQuestOptions]
  }
  @scala.inline
  implicit class MapQuestOptionsOps[Self <: MapQuestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReprojectionErrorThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprojectionErrorThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReprojectionErrorThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprojectionErrorThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileLoadFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTileLoadFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileLoadFunction")(js.undefined)
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

