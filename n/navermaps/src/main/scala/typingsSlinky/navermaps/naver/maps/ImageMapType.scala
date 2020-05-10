package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.ImageMapType")
@js.native
class ImageMapType protected () extends MapType {
  def this(imageMapTypeOptions: ImageMapTypeOptions) = this()
  def getMapTypeOptions(): ImageMapTypeOptions = js.native
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  def getName(): String = js.native
  def getTileUrls(x: Double, y: Double, z: Double): js.Array[String] = js.native
  def setMapTypeOptions(imageMapTypeOptions: ImageMapTypeOptions): Unit = js.native
}

