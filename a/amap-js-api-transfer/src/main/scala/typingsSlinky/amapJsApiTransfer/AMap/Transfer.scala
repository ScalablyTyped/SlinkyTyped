package typingsSlinky.amapJsApiTransfer.AMap

import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApi.AMap.LocationValue
import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchPoint
import typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchResultBase
import typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchResultExt
import typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchStatus
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.BUS
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.METRO_RAIL
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.RAILWAY
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.SUBWAY
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.TAXI
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.WALK
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.all
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.base
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.complete
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.end
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.error
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.start
import typingsSlinky.amapJsApiTransfer.anon.Destination
import typingsSlinky.amapJsApiTransfer.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transfer extends EventEmitter {
  
  /**
    * 清除结果显示
    */
  def clear(): Unit = js.native
  
  def close(): Unit = js.native
  
  /**
    * 设置公交路径规划出发时间
    * @param time 时间
    * @param date 日期
    */
  def leaveAt(): Unit = js.native
  def leaveAt(time: js.UndefOr[scala.Nothing], date: String): Unit = js.native
  def leaveAt(time: String): Unit = js.native
  def leaveAt(time: String, date: String): Unit = js.native
  
  // internal
  def open(): Unit = js.native
  
  /**
    * 根据起点和终点坐标，进行公交换乘查询
    * @param origin 起点坐标
    * @param destination 终点坐标
    * @param callback 查询回调
    */
  def search(origin: LocationValue, destination: LocationValue): Unit = js.native
  def search(
    origin: LocationValue,
    destination: LocationValue,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultBase, Unit]
  ): Unit = js.native
  /**
    * 根据起点和终点坐标，进行公交换乘查询
    * @param path 路径名称关键字
    * @param callback 路径回调
    */
  def search(path: js.Tuple2[SearchPoint, SearchPoint]): Unit = js.native
  def search(
    path: js.Tuple2[SearchPoint, SearchPoint],
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultExt, Unit]
  ): Unit = js.native
  
  /**
    * 唤起高德地图客户端公交路径规划
    * @param obj 唤起参数
    */
  def searchOnAMAP(obj: Destination): Unit = js.native
  
  /**
    * 设置公交换乘查询的城市
    * @param city  城市名称、城市区号、电话区号
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  
  /**
    * 设置公交换乘查询的城市
    * @param city  城市名称、城市区号、电话区号
    */
  def setCityd(): Unit = js.native
  def setCityd(city: String): Unit = js.native
  
  /**
    * 设置公交换乘策略
    * @param policy 公交换乘策略
    */
  def setPolicy(): Unit = js.native
  def setPolicy(policy: TransferPolicy): Unit = js.native
}
object Transfer {
  
  @js.native
  trait Alter extends StObject {
    
    /**
      * 备选方案ID
      */
    var id: String = js.native
    
    /**
      * 备选线路名称
      */
    var name: String = js.native
  }
  object Alter {
    
    @scala.inline
    def apply(id: String, name: String): Alter = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alter]
    }
    
    @scala.inline
    implicit class AlterMutableBuilder[Self <: Alter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventMap extends StObject {
    
    var complete: Event_[typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.complete, SearchResult] = js.native
    
    var error: Event_[typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.error, Info] = js.native
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
      * 用于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
      */
    var autoFitView: js.UndefOr[Boolean] = js.native
    
    /**
      * 公交换乘的城市，支持城市名称、城市区号、电话区号，此项为必填
      */
    var city: String = js.native
    
    /**
      * 终点城市，跨城公交路径规划时为必填参数
      */
    var cityd: js.UndefOr[String] = js.native
    
    /**
      * 返回结果控制, 默认值: base
      * base:返回基本信息
      * all:返回全部信息
      */
    var extensions: js.UndefOr[all | base] = js.native
    
    /**
      * 设置是否隐藏路径规划的起始点图标
      */
    var hideMarkers: js.UndefOr[Boolean] = js.native
    
    /**
      * 使用map属性时，绘制的规划线路是否显示描边。默认为true
      */
    var isOutline: js.UndefOr[Boolean] = js.native
    
    /**
      * AMap.Map对象, 展现结果的地图实例
      */
    var map: js.UndefOr[Map] = js.native
    
    /**
      * 是否计算夜班车，默认为不计算
      */
    var nightflag: js.UndefOr[Boolean] = js.native
    
    /**
      * 使用map属性时，绘制的规划线路的描边颜色。默认为'white'
      */
    var outlineColor: js.UndefOr[String] = js.native
    
    /**
      * 结果列表的HTML容器id或容器元素
      */
    var panel: js.UndefOr[String] = js.native
    
    /**
      * 公交换乘策略
      */
    var policy: js.UndefOr[TransferPolicy] = js.native
    
    // internal
    var showDir: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(city: String): Options = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFitView(value: Boolean): Self = StObject.set(x, "autoFitView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFitViewUndefined: Self = StObject.set(x, "autoFitView", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityd(value: String): Self = StObject.set(x, "cityd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCitydUndefined: Self = StObject.set(x, "cityd", js.undefined)
      
      @scala.inline
      def setExtensions(value: all | base): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setHideMarkers(value: Boolean): Self = StObject.set(x, "hideMarkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideMarkersUndefined: Self = StObject.set(x, "hideMarkers", js.undefined)
      
      @scala.inline
      def setIsOutline(value: Boolean): Self = StObject.set(x, "isOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOutlineUndefined: Self = StObject.set(x, "isOutline", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setNightflag(value: Boolean): Self = StObject.set(x, "nightflag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNightflagUndefined: Self = StObject.set(x, "nightflag", js.undefined)
      
      @scala.inline
      def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      @scala.inline
      def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      @scala.inline
      def setPolicy(value: TransferPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setShowDir(value: Boolean): Self = StObject.set(x, "showDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDirUndefined: Self = StObject.set(x, "showDir", js.undefined)
    }
  }
  
  @js.native
  trait Poi extends StObject {
    
    var location: LngLat = js.native
    
    var name: String = js.native
    
    var `type`: start | end = js.native
  }
  object Poi {
    
    @scala.inline
    def apply(location: LngLat, name: String, `type`: start | end): Poi = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Poi]
    }
    
    @scala.inline
    implicit class PoiMutableBuilder[Self <: Poi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: start | end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RailStop extends StObject {
    
    /**
      * 上、下车站点所在城市的adcode
      */
    var adcode: String = js.native
    
    /**
      * 上、下车站点ID
      */
    var id: String = js.native
    
    /**
      * 上、下站点经纬度信息
      */
    var location: LngLat = js.native
    
    /**
      * 上、下车站点名称
      */
    var name: String = js.native
    
    var segment: js.UndefOr[RailwaySegment] = js.native
    
    /**
      * 上下车点发车时间
      */
    var time: Double = js.native
    
    @JSName("wait")
    var wait_FRailStop: js.UndefOr[Double] = js.native
  }
  object RailStop {
    
    @scala.inline
    def apply(adcode: String, id: String, location: LngLat, name: String, time: Double): RailStop = {
      val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[RailStop]
    }
    
    @scala.inline
    implicit class RailStopMutableBuilder[Self <: RailStop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegment(value: RailwaySegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwayDetailsBase
    - typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwayDetailsExt
  */
  trait RailwayDetails extends StObject
  object RailwayDetails {
    
    @scala.inline
    def RailwayDetailsBase(
      arrival_stop: RailStop,
      departure_stop: RailStop,
      distance: Double,
      id: String,
      name: String,
      spaces: js.Array[Space],
      time: Double,
      trip: String,
      `type`: String
    ): typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwayDetailsBase = {
      val __obj = js.Dynamic.literal(arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwayDetailsBase]
    }
    
    @scala.inline
    def RailwayDetailsExt(
      alters: js.Array[Alter],
      arrival_stop: RailStop,
      departure_stop: RailStop,
      distance: Double,
      id: String,
      name: String,
      spaces: js.Array[Space],
      time: Double,
      trip: String,
      `type`: String,
      via_num: Double,
      via_stops: js.Array[ViaStop]
    ): typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwayDetailsExt = {
      val __obj = js.Dynamic.literal(alters = alters.asInstanceOf[js.Any], arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwayDetailsExt]
    }
  }
  
  @js.native
  trait RailwayDetailsBase extends RailwayDetails {
    
    /**
      * 火车到站信息
      */
    var arrival_stop: RailStop = js.native
    
    /**
      * 火车始发站信息
      */
    var departure_stop: RailStop = js.native
    
    /**
      * 该换乘段的行车总距离
      */
    var distance: Double = js.native
    
    /**
      * 线路id编码
      */
    var id: String = js.native
    
    /**
      * 线路名称
      */
    var name: String = js.native
    
    /**
      * 仓位及价格信息
      */
    var spaces: js.Array[Space] = js.native
    
    /**
      * 该线路车段耗时
      */
    var time: Double = js.native
    
    /**
      * 线路车次号
      */
    var trip: String = js.native
    
    /**
      * 线路车次类型，参考火车路线类型列表
      */
    var `type`: String = js.native
  }
  object RailwayDetailsBase {
    
    @scala.inline
    def apply(
      arrival_stop: RailStop,
      departure_stop: RailStop,
      distance: Double,
      id: String,
      name: String,
      spaces: js.Array[Space],
      time: Double,
      trip: String,
      `type`: String
    ): RailwayDetailsBase = {
      val __obj = js.Dynamic.literal(arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RailwayDetailsBase]
    }
    
    @scala.inline
    implicit class RailwayDetailsBaseMutableBuilder[Self <: RailwayDetailsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrival_stop(value: RailStop): Self = StObject.set(x, "arrival_stop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeparture_stop(value: RailStop): Self = StObject.set(x, "departure_stop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaces(value: js.Array[Space]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacesVarargs(value: Space*): Self = StObject.set(x, "spaces", js.Array(value :_*))
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrip(value: String): Self = StObject.set(x, "trip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwayDetails because Already inherited */ @js.native
  trait RailwayDetailsExt extends RailwayDetailsBase {
    
    /**
      * 聚合的备选方案
      */
    var alters: js.Array[Alter] = js.native
    
    /**
      * 途经站点数量
      */
    var via_num: Double = js.native
    
    /**
      * 途经站点信息
      */
    var via_stops: js.Array[ViaStop] = js.native
  }
  object RailwayDetailsExt {
    
    @scala.inline
    def apply(
      alters: js.Array[Alter],
      arrival_stop: RailStop,
      departure_stop: RailStop,
      distance: Double,
      id: String,
      name: String,
      spaces: js.Array[Space],
      time: Double,
      trip: String,
      `type`: String,
      via_num: Double,
      via_stops: js.Array[ViaStop]
    ): RailwayDetailsExt = {
      val __obj = js.Dynamic.literal(alters = alters.asInstanceOf[js.Any], arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RailwayDetailsExt]
    }
    
    @scala.inline
    implicit class RailwayDetailsExtMutableBuilder[Self <: RailwayDetailsExt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlters(value: js.Array[Alter]): Self = StObject.set(x, "alters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltersVarargs(value: Alter*): Self = StObject.set(x, "alters", js.Array(value :_*))
      
      @scala.inline
      def setVia_num(value: Double): Self = StObject.set(x, "via_num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVia_stops(value: js.Array[ViaStop]): Self = StObject.set(x, "via_stops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVia_stopsVarargs(value: ViaStop*): Self = StObject.set(x, "via_stops", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RailwaySegment
    extends SegmentCommon
       with Segment {
    
    /**
      * 此换乘段导航信息
      */
    var transit: RailwayDetails = js.native
    
    /**
      * 换乘动作类型
      */
    var transit_mode: RAILWAY = js.native
  }
  object RailwaySegment {
    
    @scala.inline
    def apply(
      distance: Double,
      instruction: String,
      time: Double,
      transit: RailwayDetails,
      transit_mode: RAILWAY
    ): RailwaySegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RailwaySegment]
    }
    
    @scala.inline
    implicit class RailwaySegmentMutableBuilder[Self <: RailwaySegment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransit(value: RailwayDetails): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransit_mode(value: RAILWAY): Self = StObject.set(x, "transit_mode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchPoint extends StObject {
    
    /**
      * 关键词
      */
    var keyword: String = js.native
  }
  object SearchPoint {
    
    @scala.inline
    def apply(keyword: String): SearchPoint = {
      val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchPoint]
    }
    
    @scala.inline
    implicit class SearchPointMutableBuilder[Self <: SearchPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchResultBase
    - typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchResultExt
  */
  trait SearchResult extends StObject
  object SearchResult {
    
    @scala.inline
    def SearchResultBase(
      destination: LngLat,
      info: String,
      origin: LngLat,
      plans: js.Array[TransferPlan],
      taxi_cost: Double
    ): typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchResultBase = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchResultBase]
    }
    
    @scala.inline
    def SearchResultExt(
      destination: LngLat,
      destinationName: String,
      end: PoiExt,
      info: String,
      origin: LngLat,
      originName: String,
      plans: js.Array[TransferPlan],
      start: PoiExt,
      taxi_cost: Double
    ): typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchResultExt = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchResultExt]
    }
  }
  
  @js.native
  trait SearchResultBase
    extends SearchResultCommon
       with SearchResult {
    
    /**
      * 公交换乘终点
      */
    var end: js.UndefOr[Poi] = js.native
    
    /**
      * 公交换乘起点
      */
    var start: js.UndefOr[Poi] = js.native
  }
  object SearchResultBase {
    
    @scala.inline
    def apply(
      destination: LngLat,
      info: String,
      origin: LngLat,
      plans: js.Array[TransferPlan],
      taxi_cost: Double
    ): SearchResultBase = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultBase]
    }
    
    @scala.inline
    implicit class SearchResultBaseMutableBuilder[Self <: SearchResultBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Poi): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: Poi): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait SearchResultCommon extends StObject {
    
    /**
      * 公交换乘终点坐标
      */
    var destination: LngLat = js.native
    
    /**
      * 成功状态说明
      */
    var info: String = js.native
    
    /**
      * 公交换乘起点坐标
      */
    var origin: LngLat = js.native
    
    /**
      * 换乘方案列表
      */
    var plans: js.Array[TransferPlan] = js.native
    
    /**
      * 出租车费用，单位：元
      */
    var taxi_cost: Double = js.native
  }
  object SearchResultCommon {
    
    @scala.inline
    def apply(
      destination: LngLat,
      info: String,
      origin: LngLat,
      plans: js.Array[TransferPlan],
      taxi_cost: Double
    ): SearchResultCommon = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultCommon]
    }
    
    @scala.inline
    implicit class SearchResultCommonMutableBuilder[Self <: SearchResultCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: LngLat): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlans(value: js.Array[TransferPlan]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlansVarargs(value: TransferPlan*): Self = StObject.set(x, "plans", js.Array(value :_*))
      
      @scala.inline
      def setTaxi_cost(value: Double): Self = StObject.set(x, "taxi_cost", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchResultExt
    extends SearchResultCommon
       with SearchResult {
    
    /**
      * 公交换乘终点名称
      */
    var destinationName: String = js.native
    
    /**
      * 公交换乘终点
      */
    var end: PoiExt = js.native
    
    /**
      * 公交换乘起点名称
      */
    var originName: String = js.native
    
    /**
      * 公交换乘起点
      */
    var start: PoiExt = js.native
  }
  object SearchResultExt {
    
    @scala.inline
    def apply(
      destination: LngLat,
      destinationName: String,
      end: PoiExt,
      info: String,
      origin: LngLat,
      originName: String,
      plans: js.Array[TransferPlan],
      start: PoiExt,
      taxi_cost: Double
    ): SearchResultExt = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultExt]
    }
    
    @scala.inline
    implicit class SearchResultExtMutableBuilder[Self <: SearchResultExt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: PoiExt): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginName(value: String): Self = StObject.set(x, "originName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: PoiExt): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.complete
    - typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.error
    - typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.no_data
  */
  trait SearchStatus extends StObject
  object SearchStatus {
    
    @scala.inline
    def complete: typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.complete = "complete".asInstanceOf[typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.complete]
    
    @scala.inline
    def error: typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.error = "error".asInstanceOf[typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.error]
    
    @scala.inline
    def no_data: typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.no_data = "no_data".asInstanceOf[typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.no_data]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApiTransfer.AMap.Transfer.WalkSegment
    - typingsSlinky.amapJsApiTransfer.AMap.Transfer.TaxiSegment
    - typingsSlinky.amapJsApiTransfer.AMap.Transfer.TransitSegment
    - typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwaySegment
  */
  trait Segment extends StObject
  object Segment {
    
    @scala.inline
    def RailwaySegment(
      distance: Double,
      instruction: String,
      time: Double,
      transit: RailwayDetails,
      transit_mode: RAILWAY
    ): typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwaySegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwaySegment]
    }
    
    @scala.inline
    def TaxiSegment(distance: Double, instruction: String, time: Double, transit: TaxiDetails, transit_mode: TAXI): typingsSlinky.amapJsApiTransfer.AMap.Transfer.TaxiSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApiTransfer.AMap.Transfer.TaxiSegment]
    }
    
    @scala.inline
    def TransitSegment(
      distance: Double,
      instruction: String,
      time: Double,
      transit: TransitDetails,
      transit_mode: SUBWAY | METRO_RAIL | BUS
    ): typingsSlinky.amapJsApiTransfer.AMap.Transfer.TransitSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApiTransfer.AMap.Transfer.TransitSegment]
    }
    
    @scala.inline
    def WalkSegment(distance: Double, instruction: String, time: Double, transit: WalkDetails, transit_mode: WALK): typingsSlinky.amapJsApiTransfer.AMap.Transfer.WalkSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApiTransfer.AMap.Transfer.WalkSegment]
    }
  }
  
  @js.native
  trait SegmentCommon extends StObject {
    
    /**
      * 此换乘段距离
      */
    var distance: Double = js.native
    
    /**
      * 此换乘段的文字描述
      */
    var instruction: String = js.native
    
    /**
      * 此换乘段预期用时，单位：秒
      */
    var time: Double = js.native
  }
  object SegmentCommon {
    
    @scala.inline
    def apply(distance: Double, instruction: String, time: Double): SegmentCommon = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentCommon]
    }
    
    @scala.inline
    implicit class SegmentCommonMutableBuilder[Self <: SegmentCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Space extends StObject {
    
    /**
      * 仓位费用
      */
    var cost: Double = js.native
    
    /**
      * 仓位编码，参考仓位级别表
      */
    var `type`: String | js.Array[scala.Nothing] = js.native
  }
  object Space {
    
    @scala.inline
    def apply(cost: Double, `type`: String | js.Array[scala.Nothing]): Space = {
      val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Space]
    }
    
    @scala.inline
    implicit class SpaceMutableBuilder[Self <: Space] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String | js.Array[scala.Nothing]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(value: scala.Nothing*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Stop extends StObject {
    
    /**
      * 公交站点ID
      */
    var id: String = js.native
    
    /**
      * 站点经纬度信息
      */
    var location: LngLat = js.native
    
    /**
      * 公交站点名称
      */
    var name: String = js.native
    
    var segment: js.UndefOr[TransitSegment] = js.native
  }
  object Stop {
    
    @scala.inline
    def apply(id: String, location: LngLat, name: String): Stop = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stop]
    }
    
    @scala.inline
    implicit class StopMutableBuilder[Self <: Stop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegment(value: TransitSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    }
  }
  
  @js.native
  trait SubwayEntrance extends StObject {
    
    /**
      * 地铁口经纬度坐标
      */
    var location: LngLat = js.native
    
    /**
      * 地铁口名称
      */
    var name: String = js.native
  }
  object SubwayEntrance {
    
    @scala.inline
    def apply(location: LngLat, name: String): SubwayEntrance = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubwayEntrance]
    }
    
    @scala.inline
    implicit class SubwayEntranceMutableBuilder[Self <: SubwayEntrance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaxiDetails extends StObject {
    
    /**
      * 打车终点坐标
      */
    var destination: LngLat = js.native
    
    /**
      * 该方案的总距离，单位：米
      */
    var distance: Double = js.native
    
    /**
      * 打车起点坐标
      */
    var origin: LngLat = js.native
    
    /**
      * 起点名称
      */
    var sname: String = js.native
    
    /**
      * 耗时，单位：秒
      */
    var time: Double = js.native
    
    /**
      * 终点名称
      */
    var tname: String = js.native
  }
  object TaxiDetails {
    
    @scala.inline
    def apply(destination: LngLat, distance: Double, origin: LngLat, sname: String, time: Double, tname: String): TaxiDetails = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], sname = sname.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaxiDetails]
    }
    
    @scala.inline
    implicit class TaxiDetailsMutableBuilder[Self <: TaxiDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: LngLat): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSname(value: String): Self = StObject.set(x, "sname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTname(value: String): Self = StObject.set(x, "tname", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaxiSegment
    extends SegmentCommon
       with Segment {
    
    /**
      * 此换乘段导航信息
      */
    var transit: TaxiDetails = js.native
    
    /**
      * 换乘动作类型
      */
    var transit_mode: TAXI = js.native
  }
  object TaxiSegment {
    
    @scala.inline
    def apply(distance: Double, instruction: String, time: Double, transit: TaxiDetails, transit_mode: TAXI): TaxiSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaxiSegment]
    }
    
    @scala.inline
    implicit class TaxiSegmentMutableBuilder[Self <: TaxiSegment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransit(value: TaxiDetails): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransit_mode(value: TAXI): Self = StObject.set(x, "transit_mode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransferPlan extends StObject {
    
    /**
      * 此换乘方案价格，单位：元
      */
    var cost: Double = js.native
    
    /**
      * 此换乘方案全程距离，单位：米
      */
    var distance: Double = js.native
    
    /**
      * 是否夜间线路
      */
    var nightLine: Boolean = js.native
    
    /**
      * 此换乘方案的路径坐标集合
      */
    var path: js.Array[LngLat] = js.native
    
    /**
      * 此方案火车行驶距离，单位：米
      */
    var railway_distance: Double = js.native
    
    /**
      * 换乘路段列表，以每次换乘动结束作为分段点，将整个换乘方案分隔成若干 Segment（换乘路段）
      */
    var segments: js.Array[Segment] = js.native
    
    /**
      * 此方案出租车行驶距离，单位：米
      */
    var taxi_distance: Double = js.native
    
    /**
      * 预期时间，单位：秒
      */
    var time: Double = js.native
    
    /**
      * 此方案公交行驶距离，单位：米
      */
    var transit_distance: Double = js.native
    
    /**
      * 此方案总步行距离，单位：米
      */
    var walking_distance: Double = js.native
  }
  object TransferPlan {
    
    @scala.inline
    def apply(
      cost: Double,
      distance: Double,
      nightLine: Boolean,
      path: js.Array[LngLat],
      railway_distance: Double,
      segments: js.Array[Segment],
      taxi_distance: Double,
      time: Double,
      transit_distance: Double,
      walking_distance: Double
    ): TransferPlan = {
      val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], nightLine = nightLine.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], railway_distance = railway_distance.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], taxi_distance = taxi_distance.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit_distance = transit_distance.asInstanceOf[js.Any], walking_distance = walking_distance.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferPlan]
    }
    
    @scala.inline
    implicit class TransferPlanMutableBuilder[Self <: TransferPlan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNightLine(value: Boolean): Self = StObject.set(x, "nightLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRailway_distance(value: Double): Self = StObject.set(x, "railway_distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value :_*))
      
      @scala.inline
      def setTaxi_distance(value: Double): Self = StObject.set(x, "taxi_distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransit_distance(value: Double): Self = StObject.set(x, "transit_distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWalking_distance(value: Double): Self = StObject.set(x, "walking_distance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransitDetails extends StObject {
    
    /**
      * 地铁站入口
      */
    var entrance: js.UndefOr[SubwayEntrance] = js.native
    
    /**
      * 地铁站出口
      */
    var exit: js.UndefOr[SubwayEntrance] = js.native
    
    /**
      * 此换乘段公交路线
      */
    var lines: js.Array[TransitLine] = js.native
    
    /**
      * 此换乘段的下车站
      */
    var off_station: Stop = js.native
    
    /**
      * 此换乘段的上车站
      */
    var on_station: Stop = js.native
    
    /**
      * 此换乘段公交部分（上车站-下车站）坐标集合
      */
    var path: js.Array[LngLat] = js.native
    
    /**
      * 途径公交站点数（不包括上车站和下车站）
      */
    var via_num: Double = js.native
    
    /**
      * 途径公交站点集合（不包括上车站和下车站）
      */
    var via_stops: js.Array[Stop] = js.native
  }
  object TransitDetails {
    
    @scala.inline
    def apply(
      lines: js.Array[TransitLine],
      off_station: Stop,
      on_station: Stop,
      path: js.Array[LngLat],
      via_num: Double,
      via_stops: js.Array[Stop]
    ): TransitDetails = {
      val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], off_station = off_station.asInstanceOf[js.Any], on_station = on_station.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitDetails]
    }
    
    @scala.inline
    implicit class TransitDetailsMutableBuilder[Self <: TransitDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntrance(value: SubwayEntrance): Self = StObject.set(x, "entrance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntranceUndefined: Self = StObject.set(x, "entrance", js.undefined)
      
      @scala.inline
      def setExit(value: SubwayEntrance): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setLines(value: js.Array[TransitLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesVarargs(value: TransitLine*): Self = StObject.set(x, "lines", js.Array(value :_*))
      
      @scala.inline
      def setOff_station(value: Stop): Self = StObject.set(x, "off_station", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_station(value: Stop): Self = StObject.set(x, "on_station", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setVia_num(value: Double): Self = StObject.set(x, "via_num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVia_stops(value: js.Array[Stop]): Self = StObject.set(x, "via_stops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVia_stopsVarargs(value: Stop*): Self = StObject.set(x, "via_stops", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TransitLine extends StObject {
    
    /**
      * 公交路线末班车时间
      */
    var etime: String | js.Array[scala.Nothing] = js.native
    
    /**
      * 公交路线ID
      */
    var id: String = js.native
    
    /**
      * 公交路线名
      */
    var name: String = js.native
    
    /**
      * 公交路线首班车时间
      */
    var stime: String | js.Array[scala.Nothing] = js.native
    
    /**
      * 公交类型
      */
    var `type`: String = js.native
  }
  object TransitLine {
    
    @scala.inline
    def apply(
      etime: String | js.Array[scala.Nothing],
      id: String,
      name: String,
      stime: String | js.Array[scala.Nothing],
      `type`: String
    ): TransitLine = {
      val __obj = js.Dynamic.literal(etime = etime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitLine]
    }
    
    @scala.inline
    implicit class TransitLineMutableBuilder[Self <: TransitLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEtime(value: String | js.Array[scala.Nothing]): Self = StObject.set(x, "etime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtimeVarargs(value: scala.Nothing*): Self = StObject.set(x, "etime", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStime(value: String | js.Array[scala.Nothing]): Self = StObject.set(x, "stime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStimeVarargs(value: scala.Nothing*): Self = StObject.set(x, "stime", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransitSegment
    extends SegmentCommon
       with Segment {
    
    /**
      * 此换乘段导航信息
      */
    var transit: TransitDetails = js.native
    
    /**
      * 换乘动作类型
      */
    var transit_mode: SUBWAY | METRO_RAIL | BUS = js.native
  }
  object TransitSegment {
    
    @scala.inline
    def apply(
      distance: Double,
      instruction: String,
      time: Double,
      transit: TransitDetails,
      transit_mode: SUBWAY | METRO_RAIL | BUS
    ): TransitSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitSegment]
    }
    
    @scala.inline
    implicit class TransitSegmentMutableBuilder[Self <: TransitSegment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransit(value: TransitDetails): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransit_mode(value: SUBWAY | METRO_RAIL | BUS): Self = StObject.set(x, "transit_mode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViaStop extends StObject {
    
    /**
      * 途径车站点ID
      */
    var id: String = js.native
    
    /**
      * 站点经纬度信息
      */
    var location: LngLat = js.native
    
    /**
      * 途径车站点名称
      */
    var name: String = js.native
    
    /**
      * 途径站点的进站时间，如大于24:00,则表示跨天
      */
    var time: Double = js.native
    
    /**
      * 途径站点的停靠时间，单位：分钟
      */
    @JSName("wait")
    var wait_FViaStop: Double = js.native
  }
  object ViaStop {
    
    @scala.inline
    def apply(id: String, location: LngLat, name: String, time: Double, wait_ : Double): ViaStop = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViaStop]
    }
    
    @scala.inline
    implicit class ViaStopMutableBuilder[Self <: ViaStop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WalkDetails extends StObject {
    
    /**
      * 此换乘段的步行终点
      */
    var destination: LngLat = js.native
    
    /**
      * 此换乘段的步行起点
      */
    var origin: LngLat = js.native
    
    /**
      * 此换乘段坐标集合
      */
    var path: js.Array[LngLat] = js.native
    
    /**
      * 步行子路段WalkStep列表
      */
    var steps: js.Array[WalkStep] = js.native
  }
  object WalkDetails {
    
    @scala.inline
    def apply(destination: LngLat, origin: LngLat, path: js.Array[LngLat], steps: js.Array[WalkStep]): WalkDetails = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkDetails]
    }
    
    @scala.inline
    implicit class WalkDetailsMutableBuilder[Self <: WalkDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: LngLat): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setSteps(value: js.Array[WalkStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: WalkStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WalkSegment
    extends SegmentCommon
       with Segment {
    
    /**
      * 此换乘段导航信息
      */
    var transit: WalkDetails = js.native
    
    /**
      * 换乘动作类型
      */
    var transit_mode: WALK = js.native
  }
  object WalkSegment {
    
    @scala.inline
    def apply(distance: Double, instruction: String, time: Double, transit: WalkDetails, transit_mode: WALK): WalkSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkSegment]
    }
    
    @scala.inline
    implicit class WalkSegmentMutableBuilder[Self <: WalkSegment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransit(value: WalkDetails): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransit_mode(value: WALK): Self = StObject.set(x, "transit_mode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WalkStep extends StObject {
    
    /**
      * 本步行子路段完成后动作
      */
    var action: String = js.native
    
    /**
      * 步行子路段完成后辅助动作，一般为到达某个公交站点或目的地时返回
      */
    var assist_action: String = js.native
    
    /**
      * 步行子路段距离，单位：米
      */
    var distance: Double = js.native
    
    /**
      * 步行子路段描述
      */
    var instruction: String = js.native
    
    /**
      * 步行子路段坐标集合
      */
    var path: js.Array[LngLat] = js.native
    
    /**
      * 道路
      */
    var road: String = js.native
    
    /**
      * 步行子路段预计使用时间，单位：秒
      */
    var time: Double = js.native
  }
  object WalkStep {
    
    @scala.inline
    def apply(
      action: String,
      assist_action: String,
      distance: Double,
      instruction: String,
      path: js.Array[LngLat],
      road: String,
      time: Double
    ): WalkStep = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assist_action = assist_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkStep]
    }
    
    @scala.inline
    implicit class WalkStepMutableBuilder[Self <: WalkStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssist_action(value: String): Self = StObject.set(x, "assist_action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRoad(value: String): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
