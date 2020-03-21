package typingsSlinky.reactLeaflet.mod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.leaflet.mod.LatLngBoundsExpression
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Map")
@js.native
class Map[P /* <: MapProps */, E /* <: Map_ */] () extends MapEvented[P, E] {
  var className: js.UndefOr[String | Null] = js.native
  var container: js.UndefOr[HTMLDivElement | Null] = js.native
  var contextValue: js.UndefOr[LeafletContext | Null] = js.native
  var viewport: Viewport = js.native
  def bindContainer(): Unit = js.native
  def bindContainer(container: HTMLDivElement): Unit = js.native
  def createLeafletElement(props: P): E = js.native
  def onViewportChange(): Unit = js.native
  def onViewportChanged(): Unit = js.native
  def shouldUpdateBounds(next: LatLngBoundsExpression, prev: LatLngBoundsExpression): Boolean = js.native
  def shouldUpdateCenter(next: LatLngExpression, prev: LatLngExpression): Boolean = js.native
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
}

