package typingsSlinky.baidumapWebSdk.global.BMap

import typingsSlinky.baidumapWebSdk.BMap.HotspotOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Hotspot")
@js.native
class Hotspot protected ()
  extends typingsSlinky.baidumapWebSdk.BMap.Hotspot {
  def this(position: typingsSlinky.baidumapWebSdk.BMap.Point) = this()
  def this(position: typingsSlinky.baidumapWebSdk.BMap.Point, opts: HotspotOptions) = this()
  /* CompleteClass */
  override def getPosition(): typingsSlinky.baidumapWebSdk.BMap.Point = js.native
  /* CompleteClass */
  override def getText(): String = js.native
  /* CompleteClass */
  override def getUserData(): js.Any = js.native
  /* CompleteClass */
  override def setPosition(position: typingsSlinky.baidumapWebSdk.BMap.Point): Unit = js.native
  /* CompleteClass */
  override def setText(text: String): Unit = js.native
  /* CompleteClass */
  override def setUserData(data: js.Any): Unit = js.native
}

