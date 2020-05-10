package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialModalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Modal")
@js.native
class Modal ()
  extends Component[ModalOptions]
     with Openable {
  /**
    * ID of the modal element
    */
  var id: String = js.native
}

/* static members */
@JSGlobal("M.Modal")
@js.native
object Modal extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Modal = js.native
  /**
    * Init Modals
    */
  def init(els: MElements): js.Array[Modal] = js.native
  def init(els: MElements, options: PartialModalOptions): js.Array[Modal] = js.native
  /**
    * Init Modal
    */
  def init(els: Element): Modal = js.native
  def init(els: Element, options: PartialModalOptions): Modal = js.native
}

