package typingsSlinky.mapboxDashGl.mapboxDashGlMod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.`raster-dem`
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.canvas
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.geojson
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.image_
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.raster
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.vector
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "CanvasSource")
@js.native
class CanvasSource ()
  extends CanvasSourceRaw
     with AnySourceImpl {
  /* CompleteClass */
  override var canvas: String | HTMLCanvasElement = js.native
  /* CompleteClass */
  override var coordinates: js.Array[js.Array[Double]] = js.native
  /* CompleteClass */
  override var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_CanvasSourceRaw: canvas = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
}

