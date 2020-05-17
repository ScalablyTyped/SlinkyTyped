package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 用于地图上加载大量点标记，提高地图的绘制和显示性能。
  */
@js.native
trait MarkerClusterer extends EventBindable {
  /**
    * 添加一个需进行聚合的点标记
    * @param marker
    */
  def addMarker(marker: Marker): Unit = js.native
  /**
    * 添加一组需进行聚合的点标记
    */
  def addMarkers(markers: js.Array[Marker]): Unit = js.native
  /**
    * 从地图上彻底清除所有聚合点标记
    */
  def clearMarkers(): Unit = js.native
  /**
    * 获取聚合点的总数量
    */
  def getClustersCount(): Double = js.native
  /**
    * 获取聚合网格的像素大小
    */
  def getGridSize(): Double = js.native
  /**
    * 获取该点聚合的地图对象
    */
  def getMap(): Map = js.native
  /**
    * 获取该点聚合中的点标记集合
    */
  def getMarkers(): js.Array[Marker] = js.native
  /**
    * 获取地图中点标记的最大聚合级别
    */
  def getMaxZoom(): Double = js.native
  /**
    * 获取单个聚合的最小数量
    */
  def getMinClusterSize(): Double = js.native
  /**
    * 获取聚合的样式风格集合
    */
  def getStyles(): js.Array[_] = js.native
  /**
    * 获取单个聚合点位置是否是聚合内所有标记的平均中心
    */
  def isAverageCenter(): Boolean = js.native
  /**
    * 删除一个聚合的点标记
    * @param marker 点标记
    */
  def removeMarker(marker: Marker): Unit = js.native
  /**
    * 删除一组聚合的点标记
    * @param markers
    */
  def removeMarkers(markers: js.Array[Marker]): Unit = js.native
  /**
    * 设置单个聚合点位置是否是聚合内所有标记的平均中心
    * @param averageCenter
    */
  def setAverageCenter(averageCenter: Boolean): Unit = js.native
  /**
    * 设置聚合网格的像素大小
    * @param size
    */
  def setGridSize(size: Double): Unit = js.native
  /**
    * 设置将进行点聚合的地图对象
    * @param map
    */
  def setMap(map: Map): Unit = js.native
  /**
    * 设置将进行点聚合显示的点标记集合
    * @param markers
    */
  def setMarkers(markers: js.Array[Marker]): Unit = js.native
  /**
    * 设置地图中点标记的最大聚合级别
    * @param zoom
    */
  def setMaxZoom(zoom: Double): Unit = js.native
  /**
    * 设置单个聚合的最小数量
    * @param size
    */
  def setMinClusterSize(size: Double): Unit = js.native
  /**
    * 设置聚合的样式风格
    * @param styles
    */
  def setStyles(styles: js.Array[_]): Unit = js.native
}

object MarkerClusterer {
  @scala.inline
  def apply(
    addMarker: Marker => Unit,
    addMarkers: js.Array[Marker] => Unit,
    clearMarkers: () => Unit,
    getClustersCount: () => Double,
    getGridSize: () => Double,
    getMap: () => Map,
    getMarkers: () => js.Array[Marker],
    getMaxZoom: () => Double,
    getMinClusterSize: () => Double,
    getStyles: () => js.Array[_],
    isAverageCenter: () => Boolean,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    removeMarker: Marker => Unit,
    removeMarkers: js.Array[Marker] => Unit,
    setAverageCenter: Boolean => Unit,
    setGridSize: Double => Unit,
    setMap: Map => Unit,
    setMarkers: js.Array[Marker] => Unit,
    setMaxZoom: Double => Unit,
    setMinClusterSize: Double => Unit,
    setStyles: js.Array[_] => Unit
  ): MarkerClusterer = {
    val __obj = js.Dynamic.literal(addMarker = js.Any.fromFunction1(addMarker), addMarkers = js.Any.fromFunction1(addMarkers), clearMarkers = js.Any.fromFunction0(clearMarkers), getClustersCount = js.Any.fromFunction0(getClustersCount), getGridSize = js.Any.fromFunction0(getGridSize), getMap = js.Any.fromFunction0(getMap), getMarkers = js.Any.fromFunction0(getMarkers), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinClusterSize = js.Any.fromFunction0(getMinClusterSize), getStyles = js.Any.fromFunction0(getStyles), isAverageCenter = js.Any.fromFunction0(isAverageCenter), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), removeMarker = js.Any.fromFunction1(removeMarker), removeMarkers = js.Any.fromFunction1(removeMarkers), setAverageCenter = js.Any.fromFunction1(setAverageCenter), setGridSize = js.Any.fromFunction1(setGridSize), setMap = js.Any.fromFunction1(setMap), setMarkers = js.Any.fromFunction1(setMarkers), setMaxZoom = js.Any.fromFunction1(setMaxZoom), setMinClusterSize = js.Any.fromFunction1(setMinClusterSize), setStyles = js.Any.fromFunction1(setStyles))
    __obj.asInstanceOf[MarkerClusterer]
  }
  @scala.inline
  implicit class MarkerClustererOps[Self <: MarkerClusterer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMarker(value: Marker => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMarker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddMarkers(value: js.Array[Marker] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMarkers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearMarkers(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMarkers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetClustersCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClustersCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGridSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGridSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMap(value: () => Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMarkers(value: () => js.Array[Marker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaxZoom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinClusterSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinClusterSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStyles(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAverageCenter(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAverageCenter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveMarker(value: Marker => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMarker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveMarkers(value: js.Array[Marker] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMarkers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAverageCenter(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAverageCenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetGridSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGridSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMap(value: Map => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMarkers(value: js.Array[Marker] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMarkers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMaxZoom(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinClusterSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinClusterSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStyles(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyles")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

