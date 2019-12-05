package typingsSlinky.mapboxDashGl.mapboxDashGlMod

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

@JSImport("mapbox-gl", "ImageSource")
@js.native
class ImageSource ()
  extends ImageSourceRaw
     with AnySourceImpl {
  def this(options: ImageSourceOptions) = this()
  /* CompleteClass */
  override var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_ImageSourceRaw: image_ = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
  def updateImage(options: ImageSourceOptions): this.type = js.native
}

