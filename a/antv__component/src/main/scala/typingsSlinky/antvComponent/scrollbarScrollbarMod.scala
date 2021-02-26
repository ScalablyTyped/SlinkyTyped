package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.anon.PartialReadonlyScrollbarS
import typingsSlinky.antvComponent.groupComponentMod.default
import typingsSlinky.antvComponent.interfacesMod.ISlider
import typingsSlinky.antvComponent.typesMod.GroupComponentCfg
import typingsSlinky.antvEventEmitter.mod.EventType
import typingsSlinky.antvGBase.interfacesMod.IGroup
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollbarScrollbarMod {
  
  @JSImport("@antv/component/lib/scrollbar/scrollbar", "DEFAULT_THEME")
  @js.native
  val DEFAULT_THEME: ScrollbarTheme = js.native
  
  @JSImport("@antv/component/lib/scrollbar/scrollbar", "Scrollbar")
  @js.native
  class Scrollbar ()
    extends default[ScrollbarCfg]
       with ISlider {
    
    var bindEvents: js.Any = js.native
    
    var bindLaterEvent: js.Any = js.native
    
    @JSName("cfg")
    var cfg_Scrollbar: ScrollbarCfg = js.native
    
    var clearEvents: js.Any = js.native
    
    var draw: js.Any = js.native
    
    var emitOffsetChange: js.Any = js.native
    
    var getContainerDOM: js.Any = js.native
    
    /* InferMemberOverrides */
    override def getEvents(): js.Any with (Record[String, js.Array[EventType]]) = js.native
    
    var isMobile: js.Any = js.native
    
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
    
    var onMouseMove: js.Any = js.native
    
    var onMouseUp: js.Any = js.native
    
    var onStartEvent: js.Any = js.native
    
    var onThumbMouseOut: js.Any = js.native
    
    var onThumbMouseOver: js.Any = js.native
    
    var onTrackClick: js.Any = js.native
    
    var renderThumbShape: js.Any = js.native
    
    var renderTrackShape: js.Any = js.native
    
    var startPos: js.Any = js.native
    
    var updateThumbOffset: js.Any = js.native
    
    var validateRange: js.Any = js.native
  }
  
  @js.native
  trait ScrollbarCfg extends GroupComponentCfg {
    
    var isHorizontal: js.UndefOr[Boolean] = js.native
    
    var maxLimit: js.UndefOr[Double] = js.native
    
    var minLimit: js.UndefOr[Double] = js.native
    
    var minThumbLen: js.UndefOr[Double] = js.native
    
    var theme: js.UndefOr[ScrollbarTheme] = js.native
    
    var thumbLen: Double = js.native
    
    var thumbOffset: js.UndefOr[Double] = js.native
    
    var trackLen: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object ScrollbarCfg {
    
    @scala.inline
    def apply(container: IGroup, thumbLen: Double, trackLen: Double, x: Double, y: Double): ScrollbarCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], thumbLen = thumbLen.asInstanceOf[js.Any], trackLen = trackLen.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarCfg]
    }
    
    @scala.inline
    implicit class ScrollbarCfgMutableBuilder[Self <: ScrollbarCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHorizontal(value: Boolean): Self = StObject.set(x, "isHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
      
      @scala.inline
      def setMaxLimit(value: Double): Self = StObject.set(x, "maxLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLimitUndefined: Self = StObject.set(x, "maxLimit", js.undefined)
      
      @scala.inline
      def setMinLimit(value: Double): Self = StObject.set(x, "minLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLimitUndefined: Self = StObject.set(x, "minLimit", js.undefined)
      
      @scala.inline
      def setMinThumbLen(value: Double): Self = StObject.set(x, "minThumbLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinThumbLenUndefined: Self = StObject.set(x, "minThumbLen", js.undefined)
      
      @scala.inline
      def setTheme(value: ScrollbarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setThumbLen(value: Double): Self = StObject.set(x, "thumbLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbOffset(value: Double): Self = StObject.set(x, "thumbOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbOffsetUndefined: Self = StObject.set(x, "thumbOffset", js.undefined)
      
      @scala.inline
      def setTrackLen(value: Double): Self = StObject.set(x, "trackLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollbarStyle extends StObject {
    
    var lineCap: String = js.native
    
    var size: Double = js.native
    
    var thumbColor: String = js.native
    
    var trackColor: String = js.native
  }
  object ScrollbarStyle {
    
    @scala.inline
    def apply(lineCap: String, size: Double, thumbColor: String, trackColor: String): ScrollbarStyle = {
      val __obj = js.Dynamic.literal(lineCap = lineCap.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbColor = thumbColor.asInstanceOf[js.Any], trackColor = trackColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarStyle]
    }
    
    @scala.inline
    implicit class ScrollbarStyleMutableBuilder[Self <: ScrollbarStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackColor(value: String): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollbarTheme extends StObject {
    
    var default: js.UndefOr[PartialReadonlyScrollbarS] = js.native
    
    var hover: js.UndefOr[PartialReadonlyScrollbarS] = js.native
  }
  object ScrollbarTheme {
    
    @scala.inline
    def apply(): ScrollbarTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollbarTheme]
    }
    
    @scala.inline
    implicit class ScrollbarThemeMutableBuilder[Self <: ScrollbarTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: PartialReadonlyScrollbarS): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setHover(value: PartialReadonlyScrollbarS): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    }
  }
}
