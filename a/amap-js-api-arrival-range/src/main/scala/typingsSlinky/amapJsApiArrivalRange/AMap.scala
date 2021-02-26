package typingsSlinky.amapJsApiArrivalRange

import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.LocationValue
import typingsSlinky.amapJsApiArrivalRange.AMap.ArrivalRange.SearchOptions
import typingsSlinky.amapJsApiArrivalRange.AMap.ArrivalRange.SearchResult
import typingsSlinky.amapJsApiArrivalRange.AMap.ArrivalRange.SearchStatus
import typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.coverage
import typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
import typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.polygon
import typingsSlinky.amapJsApiArrivalRange.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  /**
    * 公交到达圈展示
    */
  @js.native
  trait ArrivalRange extends EventEmitter {
    
    /**
      * 计算某个时间段内用户通过公交出行可到达的距离范围
      * @param origin 起始点
      * @param time 时间
      * @param callback 回调
      * @param opts 选项
      */
    def search(
      origin: LocationValue,
      time: Double,
      callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
    ): Unit = js.native
    def search(
      origin: LocationValue,
      time: Double,
      callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit],
      opts: SearchOptions
    ): Unit = js.native
  }
  object ArrivalRange {
    
    @js.native
    trait EventMap extends StObject {
      
      var error: Event_[typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error, Info] = js.native
    }
    object EventMap {
      
      @scala.inline
      def apply(error: Event_[error, Info]): EventMap = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SearchOptions extends StObject {
      
      // useless
      /**
        * 选择一个想到达的目的地坐标，最多支持5个目的地坐标
        */
      var destination: js.UndefOr[LocationValue | js.Array[LocationValue]] = js.native
      
      /**
        * 公交出行策略,可选为：地铁：SUBWAY， 公交：BUS，多策略使用逗号分隔
        */
      var policy: js.UndefOr[String] = js.native
      
      // 'BUS' | 'SUBWAY' | 'BUS,SUBWAY' | 'SUBWAY,BUS';
      /**
        * 结果返回样式：polygon：返回多边形边界值，coverage：判断设定的终点坐标是否在到达圈范围内
        */
      var resultType: js.UndefOr[polygon | coverage] = js.native
    }
    object SearchOptions {
      
      @scala.inline
      def apply(): SearchOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchOptions]
      }
      
      @scala.inline
      implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestination(value: LocationValue | js.Array[LocationValue]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
        
        @scala.inline
        def setDestinationVarargs(value: LocationValue*): Self = StObject.set(x, "destination", js.Array(value :_*))
        
        @scala.inline
        def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
        
        @scala.inline
        def setResultType(value: polygon | coverage): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
      }
    }
    
    @js.native
    trait SearchResult extends StObject {
      
      /**
        * 到达圈边界坐标点
        */
      var bounds: js.Array[js.Array[js.Array[js.Array[String]]]] = js.native
      
      /**
        * 提供的终点坐标是否在到达圈内
        */
      var inRange: js.UndefOr[js.Array[Boolean]] = js.native
      
      /**
        * 查询状态说明
        */
      var info: String = js.native
      
      // internal
      var infocode: String = js.native
    }
    object SearchResult {
      
      @scala.inline
      def apply(bounds: js.Array[js.Array[js.Array[js.Array[String]]]], info: String, infocode: String): SearchResult = {
        val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], infocode = infocode.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResult]
      }
      
      @scala.inline
      implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBounds(value: js.Array[js.Array[js.Array[js.Array[String]]]]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsVarargs(value: js.Array[js.Array[js.Array[String]]]*): Self = StObject.set(x, "bounds", js.Array(value :_*))
        
        @scala.inline
        def setInRange(value: js.Array[Boolean]): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
        
        @scala.inline
        def setInRangeVarargs(value: Boolean*): Self = StObject.set(x, "inRange", js.Array(value :_*))
        
        @scala.inline
        def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfocode(value: String): Self = StObject.set(x, "infocode", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.complete
      - typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
      - typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      @scala.inline
      def complete: typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.complete = "complete".asInstanceOf[typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.complete]
      
      @scala.inline
      def error: typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error = "error".asInstanceOf[typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error]
      
      @scala.inline
      def no_data: typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.no_data = "no_data".asInstanceOf[typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.no_data]
    }
  }
}
