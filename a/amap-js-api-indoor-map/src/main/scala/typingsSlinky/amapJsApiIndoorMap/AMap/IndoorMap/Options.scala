package typingsSlinky.amapJsApiIndoorMap.AMap.IndoorMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.amapJsApi.AMap.Layer.Options {
  /**
    * 是否持续显示
    */
  var alaysShow: js.UndefOr[Boolean] = js.native
  var autoLoadBuildingsInTile: js.UndefOr[Boolean] = js.native
  /**
    * 鼠标悬停到店铺面时的鼠标样式
    */
  var cursor: js.UndefOr[String] = js.native
  var disableHoverMarker: js.UndefOr[Boolean] = js.native
  var disableIconRender: js.UndefOr[Boolean] = js.native
  var disableLabelRender: js.UndefOr[Boolean] = js.native
  var featurezIndex: js.UndefOr[Double] = js.native
  /**
    * 是否隐藏楼层切换控件
    */
  var hideFloorBar: js.UndefOr[Boolean] = js.native
  /**
    * 图层的透明度
    */
  var opacity: js.UndefOr[Double] = js.native
  // internal
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * 图层叠加的顺序值
    */
  var zIndex: js.UndefOr[Double] = js.native
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
    def withAlaysShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alaysShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlaysShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alaysShow")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoLoadBuildingsInTile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoadBuildingsInTile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLoadBuildingsInTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoadBuildingsInTile")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHoverMarker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHoverMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHoverMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHoverMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableIconRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIconRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableIconRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIconRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableLabelRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLabelRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLabelRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLabelRender")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturezIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featurezIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturezIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featurezIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFloorBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFloorBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFloorBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFloorBar")(js.undefined)
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
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

