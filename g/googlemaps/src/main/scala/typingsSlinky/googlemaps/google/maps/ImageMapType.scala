package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.ImageMapType")
@js.native
class ImageMapType protected ()
  extends MVCObject
     with MapType {
  def this(opts: ImageMapTypeOptions) = this()
  @JSName("alt")
  var alt_ImageMapType: String = js.native
  @JSName("maxZoom")
  var maxZoom_ImageMapType: Double = js.native
  @JSName("minZoom")
  var minZoom_ImageMapType: Double = js.native
  @JSName("name")
  var name_ImageMapType: String = js.native
  @JSName("projection")
  var projection_ImageMapType: Projection = js.native
  @JSName("radius")
  var radius_ImageMapType: Double = js.native
  @JSName("tileSize")
  var tileSize_ImageMapType: Size = js.native
  def getOpacity(): Double = js.native
  def setOpacity(opacity: Double): Unit = js.native
}

