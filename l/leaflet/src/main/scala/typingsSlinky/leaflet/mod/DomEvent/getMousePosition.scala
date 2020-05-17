package typingsSlinky.leaflet.mod.DomEvent

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "DomEvent.getMousePosition")
@js.native
object getMousePosition extends js.Object {
  def apply(ev: MouseEvent): Point_ = js.native
  def apply(ev: MouseEvent, container: HTMLElement): Point_ = js.native
}

