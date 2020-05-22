package typingsSlinky.baidumapWebSdk.global.BMap

import typingsSlinky.baidumapWebSdk.BMap.Copyright
import typingsSlinky.baidumapWebSdk.BMap.CustomLayerOptions
import typingsSlinky.baidumapWebSdk.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.CustomLayer")
@js.native
class CustomLayer protected ()
  extends typingsSlinky.baidumapWebSdk.BMap.CustomLayer {
  def this(opts: CustomLayerOptions) = this()
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typingsSlinky.baidumapWebSdk.BMap.Pixel, zoom: Double): String = js.native
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
  /* CompleteClass */
  override def onhotspotclick(event: Content): Unit = js.native
}

