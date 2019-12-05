package typingsSlinky.reactDashLeaflet.reactDashLeafletMod

import typingsSlinky.leaflet.leafletMod.PathOptions
import typingsSlinky.reactDashLeaflet.Anon_PopupContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Path")
@js.native
abstract class Path[P /* <: PathProps */, E /* <: typingsSlinky.leaflet.leafletMod.Path */] () extends MapLayer[P, E] {
  def getChildContext(): Anon_PopupContainer[E] = js.native
  def getPathOptions(props: P): PathOptions = js.native
  def setStyle(options: PathOptions): Unit = js.native
  def setStyleIfChanged(fromProps: P, toProps: P): Unit = js.native
}

