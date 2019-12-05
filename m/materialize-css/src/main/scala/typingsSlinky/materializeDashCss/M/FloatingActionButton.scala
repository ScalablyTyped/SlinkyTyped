package typingsSlinky.materializeDashCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.FloatingActionButton")
@js.native
class FloatingActionButton ()
  extends Component[FloatingActionButtonOptions]
     with Openable {
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.FloatingActionButton")
@js.native
object FloatingActionButton extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): FloatingActionButton = js.native
  /**
    * Init FloatingActionButtons
    */
  def init(els: MElements): js.Array[FloatingActionButton] = js.native
  def init(els: MElements, options: Partial[FloatingActionButtonOptions]): js.Array[FloatingActionButton] = js.native
  /**
    * Init FloatingActionButton
    */
  def init(els: typingsSlinky.std.Element): FloatingActionButton = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[FloatingActionButtonOptions]): FloatingActionButton = js.native
}

