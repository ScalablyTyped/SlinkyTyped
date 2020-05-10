package typingsSlinky.amapJsApiOverview.AMap.OverView

import typingsSlinky.amapJsApi.AMap.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[L /* <: TileLayer */] extends js.Object {
  /**
    * 鹰眼是否展开，默认为false
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * 鹰眼窗体中需显示的切片图层
    */
  var tileLayer: js.UndefOr[L] = js.native
  /**
    * 鹰眼是否显示，默认为true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply[L](): Options[L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[L]]
  }
  @scala.inline
  implicit class OptionsOps[Self[l] <: Options[l], L] (val x: Self[L]) extends AnyVal {
    @scala.inline
    def duplicate: Self[L] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[L]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[L] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[L] with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withTileLayer(value: L): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileLayer: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

