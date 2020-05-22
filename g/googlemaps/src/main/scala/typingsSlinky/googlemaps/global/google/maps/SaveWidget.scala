package typingsSlinky.googlemaps.global.google.maps

import org.scalajs.dom.raw.Node
import typingsSlinky.googlemaps.google.maps.Attribution
import typingsSlinky.googlemaps.google.maps.Place
import typingsSlinky.googlemaps.google.maps.SaveWidgetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
@JSGlobal("google.maps.SaveWidget")
@js.native
class SaveWidget protected ()
  extends typingsSlinky.googlemaps.google.maps.SaveWidget {
  def this(container: Node) = this()
  def this(container: Node, opts: SaveWidgetOptions) = this()
  /* CompleteClass */
  override def getAttribution(): Attribution = js.native
  /* CompleteClass */
  override def getPlace(): Place = js.native
  /* CompleteClass */
  override def setAttribution(attribution: Attribution): Unit = js.native
  /* CompleteClass */
  override def setOptions(opts: SaveWidgetOptions): Unit = js.native
  /* CompleteClass */
  override def setPlace(place: Place): Unit = js.native
}

