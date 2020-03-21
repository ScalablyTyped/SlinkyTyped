package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.mapboxGl.mapboxGlStrings.`raster-dem`
import typingsSlinky.mapboxGl.mapboxGlStrings.canvas
import typingsSlinky.mapboxGl.mapboxGlStrings.geojson
import typingsSlinky.mapboxGl.mapboxGlStrings.image_
import typingsSlinky.mapboxGl.mapboxGlStrings.raster
import typingsSlinky.mapboxGl.mapboxGlStrings.vector
import typingsSlinky.mapboxGl.mapboxGlStrings.video
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

