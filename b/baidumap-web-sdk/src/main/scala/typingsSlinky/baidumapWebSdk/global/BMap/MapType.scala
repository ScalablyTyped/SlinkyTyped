package typingsSlinky.baidumapWebSdk.global.BMap

import typingsSlinky.baidumapWebSdk.BMap.MapTypeOptions
import typingsSlinky.baidumapWebSdk.BMap.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.MapType")
@js.native
class MapType protected ()
  extends typingsSlinky.baidumapWebSdk.BMap.MapType {
  def this(name: String, layers: js.Array[typingsSlinky.baidumapWebSdk.BMap.TileLayer]) = this()
  def this(name: String, layers: typingsSlinky.baidumapWebSdk.BMap.TileLayer) = this()
  def this(name: String, layers: js.Array[typingsSlinky.baidumapWebSdk.BMap.TileLayer], opts: MapTypeOptions) = this()
  def this(name: String, layers: typingsSlinky.baidumapWebSdk.BMap.TileLayer, opts: MapTypeOptions) = this()
  /* CompleteClass */
  override def getMaxZoom(): Double = js.native
  /* CompleteClass */
  override def getMinZoom(): Double = js.native
  /* CompleteClass */
  override def getName(): String = js.native
  /* CompleteClass */
  override def getProjection(): Projection = js.native
  /* CompleteClass */
  override def getTextColor(): String = js.native
  /* CompleteClass */
  override def getTileLayer(): typingsSlinky.baidumapWebSdk.BMap.TileLayer = js.native
  /* CompleteClass */
  override def getTips(): String = js.native
}

