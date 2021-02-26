package typingsSlinky.amapJsApiStationSearch

import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiStationSearch.AMap.StationSearch.SearchResult
import typingsSlinky.amapJsApiStationSearch.AMap.StationSearch.SearchStatus
import typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete
import typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.error
import typingsSlinky.amapJsApiStationSearch.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  /**
    * 公交站点查询服务
    */
  @js.native
  trait StationSearch extends EventEmitter {
    
    /**
      * 根据给定公交站点名称进行公交站点详情查询
      * @param keyword 查询关键词，多个关键字用"|"分割
      * @param callback 查询回调
      */
    def search(
      keyword: String,
      callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
    ): Unit = js.native
    
    /**
      * 根据给定的公交站点id进行公交站点详情检索
      * @param id 公交站点的唯一标识
      * @param callback 查询回调
      */
    def searchById(
      id: String,
      callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
    ): Unit = js.native
    
    /**
      * 设置查询城市
      * @param city 城市:cityname（中文或中文全拼）、citycode或adcode
      */
    def setCity(): Unit = js.native
    def setCity(city: String): Unit = js.native
    
    /**
      * 设置查询结果页码
      * @param pageIndex 页码,取值范围：1-100
      */
    def setPageIndex(): Unit = js.native
    def setPageIndex(pageIndex: Double): Unit = js.native
    
    /**
      * 设置单页显示结果条数
      * @param pageSize 条数,取值范围：1-100
      */
    def setPageSize(): Unit = js.native
    def setPageSize(pageSize: Double): Unit = js.native
  }
  object StationSearch {
    
    @js.native
    trait Busline extends StObject {
      
      /**
        * 首发站名称
        */
      var end_stop: String = js.native
      
      /**
        * 公交线路id，该id是唯一标识
        */
      var id: String = js.native
      
      /**
        * 公交线路途经此站的经纬度
        */
      var location: LngLat = js.native
      
      /**
        * 公交线路名称
        */
      var name: String = js.native
      
      /**
        * 首发站名称
        */
      var start_stop: String = js.native
    }
    object Busline {
      
      @scala.inline
      def apply(end_stop: String, id: String, location: LngLat, name: String, start_stop: String): Busline = {
        val __obj = js.Dynamic.literal(end_stop = end_stop.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any])
        __obj.asInstanceOf[Busline]
      }
      
      @scala.inline
      implicit class BuslineMutableBuilder[Self <: Busline] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd_stop(value: String): Self = StObject.set(x, "end_stop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart_stop(value: String): Self = StObject.set(x, "start_stop", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait CityInfo extends StObject {
      
      /**
        * 行政区编码
        */
      var adcode: String = js.native
      
      /**
        * 城市编码
        */
      var citycode: String = js.native
      
      /**
        * 该城市的建议结果数目
        */
      var count: Double = js.native
      
      /**
        * 城市名称
        */
      var name: String = js.native
    }
    object CityInfo {
      
      @scala.inline
      def apply(adcode: String, citycode: String, count: Double, name: String): CityInfo = {
        val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[CityInfo]
      }
      
      @scala.inline
      implicit class CityInfoMutableBuilder[Self <: CityInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait EventMap extends StObject {
      
      var complete: Event_[
            typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete, 
            SearchResult
          ] = js.native
      
      var error: Event_[typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.error, Info] = js.native
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
    trait Options extends StObject {
      
      /**
        * 公交站点所在城市
        * 可选值：cityname（中文或中文全拼）、citycode、adcode
        * 默认值：“全国”
        */
      var city: js.UndefOr[String] = js.native
      
      /**
        * 页码
        * 默认值：1, 取值范围：1-100
        */
      var pageIndex: js.UndefOr[Double] = js.native
      
      /**
        * 单页显示结果条数
        * 默认值：20, 取值范围：1-100
        */
      var pageSize: js.UndefOr[Double] = js.native
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
        def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
        
        @scala.inline
        def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      }
    }
    
    @js.native
    trait SearchResult extends StObject {
      
      /**
        * 查该城市无此公交站时，返回的建议城市列表
        */
      var cityList: js.UndefOr[js.Array[CityInfo]] = js.native
      
      /**
        * 成功状态文字描述
        */
      var info: String = js.native
      
      /**
        * 查无此公交站时，返回的建议关键字列表，可根据建议关键字查询
        */
      var keywordList: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * 根据查询条件返回公交站点信息
        */
      var stationInfo: js.Array[StationInfo] = js.native
    }
    object SearchResult {
      
      @scala.inline
      def apply(info: String, stationInfo: js.Array[StationInfo]): SearchResult = {
        val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], stationInfo = stationInfo.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResult]
      }
      
      @scala.inline
      implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCityList(value: js.Array[CityInfo]): Self = StObject.set(x, "cityList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCityListUndefined: Self = StObject.set(x, "cityList", js.undefined)
        
        @scala.inline
        def setCityListVarargs(value: CityInfo*): Self = StObject.set(x, "cityList", js.Array(value :_*))
        
        @scala.inline
        def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeywordList(value: js.Array[String]): Self = StObject.set(x, "keywordList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeywordListUndefined: Self = StObject.set(x, "keywordList", js.undefined)
        
        @scala.inline
        def setKeywordListVarargs(value: String*): Self = StObject.set(x, "keywordList", js.Array(value :_*))
        
        @scala.inline
        def setStationInfo(value: js.Array[StationInfo]): Self = StObject.set(x, "stationInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStationInfoVarargs(value: StationInfo*): Self = StObject.set(x, "stationInfo", js.Array(value :_*))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete
      - typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.error
      - typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      @scala.inline
      def complete: typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete = "complete".asInstanceOf[typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete]
      
      @scala.inline
      def error: typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.error = "error".asInstanceOf[typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.error]
      
      @scala.inline
      def no_data: typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.no_data = "no_data".asInstanceOf[typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.no_data]
    }
    
    @js.native
    trait StationInfo extends StObject {
      
      /**
        * 区域编码
        */
      var adcode: String = js.native
      
      /**
        * 途经此站点的公交路线列表
        */
      var buslines: js.Array[Busline] = js.native
      
      /**
        * 城市编码
        */
      var citycode: String = js.native
      
      /**
        * 公交站点id，该id是唯一标识
        */
      var id: String = js.native
      
      /**
        * 公交站点经纬度
        */
      var location: LngLat = js.native
      
      /**
        * 公交站点名称
        */
      var name: String = js.native
    }
    object StationInfo {
      
      @scala.inline
      def apply(
        adcode: String,
        buslines: js.Array[Busline],
        citycode: String,
        id: String,
        location: LngLat,
        name: String
      ): StationInfo = {
        val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], buslines = buslines.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[StationInfo]
      }
      
      @scala.inline
      implicit class StationInfoMutableBuilder[Self <: StationInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBuslines(value: js.Array[Busline]): Self = StObject.set(x, "buslines", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBuslinesVarargs(value: Busline*): Self = StObject.set(x, "buslines", js.Array(value :_*))
        
        @scala.inline
        def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
