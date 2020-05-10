package typingsSlinky.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackgroundColorStr extends js.Object {
  var backgroundColorStr: js.UndefOr[String] = js.native
  var bleedRatio: js.UndefOr[Double] = js.native
  var imageType: js.UndefOr[String] = js.native
  var layerFill: js.UndefOr[js.Object] = js.native
  var layerOutline: js.UndefOr[js.Object] = js.native
  var layerVisibility: js.UndefOr[js.Object] = js.native
  var layerWhere: js.UndefOr[js.Object] = js.native
  var mapCacheName: js.UndefOr[String] = js.native
  var mapCacheOption: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String] = js.native
  var useQuadKeyForMapCacheName: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
}

object AnonBackgroundColorStr {
  @scala.inline
  def apply(): AnonBackgroundColorStr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBackgroundColorStr]
  }
  @scala.inline
  implicit class AnonBackgroundColorStrOps[Self <: AnonBackgroundColorStr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColorStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColorStr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorStr")(js.undefined)
        ret
    }
    @scala.inline
    def withBleedRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bleedRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBleedRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bleedRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withImageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageType")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerFill(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerFill")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerOutline(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerVisibility(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerWhere(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerWhere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerWhere")(js.undefined)
        ret
    }
    @scala.inline
    def withMapCacheName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCacheName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapCacheName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCacheName")(js.undefined)
        ret
    }
    @scala.inline
    def withMapCacheOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCacheOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapCacheOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCacheOption")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withUseQuadKeyForMapCacheName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQuadKeyForMapCacheName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseQuadKeyForMapCacheName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQuadKeyForMapCacheName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

