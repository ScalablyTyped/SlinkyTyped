package typingsSlinky.amapJsApi.AMap.Marker

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.AnimationName
import typingsSlinky.amapJsApi.AMap.Icon
import typingsSlinky.amapJsApi.AMap.LocationValue
import typingsSlinky.amapJsApi.AMap.MarkerShape
import typingsSlinky.amapJsApi.AMap.Pixel
import typingsSlinky.amapJsApi.ReferOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[ExtraData]
  extends typingsSlinky.amapJsApi.AMap.Overlay.Options[ExtraData]
     with ReferOverlayOptions[js.Any] {
  /**
    * 标记锚点
    */
  var anchor: js.UndefOr[Anchor] = js.native
  /**
    * 点标记的旋转角度
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * 点标记的动画效果
    */
  var animation: js.UndefOr[AnimationName] = js.native
  /**
    * 是否自动旋转
    */
  var autoRotation: js.UndefOr[Boolean] = js.native
  /**
    * 点标记显示内容
    */
  var content: js.UndefOr[String | HTMLElement] = js.native
  var height: js.UndefOr[Double] = js.native
  /**
    * 需在点标记中显示的图标
    */
  var icon: js.UndefOr[String | Icon] = js.native
  /**
    * 文本标注
    */
  var label: js.UndefOr[Label] = js.native
  /**
    * 点标记显示位置偏移量
    */
  var offset: js.UndefOr[Pixel] = js.native
  /**
    * 点标记在地图上显示的位置
    */
  var position: js.UndefOr[LocationValue] = js.native
  /**
    * 拖拽点标记时是否开启点标记离开地图的效果
    */
  var raiseOnDrag: js.UndefOr[Boolean] = js.native
  /**
    * 点标记阴影
    */
  var shadow: js.UndefOr[Icon | String] = js.native
  /**
    * 可点击区域
    */
  var shape: js.UndefOr[MarkerShape] = js.native
  /**
    * 鼠标滑过点标记时的文字提示
    */
  var title: js.UndefOr[String] = js.native
  /**
    * 鼠标点击时marker是否置顶
    */
  var topWhenClick: js.UndefOr[Boolean] = js.native
  var topWhenMouseOver: js.UndefOr[Boolean] = js.native
  /**
    * 点标记是否可见
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * 点标记的叠加顺序
    */
  var zIndex: js.UndefOr[Double] = js.native
  // internal
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object Options {
  @scala.inline
  def apply[ExtraData](): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ExtraData]]
  }
  @scala.inline
  implicit class OptionsOps[Self[extradata] <: Options[extradata], ExtraData] (val x: Self[ExtraData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ExtraData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ExtraData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ExtraData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ExtraData] with Other]
    @scala.inline
    def withAnchor(value: Anchor): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAngle(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: AnimationName): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRotation(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRotation: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHTMLElement(value: HTMLElement): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | HTMLElement): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String | Icon): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Label): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Pixel): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: LocationValue): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRaiseOnDrag(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raiseOnDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaiseOnDrag: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raiseOnDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Icon | String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: MarkerShape): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTopWhenClick(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topWhenClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopWhenClick: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topWhenClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTopWhenMouseOver(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topWhenMouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopWhenMouseOver: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topWhenMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withZooms(value: js.Tuple2[Double, Double]): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooms: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(js.undefined)
        ret
    }
  }
  
}

