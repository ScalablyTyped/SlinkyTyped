package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.anon.PartialSliderCfg
import typingsSlinky.antvComponent.interfacesMod.ISlider
import typingsSlinky.antvComponent.typesMod.GroupComponentCfg
import typingsSlinky.antvEventEmitter.mod.EventType
import typingsSlinky.antvGBase.interfacesMod.IGroup
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderMod {
  
  @JSImport("@antv/component/lib/slider/slider", JSImport.Default)
  @js.native
  class default () extends Slider
  
  @JSImport("@antv/component/lib/slider/slider", "Slider")
  @js.native
  class Slider ()
    extends typingsSlinky.antvComponent.groupComponentMod.default[SliderCfg]
       with ISlider {
    
    /**
      * 调整 text 的位置，自动躲避
      * 根据位置，调整返回新的位置
      * @param range
      */
    var _dodgeText: js.Any = js.native
    
    /**
      * 调整 offsetRange，因为一些范围的限制
      * @param offsetRange
      */
    var adjustOffsetRange: js.Any = js.native
    
    var bindEvents: js.Any = js.native
    
    @JSName("cfg")
    var cfg_Slider: SliderCfg = js.native
    
    var currentTarget: js.Any = js.native
    
    def draw(): Unit = js.native
    
    var getContainerDOM: js.Any = js.native
    
    /* InferMemberOverrides */
    override def getEvents(): js.Any with (Record[String, js.Array[EventType]]) = js.native
    
    var maxHandler: js.Any = js.native
    
    var minHandler: js.Any = js.native
    
    /**
      * 移除事件
      */
    /* InferMemberOverrides */
    override def off(): js.Any with this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      */
    /* InferMemberOverrides */
    override def off(eventName: String): js.Any with this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    override def off(eventName: String, callback: js.Function): js.Any with this.type = js.native
    
    /**
      * 绑定事件
      * @param  eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    override def on(eventName: String, callback: js.Function): js.Any with this.type = js.native
    
    var onMouseDown: js.Any = js.native
    
    var onMouseMove: js.Any = js.native
    
    var onMouseUp: js.Any = js.native
    
    var prevX: js.Any = js.native
    
    var prevY: js.Any = js.native
    
    var trend: js.Any = js.native
    
    def update(cfg: PartialSliderCfg): Unit = js.native
    
    var updateStartEnd: js.Any = js.native
    
    var updateUI: js.Any = js.native
  }
  
  @js.native
  trait SliderCfg extends GroupComponentCfg {
    
    val backgroundStyle: js.UndefOr[js.Any] = js.native
    
    val end: js.UndefOr[Double] = js.native
    
    val foregroundStyle: js.UndefOr[js.Any] = js.native
    
    val handlerStyle: js.UndefOr[js.Any] = js.native
    
    val height: Double = js.native
    
    val maxLimit: js.UndefOr[Double] = js.native
    
    val maxText: js.UndefOr[String] = js.native
    
    val minLimit: js.UndefOr[Double] = js.native
    
    val minText: js.UndefOr[String] = js.native
    
    val start: js.UndefOr[Double] = js.native
    
    val textStyle: js.UndefOr[js.Any] = js.native
    
    val trendCfg: js.UndefOr[TrendCfg] = js.native
    
    val width: Double = js.native
    
    val x: Double = js.native
    
    val y: Double = js.native
  }
  object SliderCfg {
    
    @scala.inline
    def apply(container: IGroup, height: Double, width: Double, x: Double, y: Double): SliderCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderCfg]
    }
    
    @scala.inline
    implicit class SliderCfgMutableBuilder[Self <: SliderCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundStyle(value: js.Any): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setForegroundStyle(value: js.Any): Self = StObject.set(x, "foregroundStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForegroundStyleUndefined: Self = StObject.set(x, "foregroundStyle", js.undefined)
      
      @scala.inline
      def setHandlerStyle(value: js.Any): Self = StObject.set(x, "handlerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerStyleUndefined: Self = StObject.set(x, "handlerStyle", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLimit(value: Double): Self = StObject.set(x, "maxLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLimitUndefined: Self = StObject.set(x, "maxLimit", js.undefined)
      
      @scala.inline
      def setMaxText(value: String): Self = StObject.set(x, "maxText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTextUndefined: Self = StObject.set(x, "maxText", js.undefined)
      
      @scala.inline
      def setMinLimit(value: Double): Self = StObject.set(x, "minLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLimitUndefined: Self = StObject.set(x, "minLimit", js.undefined)
      
      @scala.inline
      def setMinText(value: String): Self = StObject.set(x, "minText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTextUndefined: Self = StObject.set(x, "minText", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setTextStyle(value: js.Any): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setTrendCfg(value: TrendCfg): Self = StObject.set(x, "trendCfg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrendCfgUndefined: Self = StObject.set(x, "trendCfg", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrendCfg extends StObject {
    
    val areaStyle: js.UndefOr[js.Object] = js.native
    
    val backgroundStyle: js.UndefOr[js.Object] = js.native
    
    val data: js.Array[Double] = js.native
    
    val isArea: js.UndefOr[Boolean] = js.native
    
    val lineStyle: js.UndefOr[js.Object] = js.native
    
    val smooth: js.UndefOr[Boolean] = js.native
  }
  object TrendCfg {
    
    @scala.inline
    def apply(data: js.Array[Double]): TrendCfg = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrendCfg]
    }
    
    @scala.inline
    implicit class TrendCfgMutableBuilder[Self <: TrendCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAreaStyle(value: js.Object): Self = StObject.set(x, "areaStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaStyleUndefined: Self = StObject.set(x, "areaStyle", js.undefined)
      
      @scala.inline
      def setBackgroundStyle(value: js.Object): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setIsArea(value: Boolean): Self = StObject.set(x, "isArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAreaUndefined: Self = StObject.set(x, "isArea", js.undefined)
      
      @scala.inline
      def setLineStyle(value: js.Object): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      @scala.inline
      def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    }
  }
}
