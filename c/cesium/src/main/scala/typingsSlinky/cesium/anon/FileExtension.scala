package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileExtension extends js.Object {
  var credit: js.UndefOr[typingsSlinky.cesium.mod.Credit | String] = js.native
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  var fileExtension: js.UndefOr[String] = js.native
  var maximumLevel: js.UndefOr[Double] = js.native
  var minimumLevel: js.UndefOr[Double] = js.native
  var proxy: js.UndefOr[js.Any] = js.native
  var rectangle: js.UndefOr[typingsSlinky.cesium.mod.Rectangle] = js.native
  var tileHeight: js.UndefOr[Double] = js.native
  var tileWidth: js.UndefOr[Double] = js.native
  var tilingScheme: js.UndefOr[typingsSlinky.cesium.mod.TilingScheme] = js.native
  var url: js.UndefOr[String] = js.native
}

object FileExtension {
  @scala.inline
  def apply(): FileExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileExtension]
  }
  @scala.inline
  implicit class FileExtensionOps[Self <: FileExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredit(value: typingsSlinky.cesium.mod.Credit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withFileExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangle(value: typingsSlinky.cesium.mod.Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.undefined)
        ret
    }
    @scala.inline
    def withTileHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTileWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTilingScheme(value: typingsSlinky.cesium.mod.TilingScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilingScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilingScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilingScheme")(js.undefined)
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

