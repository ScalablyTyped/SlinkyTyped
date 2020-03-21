package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.PathOptions
import typingsSlinky.reactLeaflet.AnonPopupContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Path")
@js.native
abstract class Path[P /* <: PathProps */, E /* <: typingsSlinky.leaflet.mod.Path */] () extends MapLayer[P, E] {
  def getChildContext(): AnonPopupContainer[E] = js.native
  def getPathOptions(props: P): PathOptions = js.native
  def setStyle(options: PathOptions): Unit = js.native
  def setStyleIfChanged(fromProps: P, toProps: P): Unit = js.native
}

