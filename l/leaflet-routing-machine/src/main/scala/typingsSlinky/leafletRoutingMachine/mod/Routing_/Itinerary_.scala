package typingsSlinky.leafletRoutingMachine.mod.Routing_

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Routing.Itinerary")
@js.native
class Itinerary_ protected ()
  extends typingsSlinky.leaflet.mod.Control_ {
  def this(options: ItineraryOptions) = this()
  def createAlternativesContainer(): HTMLElement = js.native
  def hide(): Unit = js.native
  def setAlternatives(routes: js.Array[IRoute]): js.Any = js.native
  def show(): Unit = js.native
}

