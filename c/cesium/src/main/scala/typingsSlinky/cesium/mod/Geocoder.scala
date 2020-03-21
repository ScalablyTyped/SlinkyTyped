package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.cesium.AnonContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Geocoder")
@js.native
class Geocoder protected () extends js.Object {
  def this(options: AnonContainer) = this()
  var container: Element = js.native
  var viewModel: GeocoderViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

