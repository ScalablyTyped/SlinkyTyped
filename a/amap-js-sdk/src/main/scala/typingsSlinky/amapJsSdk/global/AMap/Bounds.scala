package typingsSlinky.amapJsSdk.global.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地物对象的经纬度矩形范围
  */
@JSGlobal("AMap.Bounds")
@js.native
class Bounds protected ()
  extends typingsSlinky.amapJsSdk.AMap.Bounds {
  /**
    * 构造一个矩形范围
    * @param southWest 西南角经纬度坐标
    * @param northEast 东北角经纬度坐标
    */
  def this(southWest: typingsSlinky.amapJsSdk.AMap.LngLat, northEast: typingsSlinky.amapJsSdk.AMap.LngLat) = this()
  /**
    * 判断指定点坐标是否在矩形范围内
    * @param point 指定点
    */
  /* CompleteClass */
  override def contains(point: typingsSlinky.amapJsSdk.AMap.LngLat): Boolean = js.native
  /**
    * 获取当前Bounds的中心点经纬度坐标
    */
  /* CompleteClass */
  override def getCenter(): typingsSlinky.amapJsSdk.AMap.LngLat = js.native
  /**
    * 获取东北角坐标
    */
  /* CompleteClass */
  override def getNorthEast(): typingsSlinky.amapJsSdk.AMap.LngLat = js.native
  /**
    * 获取西南角坐标
    */
  /* CompleteClass */
  override def getSouthWest(): typingsSlinky.amapJsSdk.AMap.LngLat = js.native
}

