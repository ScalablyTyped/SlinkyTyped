package typingsSlinky.baidumapWebSdk.global.BMap

import typingsSlinky.baidumapWebSdk.BMap.PointCollectionOption
import typingsSlinky.baidumapWebSdk.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PointCollection")
@js.native
class PointCollection protected ()
  extends typingsSlinky.baidumapWebSdk.BMap.PointCollection {
  def this(points: js.Array[typingsSlinky.baidumapWebSdk.BMap.Point]) = this()
  def this(points: js.Array[typingsSlinky.baidumapWebSdk.BMap.Point], opts: PointCollectionOption) = this()
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def onclick(event: Type): Unit = js.native
  /* CompleteClass */
  override def onmouseout(event: Type): Unit = js.native
  /* CompleteClass */
  override def onmouseover(event: Type): Unit = js.native
  /* CompleteClass */
  override def setPoints(points: js.Array[typingsSlinky.baidumapWebSdk.BMap.Point]): Unit = js.native
  /* CompleteClass */
  override def setStyles(styles: PointCollectionOption): Unit = js.native
}

