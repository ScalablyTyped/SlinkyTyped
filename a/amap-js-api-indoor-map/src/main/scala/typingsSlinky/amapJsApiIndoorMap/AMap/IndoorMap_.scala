package typingsSlinky.amapJsApiIndoorMap.AMap

import typingsSlinky.amapJsApi.AMap.Layer
import typingsSlinky.amapJsApiIndoorMap.AMap.IndoorMap.Building
import typingsSlinky.amapJsApiIndoorMap.AMap.IndoorMap.SearchResult
import typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndoorMap_ extends Layer {
  
  // internal
  def getFloorBar(): Unit = js.native
  
  /**
    * 获取处于被选中状态的室内地图的一些基本信息
    */
  def getSelectedBuilding(): Building | Null = js.native
  
  /**
    * 获取处于被选中状态的室内地图的ID
    */
  def getSelectedBuildingId(): String | Null = js.native
  
  /**
    * 隐藏楼层切换控件
    */
  def hideFloorBar(): Unit = js.native
  
  /**
    * 隐藏室内地图标注
    */
  def hideLabels(): Unit = js.native
  
  def setSelectedBuildingId(id: String): Unit = js.native
  
  /**
    * 显示指定的楼层
    * @param floor 楼层
    * @param noMove 禁止移动
    */
  def showFloor(floor: Double): js.UndefOr[`false`] = js.native
  def showFloor(floor: Double, noMove: Boolean): js.UndefOr[`false`] = js.native
  
  /**
    * 显示楼层切换控件
    */
  def showFloorBar(): Unit = js.native
  
  /**
    * 显示指定室内地图信息
    * @param indoorId 建筑物ID
    * @param callback 回调
    */
  def showIndoorMap(indoorId: String): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: js.UndefOr[scala.Nothing],
    shopId: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: js.UndefOr[scala.Nothing],
    shopId: js.UndefOr[scala.Nothing],
    noMove: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: js.UndefOr[scala.Nothing],
    shopId: js.UndefOr[scala.Nothing],
    noMove: Boolean
  ): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: js.UndefOr[scala.Nothing],
    shopId: js.UndefOr[scala.Nothing],
    noMove: Boolean,
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(indoorId: String, floor: js.UndefOr[scala.Nothing], shopId: String): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: js.UndefOr[scala.Nothing],
    shopId: String,
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: js.UndefOr[scala.Nothing],
    shopId: String,
    noMove: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(indoorId: String, floor: js.UndefOr[scala.Nothing], shopId: String, noMove: Boolean): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: js.UndefOr[scala.Nothing],
    shopId: String,
    noMove: Boolean,
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(indoorId: String, floor: Double): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: Double,
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: Double,
    shopId: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: Double,
    shopId: js.UndefOr[scala.Nothing],
    noMove: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(indoorId: String, floor: Double, shopId: js.UndefOr[scala.Nothing], noMove: Boolean): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: Double,
    shopId: js.UndefOr[scala.Nothing],
    noMove: Boolean,
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(indoorId: String, floor: Double, shopId: String): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: Double,
    shopId: String,
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: Double,
    shopId: String,
    noMove: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(indoorId: String, floor: Double, shopId: String, noMove: Boolean): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: Double,
    shopId: String,
    noMove: Boolean,
    callback: js.Function2[/* error */ Null | js.Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 显示室内地图标注
    */
  def showLabels(): Unit = js.native
}
