package typingsSlinky.amapJsApi.global.AMap

import typingsSlinky.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.ArrayBounds")
@js.native
class ArrayBounds protected ()
  extends typingsSlinky.amapJsApi.AMap.ArrayBounds {
  def this(bounds: js.Array[LocationValue]) = this()
  /* CompleteClass */
  override var bounds: js.Array[typingsSlinky.amapJsApi.AMap.LngLat] = js.native
  /**
    * 判断传入的点是否在ArrayBounds内
    * @param point 目标点
    */
  /* CompleteClass */
  override def contains(point: LocationValue): Boolean = js.native
  /* CompleteClass */
  override def getCenter(): typingsSlinky.amapJsApi.AMap.LngLat = js.native
  // internal
  /* CompleteClass */
  override def toBounds(): typingsSlinky.amapJsApi.AMap.Bounds = js.native
}

