package typingsSlinky.navermaps.naver.maps

import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Map.MapType
@JSGlobal("naver.maps.CanvasMapType")
@js.native
class CanvasMapType protected () extends MapType {
  def this(canvasMapTypeOptions: CanvasMapTypeOptions) = this()
  def getMapTypeOptions(): CanvasMapTypeOptions = js.native
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  def getName(): String = js.native
  def getTileData(x: Double, y: Double, z: Double): ImageData = js.native
  def setMapTypeOptions(canvasMapTypeOptions: CanvasMapTypeOptions): Unit = js.native
}

