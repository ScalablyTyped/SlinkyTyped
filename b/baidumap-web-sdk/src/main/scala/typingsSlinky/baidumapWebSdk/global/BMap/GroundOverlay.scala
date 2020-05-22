package typingsSlinky.baidumapWebSdk.global.BMap

import typingsSlinky.baidumapWebSdk.BMap.GroundOverlayOptions
import typingsSlinky.baidumapWebSdk.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.GroundOverlay")
@js.native
class GroundOverlay protected ()
  extends typingsSlinky.baidumapWebSdk.BMap.GroundOverlay {
  def this(bounds: typingsSlinky.baidumapWebSdk.BMap.Bounds) = this()
  def this(bounds: typingsSlinky.baidumapWebSdk.BMap.Bounds, opts: GroundOverlayOptions) = this()
  /* CompleteClass */
  override def getBounds(): typingsSlinky.baidumapWebSdk.BMap.Bounds = js.native
  /* CompleteClass */
  override def getDispalyOnMaxLevel(): Double = js.native
  /* CompleteClass */
  override def getDisplayOnMinLevel(): Double = js.native
  /* CompleteClass */
  override def getImageURL(): String = js.native
  /* CompleteClass */
  override def getOpacity(): Double = js.native
  /* CompleteClass */
  override def onclick(event: Target): Unit = js.native
  /* CompleteClass */
  override def ondblclick(event: Target): Unit = js.native
  /* CompleteClass */
  override def setBounds(bounds: typingsSlinky.baidumapWebSdk.BMap.Bounds): Unit = js.native
  /* CompleteClass */
  override def setDispalyOnMaxLevel(level: Double): Unit = js.native
  /* CompleteClass */
  override def setDisplayOnMinLevel(level: Double): Unit = js.native
  /* CompleteClass */
  override def setImageURL(url: String): Unit = js.native
  /* CompleteClass */
  override def setOpacity(opcity: Double): Unit = js.native
}

