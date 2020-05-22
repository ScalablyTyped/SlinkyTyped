package typingsSlinky.baidumapWebSdk.global.BMap

import typingsSlinky.baidumapWebSdk.BMap.Copyright
import typingsSlinky.baidumapWebSdk.BMap.TrafficLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.TrafficLayer")
@js.native
class TrafficLayer ()
  extends typingsSlinky.baidumapWebSdk.BMap.TileLayer {
  def this(opts: TrafficLayerOptions) = this()
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typingsSlinky.baidumapWebSdk.BMap.Pixel, zoom: Double): String = js.native
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
}

