package typingsSlinky.mapboxDashGl.mapboxDashGlMod

import org.scalajs.dom.raw.HTMLVideoElement
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

@JSImport("mapbox-gl", "VideoSource")
@js.native
class VideoSource ()
  extends VideoSourceRaw
     with AnySourceImpl {
  def this(options: VideoSourceOptions) = this()
  /* CompleteClass */
  override var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_VideoSourceRaw: video = js.native
  def getVideo(): HTMLVideoElement = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
}

