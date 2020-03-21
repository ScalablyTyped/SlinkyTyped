package typingsSlinky.d3.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.d3Zoom.mod.ZoomBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "zoom")
@js.native
object zoom extends js.Object {
  def apply[ZoomRefElement /* <: Element */, Datum](): ZoomBehavior[ZoomRefElement, Datum] = js.native
}

