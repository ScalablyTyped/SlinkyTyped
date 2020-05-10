package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayerOptions extends js.Object {
  var copyright: js.UndefOr[Copyright] = js.native
  var tileUrlTemplate: js.UndefOr[String] = js.native
  var transparentPng: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
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
    def withCopyright(value: Copyright): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withTileUrlTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUrlTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileUrlTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUrlTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparentPng(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentPng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparentPng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentPng")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

