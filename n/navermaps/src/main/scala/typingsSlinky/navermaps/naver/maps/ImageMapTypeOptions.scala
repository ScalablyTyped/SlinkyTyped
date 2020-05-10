package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMapTypeOptions extends js.Object {
  var darktheme: js.UndefOr[Boolean] = js.native
  var getTileUrl: js.UndefOr[js.Function0[_]] = js.native
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var name: String = js.native
  var projection: Projection = js.native
  var provider: js.UndefOr[js.Array[MapDataProvider]] = js.native
  var repeatX: js.UndefOr[Boolean] = js.native
  var tileSet: js.UndefOr[String | js.Array[String]] = js.native
  var tileSize: js.UndefOr[Size | SizeLiteral] = js.native
  var uid: js.UndefOr[String] = js.native
  var vendor: js.UndefOr[String] = js.native
}

object ImageMapTypeOptions {
  @scala.inline
  def apply(maxZoom: Double, minZoom: Double, name: String, projection: Projection): ImageMapTypeOptions = {
    val __obj = js.Dynamic.literal(maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMapTypeOptions]
  }
  @scala.inline
  implicit class ImageMapTypeOptionsOps[Self <: ImageMapTypeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjection(value: Projection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDarktheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darktheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDarktheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darktheme")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTileUrl(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTileUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: js.Array[MapDataProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatX")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSet(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSet")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Size | SizeLiteral): Self = {
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
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(js.undefined)
        ret
    }
  }
  
}

