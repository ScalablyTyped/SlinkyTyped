package typingsSlinky.baidumapWebSdk.global.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Bounds")
@js.native
class Bounds protected ()
  extends typingsSlinky.baidumapWebSdk.BMap.Bounds {
  def this(sw: typingsSlinky.baidumapWebSdk.BMap.Point, ne: typingsSlinky.baidumapWebSdk.BMap.Point) = this()
  def this(minX: Double, minY: Double, maxX: Double, maxY: Double) = this()
  /* CompleteClass */
  override var maxX: Double = js.native
  /* CompleteClass */
  override var maxY: Double = js.native
  /* CompleteClass */
  override var minX: Double = js.native
  /* CompleteClass */
  override var minY: Double = js.native
  /* CompleteClass */
  override def containsBounds(bounds: typingsSlinky.baidumapWebSdk.BMap.Bounds): Boolean = js.native
  /* CompleteClass */
  override def containsPoint(point: typingsSlinky.baidumapWebSdk.BMap.Point): Boolean = js.native
  /* CompleteClass */
  override def equals(other: typingsSlinky.baidumapWebSdk.BMap.Bounds): Boolean = js.native
  /* CompleteClass */
  override def extend(point: typingsSlinky.baidumapWebSdk.BMap.Point): Unit = js.native
  /* CompleteClass */
  override def getCenter(): typingsSlinky.baidumapWebSdk.BMap.Point = js.native
  /* CompleteClass */
  override def getNorthEast(): typingsSlinky.baidumapWebSdk.BMap.Point = js.native
  /* CompleteClass */
  override def getSouthWest(): typingsSlinky.baidumapWebSdk.BMap.Point = js.native
  /* CompleteClass */
  override def intersects(other: typingsSlinky.baidumapWebSdk.BMap.Bounds): Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def toSpan(): typingsSlinky.baidumapWebSdk.BMap.Point = js.native
}

