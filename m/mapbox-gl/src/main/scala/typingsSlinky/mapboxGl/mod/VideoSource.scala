package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "VideoSource")
@js.native
class VideoSource ()
  extends VideoSourceRaw
     with AnySourceImpl {
  def this(options: VideoSourceOptions) = this()
  
  def getVideo(): HTMLVideoElement = js.native
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
}
