package typingsSlinky.amapJsApi.AMap.Map

import typingsSlinky.amapJsApi.AMap.Lang
import typingsSlinky.amapJsApi.AMap.Layer
import typingsSlinky.amapJsApi.AMap.LocationValue
import typingsSlinky.amapJsApi.AMap.TileLayer
import typingsSlinky.amapJsApi.AMap.View2D
import typingsSlinky.amapJsApi.amapJsApiStrings.EPSG3395
import typingsSlinky.amapJsApi.amapJsApiStrings.EPSG3857
import typingsSlinky.amapJsApi.amapJsApiStrings.EPSG4326
import typingsSlinky.amapJsApi.amapJsApiStrings.all
import typingsSlinky.amapJsApi.amapJsApiStrings.c
import typingsSlinky.amapJsApi.amapJsApiStrings.d
import typingsSlinky.amapJsApi.amapJsApiStrings.dv
import typingsSlinky.amapJsApi.amapJsApiStrings.v
import typingsSlinky.amapJsApi.amapJsApiStrings.vw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 地图平移过程中是否使用动画
    */
  var animateEnable: js.UndefOr[Boolean] = js.native
  // internal
  var baseRender: js.UndefOr[vw | d | dv | v] = js.native
  /**
    * 楼块出现和消失的时候是否显示动画过程
    */
  var buildingAnimation: js.UndefOr[Boolean] = js.native
  /**
    * 地图中心点坐标值
    */
  var center: js.UndefOr[LocationValue] = js.native
  var copyright: js.UndefOr[String] = js.native
  /**
    * 地图显示的参考坐标系
    */
  var crs: js.UndefOr[EPSG3857 | EPSG3395 | EPSG4326] = js.native
  /**
    * 地图默认鼠标样式
    */
  var defaultCursor: js.UndefOr[String] = js.native
  /**
    * 当前地图中默认显示的图层
    */
  var defaultLayer: js.UndefOr[TileLayer] = js.native
  /**
    * 地图是否可通过双击鼠标放大地图
    */
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  /**
    * 地图是否可通过鼠标拖拽平移
    */
  var dragEnable: js.UndefOr[Boolean] = js.native
  /**
    * 在展示矢量图的时候自动展示室内地图图层
    */
  // indoorMap?: IndorMap
  /**
    * 是否支持可以扩展最大缩放级别
    */
  var expandZoomRange: js.UndefOr[Boolean] = js.native
  /**
    * 设置地图上显示的元素种类
    */
  var features: js.UndefOr[js.Array[Feature] | all | Feature] = js.native
  var forceVector: js.UndefOr[Boolean] = js.native
  var gridMapForeign: js.UndefOr[Boolean] = js.native
  /**
    * 是否开启地图热点和标注的hover效果
    */
  var isHotspot: js.UndefOr[Boolean] = js.native
  /**
    * 地图是否使用缓动效果
    */
  var jogEnable: js.UndefOr[Boolean] = js.native
  /**
    * 地图是否可通过键盘控制
    */
  var keyboardEnable: js.UndefOr[Boolean] = js.native
  /**
    * 地图标注显示顺序
    */
  var labelzIndex: js.UndefOr[Double] = js.native
  /**
    * 地图语言类型
    */
  var lang: js.UndefOr[Lang] = js.native
  /**
    * 地图图层数组，数组可以是图层 中的一个或多个，默认为普通二维地图
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  var logoUrl: js.UndefOr[String] = js.native
  var logoUrlRetina: js.UndefOr[String] = js.native
  /**
    * 设置地图的显示样式
    */
  var mapStyle: js.UndefOr[String] = js.native
  /**
    * 为 Map 实例指定掩模的路径，各图层将只显示路径范围内图像
    */
  var mask: js.UndefOr[
    js.Array[
      (js.Array[(js.Array[js.Tuple2[Double, Double]]) | (js.Tuple2[Double, Double])]) | (js.Tuple2[Double, Double])
    ]
  ] = js.native
  var maxPitch: js.UndefOr[Double] = js.native
  var overlayRender: js.UndefOr[c | d] = js.native
  /**
    * 俯仰角度
    */
  var pitch: js.UndefOr[Double] = js.native
  /**
    * 是否允许设置俯仰角度
    */
  var pitchEnable: js.UndefOr[Boolean] = js.native
  /**
    * 设置地图的预加载模式
    */
  var preloadMode: js.UndefOr[Boolean] = js.native
  /**
    * 是否监控地图容器尺寸变化
    */
  var resizeEnable: js.UndefOr[Boolean] = js.native
  /**
    * 地图是否可旋转
    */
  var rotateEnable: js.UndefOr[Boolean] = js.native
  var rotation: js.UndefOr[Double] = js.native
  /**
    * 地图是否可通过鼠标滚轮缩放浏览
    */
  var scrollWheel: js.UndefOr[Boolean] = js.native
  /**
    * 设置地图显示3D楼块效果
    */
  var showBuildingBlock: js.UndefOr[Boolean] = js.native
  /**
    * 是否在有矢量底图的时候自动展示室内地图
    */
  var showIndoorMap: js.UndefOr[Boolean] = js.native
  var showLabel: js.UndefOr[Boolean] = js.native
  /**
    * 调整天空颜色
    */
  var skyColor: js.UndefOr[String] = js.native
  /**
    * 地图在移动终端上是否可通过多点触控缩放浏览地图
    */
  var touchZoom: js.UndefOr[Boolean] = js.native
  /**
    * 当touchZoomCenter=1的时候，手机端双指缩放的以地图中心为中心，否则默认以双指中间点为中心
    */
  var touchZoomCenter: js.UndefOr[Double] = js.native
  var turboMode: js.UndefOr[Boolean] = js.native
  /**
    * 地图视口，用于控制影响地图静态显示的属性
    */
  var view: js.UndefOr[View2D] = js.native
  /**
    * 视图模式
    */
  var viewMode: js.UndefOr[ViewMode] = js.native
  var workerMode: js.UndefOr[Boolean] = js.native
  /**
    * 地图显示的缩放级别
    */
  var zoom: js.UndefOr[Double] = js.native
  /**
    * 地图是否可缩放
    */
  var zoomEnable: js.UndefOr[Boolean] = js.native
  /**
    * 地图显示的缩放级别范围
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
    def withAnimateEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseRender(value: vw | d | dv | v): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRender")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildingAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildingAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: LocationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyright(value: String): Self = {
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
    def withCrs(value: EPSG3857 | EPSG3395 | EPSG4326): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLayer(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClickZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleClickZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandZoomRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandZoomRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandZoomRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandZoomRange")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[Feature] | all | Feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withForceVector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceVector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceVector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceVector")(js.undefined)
        ret
    }
    @scala.inline
    def withGridMapForeign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMapForeign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridMapForeign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMapForeign")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHotspot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHotspot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHotspot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHotspot")(js.undefined)
        ret
    }
    @scala.inline
    def withJogEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jogEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJogEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jogEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelzIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelzIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelzIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelzIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: Lang): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoUrlRetina(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoUrlRetina")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoUrlRetina: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoUrlRetina")(js.undefined)
        ret
    }
    @scala.inline
    def withMapStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(
      value: js.Array[
          (js.Array[(js.Array[js.Tuple2[Double, Double]]) | (js.Tuple2[Double, Double])]) | (js.Tuple2[Double, Double])
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayRender(value: c | d): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayRender")(js.undefined)
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadMode")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBuildingBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBuildingBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBuildingBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBuildingBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIndoorMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndoorMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIndoorMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndoorMap")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSkyColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkyColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchZoomCenter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoomCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchZoomCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoomCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withTurboMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("turboMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTurboMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("turboMode")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: View2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMode(value: ViewMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMode")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnable")(js.undefined)
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

