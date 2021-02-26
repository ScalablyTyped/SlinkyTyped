package typingsSlinky.amapJsApiDistrictSearch

import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiDistrictSearch.AMap.DistrictSearch.Level
import typingsSlinky.amapJsApiDistrictSearch.AMap.DistrictSearch.SearchResult
import typingsSlinky.amapJsApiDistrictSearch.AMap.DistrictSearch.SearchStatus
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`0`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`1`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`2`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`3`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.all
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.base
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error
import typingsSlinky.amapJsApiDistrictSearch.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait DistrictSearch extends EventEmitter {
    
    /**
      * 根据关键字查询行政区或商圈信息
      * @param keyword 关键词
      * @param callback 回调
      */
    def search(
      keyword: String,
      callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
    ): Unit = js.native
    
    // internal
    def setExtensions(): Unit = js.native
    def setExtensions(extensions: Boolean): Unit = js.native
    
    /**
      * 设置关键字对应的行政区级别或商圈
      * @param level 级别
      */
    def setLevel(): Unit = js.native
    def setLevel(level: Level): Unit = js.native
    
    /**
      * 设置下级行政区级数
      * @param district 级数
      */
    def setSubdistrict(): Unit = js.native
    @JSName("setSubdistrict")
    def setSubdistrict_0(district: `0`): Unit = js.native
    @JSName("setSubdistrict")
    def setSubdistrict_1(district: `1`): Unit = js.native
    @JSName("setSubdistrict")
    def setSubdistrict_2(district: `2`): Unit = js.native
    @JSName("setSubdistrict")
    def setSubdistrict_3(district: `3`): Unit = js.native
  }
  object DistrictSearch {
    
    @js.native
    trait District extends StObject {
      
      /**
        * 区域编码
        */
      var adcode: String = js.native
      
      /**
        * 边界坐标集合
        */
      var boundaries: js.UndefOr[js.Array[js.Array[LngLat]]] = js.native
      
      /**
        * 中心点经纬度坐标
        */
      var center: LngLat = js.native
      
      /**
        * 城市编码
        */
      var citycode: String = js.native
      
      /**
        * 下级行政区信息列表
        */
      var districtList: js.UndefOr[js.Array[District]] = js.native
      
      /**
        * 行政区划级别
        */
      var level: Level = js.native
      
      /**
        * 行政区名称
        */
      var name: String = js.native
    }
    object District {
      
      @scala.inline
      def apply(adcode: String, center: LngLat, citycode: String, level: Level, name: String): District = {
        val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[District]
      }
      
      @scala.inline
      implicit class DistrictMutableBuilder[Self <: District] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundaries(value: js.Array[js.Array[LngLat]]): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundariesUndefined: Self = StObject.set(x, "boundaries", js.undefined)
        
        @scala.inline
        def setBoundariesVarargs(value: js.Array[LngLat]*): Self = StObject.set(x, "boundaries", js.Array(value :_*))
        
        @scala.inline
        def setCenter(value: LngLat): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDistrictList(value: js.Array[District]): Self = StObject.set(x, "districtList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDistrictListUndefined: Self = StObject.set(x, "districtList", js.undefined)
        
        @scala.inline
        def setDistrictListVarargs(value: District*): Self = StObject.set(x, "districtList", js.Array(value :_*))
        
        @scala.inline
        def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait EventMap extends StObject {
      
      var complete: Event_[
            typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete, 
            SearchResult
          ] = js.native
      
      var error: Event_[typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error, Info] = js.native
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
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.country
      - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.province
      - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.city
      - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.district
      - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.biz_area
    */
    trait Level extends StObject
    object Level {
      
      @scala.inline
      def biz_area: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.biz_area = "biz_area".asInstanceOf[typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.biz_area]
      
      @scala.inline
      def city: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.city = "city".asInstanceOf[typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.city]
      
      @scala.inline
      def country: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.country = "country".asInstanceOf[typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.country]
      
      @scala.inline
      def district: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.district = "district".asInstanceOf[typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.district]
      
      @scala.inline
      def province: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.province = "province".asInstanceOf[typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.province]
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * 是否返回行政区边界坐标点
        */
      var extensions: js.UndefOr[base | all] = js.native
      
      /**
        * 关键字对应的行政区级别或商圈
        */
      var level: js.UndefOr[Level] = js.native
      
      /**
        * 是否显示商圈
        */
      var showbiz: js.UndefOr[Boolean] = js.native
      
      /**
        * 显示下级行政区级数
        * 0：不返回下级行政区
        * 1：返回下一级行政区
        * 2：返回下两级行政区
        * 3：返回下三级行政区
        */
      var subdistrict: js.UndefOr[`0` | `1` | `2` | `3`] = js.native
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
        def setExtensions(value: base | all): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
        
        @scala.inline
        def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
        
        @scala.inline
        def setShowbiz(value: Boolean): Self = StObject.set(x, "showbiz", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowbizUndefined: Self = StObject.set(x, "showbiz", js.undefined)
        
        @scala.inline
        def setSubdistrict(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "subdistrict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubdistrictUndefined: Self = StObject.set(x, "subdistrict", js.undefined)
      }
    }
    
    @js.native
    trait SearchResult extends StObject {
      
      /**
        * 行政区划列表
        */
      var districtList: js.Array[District] = js.native
      
      /**
        * 成功状态文字描述
        */
      var info: String = js.native
    }
    object SearchResult {
      
      @scala.inline
      def apply(districtList: js.Array[District], info: String): SearchResult = {
        val __obj = js.Dynamic.literal(districtList = districtList.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResult]
      }
      
      @scala.inline
      implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDistrictList(value: js.Array[District]): Self = StObject.set(x, "districtList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDistrictListVarargs(value: District*): Self = StObject.set(x, "districtList", js.Array(value :_*))
        
        @scala.inline
        def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete
      - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error
      - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      @scala.inline
      def complete: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete = "complete".asInstanceOf[typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete]
      
      @scala.inline
      def error: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error = "error".asInstanceOf[typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error]
      
      @scala.inline
      def no_data: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data = "no_data".asInstanceOf[typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data]
    }
  }
}
