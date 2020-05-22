package typingsSlinky.amapJsSdk.global.AMap

import typingsSlinky.amapJsSdk.AMap.CircleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Circle")
@js.native
class Circle ()
  extends typingsSlinky.amapJsSdk.AMap.Circle {
  def this(options: CircleOptions) = this()
  /* CompleteClass */
  override def contains(point: typingsSlinky.amapJsSdk.AMap.LngLat): Boolean = js.native
  /* CompleteClass */
  override def getBounds(): typingsSlinky.amapJsSdk.AMap.Bounds = js.native
  /* CompleteClass */
  override def getCenter(): typingsSlinky.amapJsSdk.AMap.LngLat = js.native
  /* CompleteClass */
  override def getExtData(): js.Any = js.native
  /* CompleteClass */
  override def getOptions(): CircleOptions = js.native
  /* CompleteClass */
  override def getRadius(): Double = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def setCenter(lnglat: typingsSlinky.amapJsSdk.AMap.LngLat): Unit = js.native
  /* CompleteClass */
  override def setExtData(ext: js.Any): Unit = js.native
  /* CompleteClass */
  override def setMap(map: typingsSlinky.amapJsSdk.AMap.Map): Unit = js.native
  /* CompleteClass */
  override def setOptions(circleopt: CircleOptions): Unit = js.native
  /* CompleteClass */
  override def setRadius(radius: Double): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

