package typingsSlinky.officeUiFabricReact.panelTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanel extends js.Object {
  /**
    * Forces the panel to dismiss.
    */
  def dismiss(): Unit = js.native
  def dismiss(ev: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
  /**
    * Forces the panel to open.
    */
  def open(): Unit = js.native
}

