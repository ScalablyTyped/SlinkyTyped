package typingsSlinky.amapJsApiPlaceSearch.AMap

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.amapJsApi.AMap.Bounds
import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.Lang
import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApi.AMap.LocationValue
import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApi.AMap.MapsEvent
import typingsSlinky.amapJsApi.AMap.Marker
import typingsSlinky.amapJsApi.AMap.Polygon
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.SearchResult
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.SearchStatus
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.all
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.base
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.click
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.default
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.newpc
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear
import typingsSlinky.amapJsApiPlaceSearch.anon.Adcode
import typingsSlinky.amapJsApiPlaceSearch.anon.Data
import typingsSlinky.amapJsApiPlaceSearch.anon.Deeptype
import typingsSlinky.amapJsApiPlaceSearch.anon.Event
import typingsSlinky.amapJsApiPlaceSearch.anon.Id
import typingsSlinky.amapJsApiPlaceSearch.anon.Indoordata
import typingsSlinky.amapJsApiPlaceSearch.anon.Indoormap
import typingsSlinky.amapJsApiPlaceSearch.anon.Info
import typingsSlinky.amapJsApiPlaceSearch.anon.LastSelected
import typingsSlinky.amapJsApiPlaceSearch.anon.ListElements
import typingsSlinky.amapJsApiPlaceSearch.anon.SelectChangeEventDataeven
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceSearch extends EventEmitter {
  
  /**
    * 清除搜索结果
    */
  def clear(): Unit = js.native
  
  def close(): Unit = js.native
  
  /**
    * 唤起高德地图客户端POI详情页
    * @param obj 唤起参数
    */
  def detailOnAMAP(obj: Id): Unit = js.native
  
  /**
    * 根据POIID 查询POI 详细信息
    * @param POIID POIID
    * @param callback 搜索回调
    */
  def getDetails(
    POIID: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 获取检索语言类型
    */
  def getLang(): js.UndefOr[Lang] = js.native
  
  // internal
  def open(): Unit = js.native
  
  /**
    * 唤起高德地图客户端marker页
    * @param obj 唤起参数
    */
  def poiOnAMAP(obj: Id): Unit = js.native
  
  /**
    * 根据关键字搜索
    * @param keyword 根据关键字搜索
    * @param callback 回调
    */
  def search(
    keyword: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 根据范围和关键词进行范围查询
    * @param keyword 关键字
    * @param bounds 搜索范围
    * @param callback 回调
    */
  def searchInBounds(
    keyword: String,
    bounds: Bounds,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  def searchInBounds(
    keyword: String,
    bounds: Polygon[_],
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 周边查询
    * @param keyword 关键字
    * @param center 搜索中心
    * @param radius 搜索半径
    * @param callback 回调
    */
  def searchNearBy(
    keyword: String,
    center: LocationValue,
    radius: Double,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 设置查询城市
    * @param city 城市
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  
  /**
    * 设置是否强制限制城市
    * @param limit 是否强制限制城市
    */
  def setCityLimit(): Unit = js.native
  def setCityLimit(limit: Boolean): Unit = js.native
  
  /**
    * 设置检索语言类型
    * @param lang 语言类型
    */
  def setLang(): Unit = js.native
  def setLang(lang: Lang): Unit = js.native
  
  /**
    * 设置查询结果特定页数
    * @param pageIndex 页码
    */
  def setPageIndex(): Unit = js.native
  def setPageIndex(pageIndex: Double): Unit = js.native
  
  /**
    * 设置查询单页结果数
    * @param pageSize 结果数
    */
  def setPageSize(): Unit = js.native
  def setPageSize(pageSize: Double): Unit = js.native
  
  /**
    * 设置查询类别
    * @param type 查询类别
    */
  def setType(): Unit = js.native
  def setType(`type`: String): Unit = js.native
}
object PlaceSearch {
  
  @js.native
  trait Cinema extends StObject {
    
    /**
      * 信息来源
      */
    var deep_src: String = js.native
    
    /**
      * 简介
      */
    var intro: String = js.native
    
    /**
      * 非规范格式的营业时间
      */
    var opentime: String = js.native
    
    /**
      * 规范格式的营业时间
      */
    var opentime_GDF: String = js.native
    
    /**
      * 停车场设施
      */
    var parking: String = js.native
    
    /**
      * 图片信息列表
      */
    var photos: js.Array[PoiPhoto] = js.native
    
    /**
      * 综合评分
      */
    var rating: String = js.native
  }
  object Cinema {
    
    @scala.inline
    def apply(
      deep_src: String,
      intro: String,
      opentime: String,
      opentime_GDF: String,
      parking: String,
      photos: js.Array[PoiPhoto],
      rating: String
    ): Cinema = {
      val __obj = js.Dynamic.literal(deep_src = deep_src.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], opentime = opentime.asInstanceOf[js.Any], opentime_GDF = opentime_GDF.asInstanceOf[js.Any], parking = parking.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cinema]
    }
    
    @scala.inline
    implicit class CinemaMutableBuilder[Self <: Cinema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep_src(value: String): Self = StObject.set(x, "deep_src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpentime(value: String): Self = StObject.set(x, "opentime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpentime_GDF(value: String): Self = StObject.set(x, "opentime_GDF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParking(value: String): Self = StObject.set(x, "parking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
      
      @scala.inline
      def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
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
      * 建议城市名称
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
  trait Dining extends StObject {
    
    /**
      * 餐厅特色
      */
    var addition: String = js.native
    
    /**
      * 氛围
      */
    var atmosphere: String = js.native
    
    /**
      * 人均消费
      */
    var cost: String = js.native
    
    /**
      * 单数据源的评分
      */
    var cp_rating: String = js.native
    
    /**
      * 菜系
      */
    var cuisines: String = js.native
    
    /**
      * 信息来源
      */
    var deep_src: String = js.native
    
    /**
      * 环境评分
      */
    var environment_rating: String = js.native
    
    /**
      * 简介
      */
    var intro: String = js.native
    
    /**
      * 非规范格式的营业时间
      */
    var opentime: String = js.native
    
    /**
      * 规范格式的营业时间
      */
    var opentime_GDF: String = js.native
    
    /**
      * 订餐APP URL
      */
    var ordering_app_url: String = js.native
    
    /**
      * 订餐wap链接
      */
    var ordering_wap_url: String = js.native
    
    /**
      * 订餐web链接
      */
    var ordering_web_url: String = js.native
    
    /**
      * 图片信息列表
      */
    var photos: js.Array[PoiPhoto] = js.native
    
    /**
      * 综合评分
      */
    var rating: String = js.native
    
    /**
      * 特色菜
      */
    var recommend: String = js.native
    
    /**
      * 服务评分
      */
    var service_rating: String = js.native
    
    /**
      * 标签
      */
    var tag: String = js.native
    
    /**
      * 口味评分
      */
    var taste_rating: String = js.native
  }
  object Dining {
    
    @scala.inline
    def apply(
      addition: String,
      atmosphere: String,
      cost: String,
      cp_rating: String,
      cuisines: String,
      deep_src: String,
      environment_rating: String,
      intro: String,
      opentime: String,
      opentime_GDF: String,
      ordering_app_url: String,
      ordering_wap_url: String,
      ordering_web_url: String,
      photos: js.Array[PoiPhoto],
      rating: String,
      recommend: String,
      service_rating: String,
      tag: String,
      taste_rating: String
    ): Dining = {
      val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], atmosphere = atmosphere.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], cp_rating = cp_rating.asInstanceOf[js.Any], cuisines = cuisines.asInstanceOf[js.Any], deep_src = deep_src.asInstanceOf[js.Any], environment_rating = environment_rating.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], opentime = opentime.asInstanceOf[js.Any], opentime_GDF = opentime_GDF.asInstanceOf[js.Any], ordering_app_url = ordering_app_url.asInstanceOf[js.Any], ordering_wap_url = ordering_wap_url.asInstanceOf[js.Any], ordering_web_url = ordering_web_url.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], recommend = recommend.asInstanceOf[js.Any], service_rating = service_rating.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], taste_rating = taste_rating.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dining]
    }
    
    @scala.inline
    implicit class DiningMutableBuilder[Self <: Dining] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddition(value: String): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtmosphere(value: String): Self = StObject.set(x, "atmosphere", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCost(value: String): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCp_rating(value: String): Self = StObject.set(x, "cp_rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCuisines(value: String): Self = StObject.set(x, "cuisines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeep_src(value: String): Self = StObject.set(x, "deep_src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment_rating(value: String): Self = StObject.set(x, "environment_rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpentime(value: String): Self = StObject.set(x, "opentime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpentime_GDF(value: String): Self = StObject.set(x, "opentime_GDF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdering_app_url(value: String): Self = StObject.set(x, "ordering_app_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdering_wap_url(value: String): Self = StObject.set(x, "ordering_wap_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdering_web_url(value: String): Self = StObject.set(x, "ordering_web_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
      
      @scala.inline
      def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecommend(value: String): Self = StObject.set(x, "recommend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService_rating(value: String): Self = StObject.set(x, "service_rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaste_rating(value: String): Self = StObject.set(x, "taste_rating", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Discount extends StObject {
    
    /**
      * 优惠详情
      */
    var detail: String = js.native
    
    /**
      * 结束时间
      */
    var end_time: String = js.native
    
    /**
      * 图片信息列表
      */
    var photos: js.Array[PoiPhoto] = js.native
    
    /**
      * 来源标识
      */
    var provider: String = js.native
    
    /**
      * 已卖出数量
      */
    var sold_num: Double = js.native
    
    /**
      * 开始时间
      */
    var start_time: String = js.native
    
    /**
      * 优惠标题
      */
    var title: String = js.native
    
    /**
      * 来源url
      */
    var url: String = js.native
  }
  object Discount {
    
    @scala.inline
    def apply(
      detail: String,
      end_time: String,
      photos: js.Array[PoiPhoto],
      provider: String,
      sold_num: Double,
      start_time: String,
      title: String,
      url: String
    ): Discount = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], sold_num = sold_num.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Discount]
    }
    
    @scala.inline
    implicit class DiscountMutableBuilder[Self <: Discount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSold_num(value: Double): Self = StObject.set(x, "sold_num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventMap extends StObject {
    
    var complete: Event_[
        typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete, 
        SearchResult
      ] = js.native
    
    var error: Event_[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error, Info] = js.native
    
    var infoWindowClick: Event_[
        typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick, 
        SelectChangeEventDataeven
      ] = js.native
    
    var listElementClick: SelectChangeEvent[
        typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick, 
        MouseEvent
      ] = js.native
    
    // typo in source code
    var listElementDetroyed: Event_[
        typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed, 
        SelectChangeEventData
      ] = js.native
    
    var markerClick: SelectChangeEvent[
        typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick, 
        MapsEvent[click, Marker[_]]
      ] = js.native
    
    var markerDestoryed: Event_[
        typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed, 
        SelectChangeEventData
      ] = js.native
    
    // internal
    var renderComplete: Event_[
        typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete, 
        ListElements
      ] = js.native
    
    var selectChanged: Event_[
        typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged, 
        LastSelected
      ] = js.native
    
    var willClear: Event_[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear, Data] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply(
      complete: Event_[complete, SearchResult],
      error: Event_[error, Info],
      infoWindowClick: Event_[infoWindowClick, SelectChangeEventDataeven],
      listElementClick: SelectChangeEvent[listElementClick, MouseEvent],
      listElementDetroyed: Event_[listElementDetroyed, SelectChangeEventData],
      markerClick: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]],
      markerDestoryed: Event_[markerDestoryed, SelectChangeEventData],
      renderComplete: Event_[renderComplete, ListElements],
      selectChanged: Event_[selectChanged, LastSelected],
      willClear: Event_[willClear, Data]
    ): EventMap = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], infoWindowClick = infoWindowClick.asInstanceOf[js.Any], listElementClick = listElementClick.asInstanceOf[js.Any], listElementDetroyed = listElementDetroyed.asInstanceOf[js.Any], markerClick = markerClick.asInstanceOf[js.Any], markerDestoryed = markerDestoryed.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any], selectChanged = selectChanged.asInstanceOf[js.Any], willClear = willClear.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Event_[complete, SearchResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoWindowClick(value: Event_[infoWindowClick, SelectChangeEventDataeven]): Self = StObject.set(x, "infoWindowClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListElementClick(value: SelectChangeEvent[listElementClick, MouseEvent]): Self = StObject.set(x, "listElementClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListElementDetroyed(value: Event_[listElementDetroyed, SelectChangeEventData]): Self = StObject.set(x, "listElementDetroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerClick(value: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]]): Self = StObject.set(x, "markerClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerDestoryed(value: Event_[markerDestoryed, SelectChangeEventData]): Self = StObject.set(x, "markerDestoryed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderComplete(value: Event_[renderComplete, ListElements]): Self = StObject.set(x, "renderComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectChanged(value: Event_[selectChanged, LastSelected]): Self = StObject.set(x, "selectChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWillClear(value: Event_[willClear, Data]): Self = StObject.set(x, "willClear", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Groupbuy extends StObject {
    
    /**
      * 团购总量
      */
    var count: Double = js.native
    
    /**
      * 团购详情
      */
    var detail: String = js.native
    
    /**
      * 折扣
      */
    var discount: Double = js.native
    
    /**
      * 团购结束时间
      */
    var etime: String = js.native
    
    /**
      * 折扣价
      */
    var groupbuy_price: Double = js.native
    
    /**
      * 原价
      */
    var original_price: Double = js.native
    
    /**
      * 图片信息
      */
    var photos: js.Array[PoiPhoto] = js.native
    
    /**
      * 来源标识
      */
    var provider: String = js.native
    
    /**
      * 已卖出数量
      */
    var sold_num: Double = js.native
    
    /**
      * 团购开始时间
      */
    var stime: String = js.native
    
    /**
      * 取票地址
      */
    var ticket_address: String = js.native
    
    /**
      * 取票电话
      */
    var ticket_tel: String = js.native
    
    /**
      * 团购标题
      */
    var title: String = js.native
    
    /**
      * 团购分类
      */
    var `type`: String = js.native
    
    /**
      * 团购分类代码
      */
    var type_code: String = js.native
    
    /**
      * 来源url
      */
    var url: String = js.native
  }
  object Groupbuy {
    
    @scala.inline
    def apply(
      count: Double,
      detail: String,
      discount: Double,
      etime: String,
      groupbuy_price: Double,
      original_price: Double,
      photos: js.Array[PoiPhoto],
      provider: String,
      sold_num: Double,
      stime: String,
      ticket_address: String,
      ticket_tel: String,
      title: String,
      `type`: String,
      type_code: String,
      url: String
    ): Groupbuy = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], etime = etime.asInstanceOf[js.Any], groupbuy_price = groupbuy_price.asInstanceOf[js.Any], original_price = original_price.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], sold_num = sold_num.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any], ticket_address = ticket_address.asInstanceOf[js.Any], ticket_tel = ticket_tel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], type_code = type_code.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Groupbuy]
    }
    
    @scala.inline
    implicit class GroupbuyMutableBuilder[Self <: Groupbuy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscount(value: Double): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtime(value: String): Self = StObject.set(x, "etime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupbuy_price(value: Double): Self = StObject.set(x, "groupbuy_price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_price(value: Double): Self = StObject.set(x, "original_price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSold_num(value: Double): Self = StObject.set(x, "sold_num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStime(value: String): Self = StObject.set(x, "stime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicket_address(value: String): Self = StObject.set(x, "ticket_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicket_tel(value: String): Self = StObject.set(x, "ticket_tel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType_code(value: String): Self = StObject.set(x, "type_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Hotel extends StObject {
    
    /**
      * 特色服务
      */
    var addition: String = js.native
    
    /**
      * 信息来源
      */
    var deep_src: String = js.native
    
    /**
      * 环境评分
      */
    var environment_rating: String = js.native
    
    /**
      * 设施评分
      */
    var faci_rating: String = js.native
    
    /**
      * 卫生评分
      */
    var health_rating: String = js.native
    
    /**
      * 简介
      */
    var intro: String = js.native
    
    /**
      * 最低房价
      */
    var lowest_price: String = js.native
    
    /**
      * 图片信息列表
      */
    var photos: js.Array[PoiPhoto] = js.native
    
    /**
      * 综合评分
      */
    var rating: String = js.native
    
    /**
      * 服务评分
      */
    var service_rating: String = js.native
    
    /**
      * 星级
      */
    var star: String = js.native
    
    /**
      * 交通提示
      */
    var traffic: String = js.native
  }
  object Hotel {
    
    @scala.inline
    def apply(
      addition: String,
      deep_src: String,
      environment_rating: String,
      faci_rating: String,
      health_rating: String,
      intro: String,
      lowest_price: String,
      photos: js.Array[PoiPhoto],
      rating: String,
      service_rating: String,
      star: String,
      traffic: String
    ): Hotel = {
      val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], deep_src = deep_src.asInstanceOf[js.Any], environment_rating = environment_rating.asInstanceOf[js.Any], faci_rating = faci_rating.asInstanceOf[js.Any], health_rating = health_rating.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], lowest_price = lowest_price.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], service_rating = service_rating.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hotel]
    }
    
    @scala.inline
    implicit class HotelMutableBuilder[Self <: Hotel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddition(value: String): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeep_src(value: String): Self = StObject.set(x, "deep_src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment_rating(value: String): Self = StObject.set(x, "environment_rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaci_rating(value: String): Self = StObject.set(x, "faci_rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealth_rating(value: String): Self = StObject.set(x, "health_rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowest_price(value: String): Self = StObject.set(x, "lowest_price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
      
      @scala.inline
      def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService_rating(value: String): Self = StObject.set(x, "service_rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStar(value: String): Self = StObject.set(x, "star", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraffic(value: String): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * 是否自动调整地图视野使绘制的Marker点都处于视口的可见范围
      */
    var autoFitView: js.UndefOr[Boolean] = js.native
    
    /**
      * 是否按照层级展示子POI数据
      * children=1，展示子节点POI数据，children=0，不展示子节点数据
      */
    var children: js.UndefOr[Double] = js.native
    
    /**
      * 兴趣点城市
      */
    var city: js.UndefOr[String] = js.native
    
    /**
      * 是否强制限制在设置的城市内搜索
      */
    var citylimit: js.UndefOr[Boolean] = js.native
    
    /**
      * 是否返回详细信息
      * base返回基本地址信息；all返回基本+详细信息
      */
    var extensions: js.UndefOr[base | all] = js.native
    
    /**
      * 检索语言类型
      */
    var lang: js.UndefOr[Lang] = js.native
    
    /**
      * Map对象
      */
    var map: js.UndefOr[Map] = js.native
    
    /**
      * 页码
      */
    var pageIndex: js.UndefOr[Double] = js.native
    
    /**
      * 单页显示结果条数
      */
    var pageSize: js.UndefOr[Double] = js.native
    
    /**
      * 结果列表的HTML容器id或容器元素
      */
    var panel: js.UndefOr[String | HTMLElement] = js.native
    
    var rankBy: js.UndefOr[String] = js.native
    
    // internal
    var renderEngine: js.UndefOr[String] = js.native
    
    /**
      * 绘制的UI风格
      */
    var renderStyle: js.UndefOr[newpc | default] = js.native
    
    /**
      * 是否在地图上显示周边搜索的圆或者范围搜索的多边形
      */
    var showCover: js.UndefOr[Boolean] = js.native
    
    /**
      * 兴趣点类别，多个类别用“|”分割
      */
    var `type`: js.UndefOr[String] = js.native
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
      def setAutoFitView(value: Boolean): Self = StObject.set(x, "autoFitView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFitViewUndefined: Self = StObject.set(x, "autoFitView", js.undefined)
      
      @scala.inline
      def setChildren(value: Double): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCitylimit(value: Boolean): Self = StObject.set(x, "citylimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCitylimitUndefined: Self = StObject.set(x, "citylimit", js.undefined)
      
      @scala.inline
      def setExtensions(value: base | all): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setLang(value: Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelHTMLElement(value: HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      @scala.inline
      def setRankBy(value: String): Self = StObject.set(x, "rankBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRankByUndefined: Self = StObject.set(x, "rankBy", js.undefined)
      
      @scala.inline
      def setRenderEngine(value: String): Self = StObject.set(x, "renderEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderEngineUndefined: Self = StObject.set(x, "renderEngine", js.undefined)
      
      @scala.inline
      def setRenderStyle(value: newpc | default): Self = StObject.set(x, "renderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderStyleUndefined: Self = StObject.set(x, "renderStyle", js.undefined)
      
      @scala.inline
      def setShowCover(value: Boolean): Self = StObject.set(x, "showCover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCoverUndefined: Self = StObject.set(x, "showCover", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Poi = PoiBase | PoiExt
  
  @js.native
  trait PoiBase extends StObject {
    
    /**
      * 地址
      */
    var address: String = js.native
    
    var children: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * 离中心点距离
      */
    var distance: Double = js.native
    
    /**
      * 全局唯一ID
      */
    var id: String = js.native
    
    /**
      * 兴趣点经纬度
      */
    var location: LngLat | Null = js.native
    
    /**
      * 名称
      */
    var name: String = js.native
    
    var shopinfo: String = js.native
    
    /**
      * 电话
      */
    var tel: String = js.native
    
    /**
      * 兴趣点类型
      */
    var `type`: String = js.native
  }
  object PoiBase {
    
    @scala.inline
    def apply(
      address: String,
      distance: Double,
      id: String,
      name: String,
      shopinfo: String,
      tel: String,
      `type`: String
    ): PoiBase = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shopinfo = shopinfo.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoiBase]
    }
    
    @scala.inline
    implicit class PoiBaseMutableBuilder[Self <: PoiBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: js.Array[_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShopinfo(value: String): Self = StObject.set(x, "shopinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTel(value: String): Self = StObject.set(x, "tel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PoiExt = Adcode with PoiBase with (Indoordata | Indoormap) with (typingsSlinky.amapJsApiPlaceSearch.anon.Cinema | Deeptype | typingsSlinky.amapJsApiPlaceSearch.anon.Scenic | typingsSlinky.amapJsApiPlaceSearch.anon.Hotel)
  
  @js.native
  trait PoiList extends StObject {
    
    /**
      * 查询结果总数
      */
    var count: Double = js.native
    
    // PlaceSearchPoiBase[] | PlaceSearchPoiExt[];
    /**
      * 页码
      */
    var pageIndex: Double = js.native
    
    /**
      * 单页结果数
      */
    var pageSize: Double = js.native
    
    /**
      * Poi列表
      */
    var pois: js.Array[Poi] = js.native
  }
  object PoiList {
    
    @scala.inline
    def apply(count: Double, pageIndex: Double, pageSize: Double, pois: js.Array[Poi]): PoiList = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoiList]
    }
    
    @scala.inline
    implicit class PoiListMutableBuilder[Self <: PoiList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPois(value: js.Array[Poi]): Self = StObject.set(x, "pois", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoisVarargs(value: Poi*): Self = StObject.set(x, "pois", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PoiPhoto extends StObject {
    
    /**
      * 图片名称
      */
    var title: String = js.native
    
    /**
      * 图片url
      */
    var url: String = js.native
  }
  object PoiPhoto {
    
    @scala.inline
    def apply(title: String, url: String): PoiPhoto = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoiPhoto]
    }
    
    @scala.inline
    implicit class PoiPhotoMutableBuilder[Self <: PoiPhoto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scenic extends StObject {
    
    /**
      * 信息来源
      */
    var deep_src: String = js.native
    
    /**
      * 简介
      */
    var intro: String = js.native
    
    /**
      * 景区国标级别
      */
    var level: String = js.native
    
    /**
      * 非规范格式的营业时间
      */
    var opentime: String = js.native
    
    /**
      * 规范格式的营业时间
      */
    var opentime_GDF: String = js.native
    
    /**
      * wap购票链接
      */
    var ordering_wap_url: String = js.native
    
    /**
      * web购票链接
      */
    var ordering_web_url: String = js.native
    
    /**
      * 图片信息列表
      */
    var photos: js.Array[PoiPhoto] = js.native
    
    /**
      * 门票价格
      */
    var price: String = js.native
    
    /**
      * 综合评分
      */
    var rating: String = js.native
    
    /**
      * 推荐景点
      */
    var recommend: String = js.native
    
    /**
      * 适合游玩的季节
      */
    var season: String = js.native
    
    /**
      * 景区主题
      */
    var theme: String = js.native
  }
  object Scenic {
    
    @scala.inline
    def apply(
      deep_src: String,
      intro: String,
      level: String,
      opentime: String,
      opentime_GDF: String,
      ordering_wap_url: String,
      ordering_web_url: String,
      photos: js.Array[PoiPhoto],
      price: String,
      rating: String,
      recommend: String,
      season: String,
      theme: String
    ): Scenic = {
      val __obj = js.Dynamic.literal(deep_src = deep_src.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], opentime = opentime.asInstanceOf[js.Any], opentime_GDF = opentime_GDF.asInstanceOf[js.Any], ordering_wap_url = ordering_wap_url.asInstanceOf[js.Any], ordering_web_url = ordering_web_url.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], recommend = recommend.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scenic]
    }
    
    @scala.inline
    implicit class ScenicMutableBuilder[Self <: Scenic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep_src(value: String): Self = StObject.set(x, "deep_src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpentime(value: String): Self = StObject.set(x, "opentime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpentime_GDF(value: String): Self = StObject.set(x, "opentime_GDF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdering_wap_url(value: String): Self = StObject.set(x, "ordering_wap_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdering_web_url(value: String): Self = StObject.set(x, "ordering_web_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
      
      @scala.inline
      def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecommend(value: String): Self = StObject.set(x, "recommend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchResult extends StObject {
    
    /**
      * 城市建议列表
      */
    var cityList: js.UndefOr[js.Array[CityInfo]] = js.native
    
    /**
      * 成功状态说明
      */
    var info: String = js.native
    
    /**
      * 建议关键字列表
      */
    var keywordList: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * 兴趣点列表
      */
    var poiList: PoiList = js.native
  }
  object SearchResult {
    
    @scala.inline
    def apply(info: String, poiList: PoiList): SearchResult = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], poiList = poiList.asInstanceOf[js.Any])
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
      def setPoiList(value: PoiList): Self = StObject.set(x, "poiList", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete
    - typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error
    - typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data
  */
  trait SearchStatus extends StObject
  object SearchStatus {
    
    @scala.inline
    def complete: typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete = "complete".asInstanceOf[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete]
    
    @scala.inline
    def error: typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error = "error".asInstanceOf[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error]
    
    @scala.inline
    def no_data: typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data = "no_data".asInstanceOf[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data]
  }
  
  type SelectChangeEvent[N /* <: String */, E] = Event_[N, SelectChangeEventData with Event[E]]
  
  @js.native
  trait SelectChangeEventData extends StObject {
    
    /**
      * 当前选中的POI的信息
      */
    var data: js.Array[Poi] = js.native
    
    /**
      * 当前选中的POI的ID
      */
    var id: String = js.native
    
    /**
      * 索引
      */
    var index: Double = js.native
    
    /**
      * 当前选中的POI在结果面板中对应的列表项
      */
    var listElement: HTMLLIElement = js.native
    
    /**
      * 当前选中的POI对应的在地图中的Marker对象
      */
    var marker: Marker[_] = js.native
  }
  object SelectChangeEventData {
    
    @scala.inline
    def apply(data: js.Array[Poi], id: String, index: Double, listElement: HTMLLIElement, marker: Marker[_]): SelectChangeEventData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChangeEventData]
    }
    
    @scala.inline
    implicit class SelectChangeEventDataMutableBuilder[Self <: SelectChangeEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Poi]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Poi*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListElement(value: HTMLLIElement): Self = StObject.set(x, "listElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarker(value: Marker[_]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    }
  }
}
