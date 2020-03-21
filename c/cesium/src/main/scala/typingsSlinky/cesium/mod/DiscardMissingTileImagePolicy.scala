package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.cesium.AnonDisableCheckIfAllPixelsAreTransparent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DiscardMissingTileImagePolicy")
@js.native
class DiscardMissingTileImagePolicy protected () extends js.Object {
  def this(options: AnonDisableCheckIfAllPixelsAreTransparent) = this()
  def isReady(): Boolean = js.native
  def shouldDiscardImage(image: HTMLImageElement): Boolean = js.native
}

