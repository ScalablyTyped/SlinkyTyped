package typingsSlinky.amapJsApiScale

import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.Pixel
import typingsSlinky.amapJsApiScale.AMap.Scale.Position
import typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.hide
import typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  /**
    * 比例尺插件
    */
  @js.native
  trait Scale extends EventEmitter {
    
    /**
      * 隐藏比例尺
      */
    def hide(): Unit = js.native
    
    /**
      * 相对于地图容器左上角的偏移量
      */
    var offset: Pixel = js.native
    
    /**
      * 控件停靠位置
      */
    var position: Position = js.native
    
    /**
      * 显示比例尺
      */
    def show(): Unit = js.native
    
    /**
      * 是否可见
      */
    var visible: Boolean = js.native
  }
  object Scale {
    
    @js.native
    trait EventMap extends StObject {
      
      var hide: Event_[typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.hide, js.UndefOr[scala.Nothing]] = js.native
      
      var show: Event_[typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.show, js.UndefOr[scala.Nothing]] = js.native
    }
    object EventMap {
      
      @scala.inline
      def apply(hide: Event_[hide, js.UndefOr[scala.Nothing]], show: Event_[show, js.UndefOr[scala.Nothing]]): EventMap = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHide(value: Event_[hide, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShow(value: Event_[show, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * 相对于地图容器左上角的偏移量
        */
      var offset: js.UndefOr[Pixel] = js.native
      
      /**
        * 控件停靠位置
        * LT:左上角;
        * RT:右上角;
        * LB:左下角;
        * RB:右下角;
        * 默认位置：LB
        */
      var position: js.UndefOr[Position] = js.native
      
      /**
        * 是否可见
        */
      var visible: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        @scala.inline
        def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.LT
      - typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.RT
      - typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.LB
      - typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.RB
    */
    trait Position extends StObject
    object Position {
      
      @scala.inline
      def LB: typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.LB = "LB".asInstanceOf[typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.LB]
      
      @scala.inline
      def LT: typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.LT = "LT".asInstanceOf[typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.LT]
      
      @scala.inline
      def RB: typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.RB = "RB".asInstanceOf[typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.RB]
      
      @scala.inline
      def RT: typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.RT = "RT".asInstanceOf[typingsSlinky.amapJsApiScale.amapJsApiScaleStrings.RT]
    }
  }
}
