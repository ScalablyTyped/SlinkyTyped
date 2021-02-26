package typingsSlinky.amapJsApi.AMap

import typingsSlinky.amapJsApi.AMap.MassMarks.Data
import typingsSlinky.amapJsApi.AMap.MassMarks.Style
import typingsSlinky.amapJsApi.amapJsApiStrings.click
import typingsSlinky.amapJsApi.amapJsApiStrings.dblclick
import typingsSlinky.amapJsApi.amapJsApiStrings.lnglat
import typingsSlinky.amapJsApi.amapJsApiStrings.mousedown
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseout
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseover
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseup
import typingsSlinky.amapJsApi.amapJsApiStrings.touchend
import typingsSlinky.amapJsApi.amapJsApiStrings.touchstart
import typingsSlinky.amapJsApi.anon.LnglatLngLat
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MassMarks[D /* <: Data */] extends Layer {
  
  /**
    * 清除海量点
    */
  def clear(): Unit = js.native
  
  /**
    * 获取数据集
    */
  def getData(): js.Array[(Pick[D, Exclude[/* keyof D */ String, lnglat]]) with LnglatLngLat] = js.native
  
  /**
    * 获取显示样式
    */
  def getStyle(): Style | js.Array[Style] = js.native
  
  def setData(data: String): Unit = js.native
  /**
    * 设置数据集
    * @param data 数据集
    */
  def setData(data: js.Array[D]): Unit = js.native
  
  def setStyle(style: js.Array[Style]): Unit = js.native
  /**
    * 设置显示样式
    * @param style 样式设置
    */
  def setStyle(style: Style): Unit = js.native
}
object MassMarks {
  
  @js.native
  trait Data extends StObject {
    
    var lnglat: LocationValue = js.native
    
    var style: js.UndefOr[Double] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(lnglat: LocationValue): Data = {
      val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLnglat(value: LocationValue): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: Double): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait EventMap[I] extends StObject {
    
    var click: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.click, I] = js.native
    
    var dblclick: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.dblclick, I] = js.native
    
    var mousedown: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mousedown, I] = js.native
    
    var mouseout: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseout, I] = js.native
    
    var mouseover: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseover, I] = js.native
    
    var mouseup: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseup, I] = js.native
    
    var touchend: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchend, I] = js.native
    
    var touchstart: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchstart, I] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply[I](
      click: UIEvent[click, I],
      dblclick: UIEvent[dblclick, I],
      mousedown: UIEvent[mousedown, I],
      mouseout: UIEvent[mouseout, I],
      mouseover: UIEvent[mouseover, I],
      mouseup: UIEvent[mouseup, I],
      touchend: UIEvent[touchend, I],
      touchstart: UIEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
      
      @scala.inline
      def setClick(value: UIEvent[click, I]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDblclick(value: UIEvent[dblclick, I]): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousedown(value: UIEvent[mousedown, I]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseout(value: UIEvent[mouseout, I]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseover(value: UIEvent[mouseover, I]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseup(value: UIEvent[mouseup, I]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchend(value: UIEvent[touchend, I]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchstart(value: UIEvent[touchstart, I]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options
    extends typingsSlinky.amapJsApi.AMap.Layer.Options {
    
    /**
      * 是否在拖拽缩放过程中实时重绘
      */
    var alwayRender: js.UndefOr[Boolean] = js.native
    
    /**
      * 指针样式
      */
    var cursor: js.UndefOr[String] = js.native
    
    /**
      * 设置点的样式
      */
    var style: Style | js.Array[Style] = js.native
    
    /**
      * 显示层级
      */
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(style: Style | js.Array[Style]): Options = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwayRender(value: Boolean): Self = StObject.set(x, "alwayRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwayRenderUndefined: Self = StObject.set(x, "alwayRender", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setStyle(value: Style | js.Array[Style]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    /**
      * 图标显示位置偏移量，以图标的左上角为基准点（0,0）点
      */
    var anchor: Pixel = js.native
    
    /**
      * 旋转角度
      */
    var rotation: js.UndefOr[Double] = js.native
    
    /**
      * 图标的尺寸
      */
    var size: Size = js.native
    
    /**
      * 图标的地址
      */
    var url: String = js.native
  }
  object Style {
    
    @scala.inline
    def apply(anchor: Pixel, size: Size, url: String): Style = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Pixel): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type UIEvent[N /* <: String */, I] = Event_[N, typingsSlinky.amapJsApi.anon.Data[I]]
}
