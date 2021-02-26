package typingsSlinky.amapJsApiCitySearch

import typingsSlinky.amapJsApi.AMap.Bounds
import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiCitySearch.AMap.CitySearch.SearchResult
import typingsSlinky.amapJsApiCitySearch.AMap.CitySearch.SearchStatus
import typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete
import typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.error
import typingsSlinky.amapJsApiCitySearch.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  /**
    * 根据IP返回对应城市信息
    */
  @js.native
  trait CitySearch extends EventEmitter {
    
    /**
      * 根据输入IP地址返回对应城市信息
      * @param ip IP
      * @param callback 查询回调
      */
    def getCityByIp(
      ip: String,
      callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
    ): Unit = js.native
    
    /**
      * 自动获取用户IP，回调返回当前用户所在城市
      * @param callback 查询回调
      */
    def getLocalCity(callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]): Unit = js.native
  }
  object CitySearch {
    
    @js.native
    trait EventMap extends StObject {
      
      var complete: Event_[
            typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete, 
            SearchResult
          ] = js.native
      
      var error: Event_[typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.error, Info] = js.native
    }
    object EventMap {
      
      @scala.inline
      def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
        val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setComplete(value: Event_[complete, SearchResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SearchResult extends StObject {
      
      /**
        * 地区编号
        */
      var adcode: String = js.native
      
      /**
        * 城市范围
        */
      var bounds: Bounds = js.native
      
      /**
        * 城市名称
        */
      var city: String = js.native
      
      /**
        * 成功信息
        */
      var info: String = js.native
      
      /**
        * 查询信息码
        */
      var infocode: String = js.native
      
      /**
        * 省份
        */
      var province: String = js.native
      
      var rectangle: String = js.native
      
      /**
        * 查询状态
        */
      var status: String = js.native
    }
    object SearchResult {
      
      @scala.inline
      def apply(
        adcode: String,
        bounds: Bounds,
        city: String,
        info: String,
        infocode: String,
        province: String,
        rectangle: String,
        status: String
      ): SearchResult = {
        val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], infocode = infocode.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResult]
      }
      
      @scala.inline
      implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfocode(value: String): Self = StObject.set(x, "infocode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRectangle(value: String): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.error
      - typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete
      - typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      @scala.inline
      def complete: typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete = "complete".asInstanceOf[typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete]
      
      @scala.inline
      def error: typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.error = "error".asInstanceOf[typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.error]
      
      @scala.inline
      def no_data: typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.no_data = "no_data".asInstanceOf[typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.no_data]
    }
  }
}
