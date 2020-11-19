package typingsSlinky.amapJsApi.AMap

import typingsSlinky.amapJsApi.AMap.Ellipse.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ellipse_[ExtraData] extends Polygon[ExtraData] {
  
  /**
    * 获取椭圆的中心点
    */
  def getCenter(): js.UndefOr[LngLat] = js.native
  
  def getRadius(): js.Tuple2[Double, Double] = js.native
  
  /**
    * 设置椭圆的中心点
    * @param center 中心点
    * @param preventEvent 阻止触发事件
    */
  def setCenter(center: LocationValue): Unit = js.native
  def setCenter(center: LocationValue, preventEvent: Boolean): Unit = js.native
  
  /**
    * 修改椭圆属性
    * @param options 属性
    */
  def setOptions(options: Options[ExtraData]): Unit = js.native
  
  // internal
  def setRadius(radius: js.Tuple2[Double, Double]): Unit = js.native
  def setRadius(radius: js.Tuple2[Double, Double], preventEvent: Boolean): Unit = js.native
}
