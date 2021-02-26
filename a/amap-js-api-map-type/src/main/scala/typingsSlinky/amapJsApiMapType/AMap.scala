package typingsSlinky.amapJsApiMapType

import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiMapType.amapJsApiMapTypeNumbers.`0`
import typingsSlinky.amapJsApiMapType.amapJsApiMapTypeNumbers.`1`
import typingsSlinky.amapJsApiMapType.amapJsApiMapTypeStrings.hide
import typingsSlinky.amapJsApiMapType.amapJsApiMapTypeStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait MapType extends EventEmitter {
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object MapType {
    
    @js.native
    trait EventMap extends StObject {
      
      var hide: Event_[
            typingsSlinky.amapJsApiMapType.amapJsApiMapTypeStrings.hide, 
            js.UndefOr[scala.Nothing]
          ] = js.native
      
      var show: Event_[
            typingsSlinky.amapJsApiMapType.amapJsApiMapTypeStrings.show, 
            js.UndefOr[scala.Nothing]
          ] = js.native
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
        * 初始化默认图层类型，默认为0
        * 取值为0：默认底图
        * 取值为1：卫星图
        */
      var defaultType: js.UndefOr[`0` | `1`] = js.native
      
      /**
        * 是否叠加路网图层，默认false
        */
      var showRoad: js.UndefOr[Boolean] = js.native
      
      /**
        * 是否叠加实时交通图层，默认false
        */
      var showTraffic: js.UndefOr[Boolean] = js.native
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
        def setDefaultType(value: `0` | `1`): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
        
        @scala.inline
        def setShowRoad(value: Boolean): Self = StObject.set(x, "showRoad", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowRoadUndefined: Self = StObject.set(x, "showRoad", js.undefined)
        
        @scala.inline
        def setShowTraffic(value: Boolean): Self = StObject.set(x, "showTraffic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowTrafficUndefined: Self = StObject.set(x, "showTraffic", js.undefined)
      }
    }
  }
}
