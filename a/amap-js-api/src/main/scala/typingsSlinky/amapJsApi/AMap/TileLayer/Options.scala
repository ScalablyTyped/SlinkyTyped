package typingsSlinky.amapJsApi.AMap.TileLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.amapJsApi.AMap.Layer.Options {
  /**
    * 是否在高清屏下进行清晰度适配
    */
  var detectRetina: js.UndefOr[Boolean] = js.native
  /**
    * 取图错误时的代替地址
    */
  var errorUrl: js.UndefOr[String] = js.native
  /**
    * 获取图块取图地址
    */
  var getTileUrl: js.UndefOr[
    String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String])
  ] = js.native
  /**
    * 图层的透明度
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * 切片大小
    */
  var tileSize: js.UndefOr[Double] = js.native
  /**
    * 切片取图地址(自1.3版本起，该属性与getTileUrl属性合并)
    */
  var tileUrl: js.UndefOr[String] = js.native
  /**
    * 图层叠加的顺序值
    */
  var zIndex: js.UndefOr[Double] = js.native
  /**
    * 支持的缩放级别范围
    */
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectRetina(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectRetina")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectRetina: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectRetina")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTileUrlFunction3(value: (/* x */ Double, /* y */ Double, /* level */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileUrl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetTileUrl(value: String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetTileUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
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
    @scala.inline
    def withTileUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUrl")(js.undefined)
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
    @scala.inline
    def withZooms(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(js.undefined)
        ret
    }
  }
  
}

