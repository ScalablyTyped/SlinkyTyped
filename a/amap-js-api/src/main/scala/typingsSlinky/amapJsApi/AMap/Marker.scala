package typingsSlinky.amapJsApi.AMap

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.Marker.Anchor
import typingsSlinky.amapJsApi.AMap.Marker.Label
import typingsSlinky.amapJsApi.amapJsApiStrings.click
import typingsSlinky.amapJsApi.amapJsApiStrings.dblclick
import typingsSlinky.amapJsApi.amapJsApiStrings.dragend
import typingsSlinky.amapJsApi.amapJsApiStrings.dragging
import typingsSlinky.amapJsApi.amapJsApiStrings.dragstart
import typingsSlinky.amapJsApi.amapJsApiStrings.mousedown
import typingsSlinky.amapJsApi.amapJsApiStrings.mousemove
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseout
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseover
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseup
import typingsSlinky.amapJsApi.amapJsApiStrings.movealong
import typingsSlinky.amapJsApi.amapJsApiStrings.moveend
import typingsSlinky.amapJsApi.amapJsApiStrings.moving
import typingsSlinky.amapJsApi.amapJsApiStrings.rightclick
import typingsSlinky.amapJsApi.amapJsApiStrings.touchend
import typingsSlinky.amapJsApi.amapJsApiStrings.touchmove
import typingsSlinky.amapJsApi.amapJsApiStrings.touchstart
import typingsSlinky.amapJsApi.anon.Name
import typingsSlinky.amapJsApi.anon.PassedPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker[ExtraData] extends Overlay[ExtraData] {
  
  /**
    * 获取锚点
    */
  def getAnchor(): js.UndefOr[Anchor] = js.native
  
  /**
    *     获取点标记的旋转角度
    */
  def getAngle(): Double = js.native
  
  /**
    * 获取点标记的动画效果类型
    */
  def getAnimation(): AnimationName = js.native
  
  /**
    *     获取点标记是否支持鼠标单击事件
    */
  def getClickable(): Boolean = js.native
  
  /**
    * 获取点标记内容
    */
  def getContent(): String | HTMLElement = js.native
  
  /**
    * 获取点标记对象是否可拖拽移动
    */
  def getDraggable(): Boolean = js.native
  
  /**
    * 获取Icon内容
    */
  def getIcon(): js.UndefOr[String | Icon] = js.native
  
  /**
    *     获取点标记文本标签内容
    */
  def getLabel(): js.UndefOr[Label] = js.native
  
  /**
    * 获取偏移量
    */
  def getOffset(): Pixel = js.native
  
  /**
    *     获取点标记的位置
    */
  def getPosition(): js.UndefOr[LngLat] = js.native
  
  /**
    * 获取阴影图标
    */
  def getShadow(): js.UndefOr[Icon | String] = js.native
  
  /**
    * 获取可点击区域
    */
  def getShape(): js.UndefOr[MarkerShape] = js.native
  
  /**
    * 获取点标记的文字提示
    */
  def getTitle(): js.UndefOr[String] = js.native
  
  /**
    * 获取是否展示在最顶层
    */
  def getTop(): Boolean = js.native
  
  /**
    * 获取点标记的叠加顺序
    */
  def getzIndex(): Double = js.native
  
  /**
    * 唤起高德地图客户端标注页
    * @param obj 唤起参数
    */
  def markOnAMAP(): Unit = js.native
  def markOnAMAP(obj: Name): Unit = js.native
  
  /**
    * 以指定的速度，点标记沿指定的路径移动
    * @param path 移动轨迹
    * @param speed 速度
    * @param timingFunction 缓动函数
    * @param circleable 是否循环
    */
  def moveAlong(path: js.Array[LngLat], speed: Double): Unit = js.native
  def moveAlong(
    path: js.Array[LngLat],
    speed: Double,
    timingFunction: js.UndefOr[scala.Nothing],
    circleable: Boolean
  ): Unit = js.native
  def moveAlong(path: js.Array[LngLat], speed: Double, timingFunction: js.Function1[/* t */ Double, Double]): Unit = js.native
  def moveAlong(
    path: js.Array[LngLat],
    speed: Double,
    timingFunction: js.Function1[/* t */ Double, Double],
    circleable: Boolean
  ): Unit = js.native
  
  /**
    * 以给定速度移动点标记到指定位置
    * @param lnglat 目标位置
    * @param speed 速度
    * @param timingFunction 缓动函数
    */
  def moveTo(lnglat: LocationValue, speed: Double): Unit = js.native
  def moveTo(lnglat: LocationValue, speed: Double, timingFunction: js.Function1[/* t */ Double, Double]): Unit = js.native
  
  /**
    *     暂定点标记的动画效果
    */
  def pauseMove(): Boolean = js.native
  
  /**
    * 重新开始点标记的动画效果
    */
  def resumeMove(): Boolean = js.native
  
  /**
    * 设置锚点
    */
  def setAnchor(): Unit = js.native
  def setAnchor(anchor: Anchor): Unit = js.native
  
  /**
    *     设置点标记的旋转角度
    * @param angle 旋转角度
    */
  def setAngle(angle: Double): Unit = js.native
  
  /**
    * 设置点标记的动画效果
    * @param animate 动画效果类型
    */
  def setAnimation(animate: AnimationName): Unit = js.native
  def setAnimation(animate: AnimationName, prevent: Boolean): Unit = js.native
  
  /**
    * 设置点标记是支持鼠标单击事件
    * @param cilckable 是否支持点击
    */
  def setClickable(cilckable: Boolean): Unit = js.native
  
  /**
    *     设置点标记显示内容，可以是HTML要素字符串或者HTML DOM对象
    * @param content 显示内容
    */
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  
  /**
    * 设置鼠标悬停时的光标
    * @param cursor 光标
    */
  def setCursor(cursor: String): Unit = js.native
  
  /**
    * 设置点标记对象是否可拖拽移动
    * @param draggable 是否可拖拽移动
    */
  def setDraggable(draggable: Boolean): Unit = js.native
  
  /**
    * 设置点标记的显示图标
    * @param content 图标
    */
  def setIcon(content: String): Unit = js.native
  def setIcon(content: Icon): Unit = js.native
  
  /**
    * 设置点标记文本标签内容
    * @param label 标签内容
    */
  def setLabel(): Unit = js.native
  def setLabel(label: Label): Unit = js.native
  
  /**
    *     设置偏移量
    * @param offset 偏移量
    */
  def setOffset(offset: Pixel): Unit = js.native
  
  /**
    * 设置点标记位置
    * @param position 位置经纬度
    */
  def setPosition(position: LocationValue): Unit = js.native
  
  /**
    * 设置阴影效果
    * @param icon 阴影效果
    */
  def setShadow(): Unit = js.native
  def setShadow(icon: String): Unit = js.native
  def setShadow(icon: Icon): Unit = js.native
  
  /**
    * 设置可点击区域
    * @param shape 可点击区域
    */
  def setShape(): Unit = js.native
  def setShape(shape: MarkerShape): Unit = js.native
  
  /**
    * 鼠标滑过点标时的文字提示
    * @param title 提示文字
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * 设置是否展示在最顶层
    * @param isTop 是否展示在最顶层
    */
  def setTop(isTop: Boolean): Unit = js.native
  
  /**
    * 设置点标记的叠加顺序
    * @param index 层级
    */
  def setzIndex(index: Double): Unit = js.native
  
  /**
    * 点标记停止动画
    */
  def stopMove(): Unit = js.native
}
object Marker {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApi.amapJsApiStrings.`top-left`
    - typingsSlinky.amapJsApi.amapJsApiStrings.`top-center`
    - typingsSlinky.amapJsApi.amapJsApiStrings.`top-right`
    - typingsSlinky.amapJsApi.amapJsApiStrings.`middle-left`
    - typingsSlinky.amapJsApi.amapJsApiStrings.center
    - typingsSlinky.amapJsApi.amapJsApiStrings.`middle-right`
    - typingsSlinky.amapJsApi.amapJsApiStrings.`bottom-left`
    - typingsSlinky.amapJsApi.amapJsApiStrings.`bottom-center`
    - typingsSlinky.amapJsApi.amapJsApiStrings.`bottom-right`
  */
  trait Anchor extends StObject
  object Anchor {
    
    @scala.inline
    def `bottom-center`: typingsSlinky.amapJsApi.amapJsApiStrings.`bottom-center` = "bottom-center".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-left`: typingsSlinky.amapJsApi.amapJsApiStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typingsSlinky.amapJsApi.amapJsApiStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.`bottom-right`]
    
    @scala.inline
    def center: typingsSlinky.amapJsApi.amapJsApiStrings.center = "center".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.center]
    
    @scala.inline
    def `middle-left`: typingsSlinky.amapJsApi.amapJsApiStrings.`middle-left` = "middle-left".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.`middle-left`]
    
    @scala.inline
    def `middle-right`: typingsSlinky.amapJsApi.amapJsApiStrings.`middle-right` = "middle-right".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.`middle-right`]
    
    @scala.inline
    def `top-center`: typingsSlinky.amapJsApi.amapJsApiStrings.`top-center` = "top-center".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.`top-center`]
    
    @scala.inline
    def `top-left`: typingsSlinky.amapJsApi.amapJsApiStrings.`top-left` = "top-left".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typingsSlinky.amapJsApi.amapJsApiStrings.`top-right` = "top-right".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.`top-right`]
  }
  
  @js.native
  trait EventMap[I] extends StObject {
    
    var click: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.click, I] = js.native
    
    var dblclick: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.dblclick, I] = js.native
    
    var dragend: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.dragend, I] = js.native
    
    var dragging: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.dragging, I] = js.native
    
    var dragstart: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.dragstart, I] = js.native
    
    var mousedown: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mousedown, I] = js.native
    
    var mousemove: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mousemove, I] = js.native
    
    var mouseout: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseout, I] = js.native
    
    var mouseover: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseover, I] = js.native
    
    var mouseup: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseup, I] = js.native
    
    var movealong: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.movealong, js.UndefOr[scala.Nothing]] = js.native
    
    var moveend: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.moveend, js.UndefOr[scala.Nothing]] = js.native
    
    var moving: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.moving, PassedPath] = js.native
    
    var rightclick: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.rightclick, I] = js.native
    
    var touchend: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchend, I] = js.native
    
    var touchmove: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchmove, I] = js.native
    
    var touchstart: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchstart, I] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply[I](
      click: MapsEvent[click, I],
      dblclick: MapsEvent[dblclick, I],
      dragend: MapsEvent[dragend, I],
      dragging: MapsEvent[dragging, I],
      dragstart: MapsEvent[dragstart, I],
      mousedown: MapsEvent[mousedown, I],
      mousemove: MapsEvent[mousemove, I],
      mouseout: MapsEvent[mouseout, I],
      mouseover: MapsEvent[mouseover, I],
      mouseup: MapsEvent[mouseup, I],
      movealong: Event_[movealong, js.UndefOr[scala.Nothing]],
      moveend: Event_[moveend, js.UndefOr[scala.Nothing]],
      moving: Event_[moving, PassedPath],
      rightclick: MapsEvent[rightclick, I],
      touchend: MapsEvent[touchend, I],
      touchmove: MapsEvent[touchmove, I],
      touchstart: MapsEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], movealong = movealong.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
      
      @scala.inline
      def setClick(value: MapsEvent[click, I]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDblclick(value: MapsEvent[dblclick, I]): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragend(value: MapsEvent[dragend, I]): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragging(value: MapsEvent[dragging, I]): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragstart(value: MapsEvent[dragstart, I]): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousedown(value: MapsEvent[mousedown, I]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousemove(value: MapsEvent[mousemove, I]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseout(value: MapsEvent[mouseout, I]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseover(value: MapsEvent[mouseover, I]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseup(value: MapsEvent[mouseup, I]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovealong(value: Event_[movealong, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "movealong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveend(value: Event_[moveend, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "moveend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoving(value: Event_[moving, PassedPath]): Self = StObject.set(x, "moving", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightclick(value: MapsEvent[rightclick, I]): Self = StObject.set(x, "rightclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchend(value: MapsEvent[touchend, I]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchmove(value: MapsEvent[touchmove, I]): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchstart(value: MapsEvent[touchstart, I]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[LabelDirection] = js.native
    
    var offset: js.UndefOr[Pixel] = js.native
  }
  object Label {
    
    @scala.inline
    def apply(): Label = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDirection(value: LabelDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApi.amapJsApiStrings.top
    - typingsSlinky.amapJsApi.amapJsApiStrings.right
    - typingsSlinky.amapJsApi.amapJsApiStrings.bottom
    - typingsSlinky.amapJsApi.amapJsApiStrings.left
    - typingsSlinky.amapJsApi.amapJsApiStrings.center
  */
  trait LabelDirection extends StObject
  object LabelDirection {
    
    @scala.inline
    def bottom: typingsSlinky.amapJsApi.amapJsApiStrings.bottom = "bottom".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.bottom]
    
    @scala.inline
    def center: typingsSlinky.amapJsApi.amapJsApiStrings.center = "center".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.center]
    
    @scala.inline
    def left: typingsSlinky.amapJsApi.amapJsApiStrings.left = "left".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.left]
    
    @scala.inline
    def right: typingsSlinky.amapJsApi.amapJsApiStrings.right = "right".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.right]
    
    @scala.inline
    def top: typingsSlinky.amapJsApi.amapJsApiStrings.top = "top".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.top]
  }
  
  @js.native
  trait Options[ExtraData]
    extends typingsSlinky.amapJsApi.AMap.Overlay.Options[ExtraData] {
    
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
    implicit class OptionsMutableBuilder[Self <: Options[_], ExtraData] (val x: Self with Options[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setAnimation(value: AnimationName): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAutoRotation(value: Boolean): Self = StObject.set(x, "autoRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRotationUndefined: Self = StObject.set(x, "autoRotation", js.undefined)
      
      @scala.inline
      def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHTMLElement(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIcon(value: String | Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPosition(value: LocationValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRaiseOnDrag(value: Boolean): Self = StObject.set(x, "raiseOnDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaiseOnDragUndefined: Self = StObject.set(x, "raiseOnDrag", js.undefined)
      
      @scala.inline
      def setShadow(value: Icon | String): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      @scala.inline
      def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTopWhenClick(value: Boolean): Self = StObject.set(x, "topWhenClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopWhenClickUndefined: Self = StObject.set(x, "topWhenClick", js.undefined)
      
      @scala.inline
      def setTopWhenMouseOver(value: Boolean): Self = StObject.set(x, "topWhenMouseOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopWhenMouseOverUndefined: Self = StObject.set(x, "topWhenMouseOver", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      @scala.inline
      def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
}
