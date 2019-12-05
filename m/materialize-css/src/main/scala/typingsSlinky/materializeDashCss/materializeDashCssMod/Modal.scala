package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.ModalOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Modal")
@js.native
class Modal ()
  extends typingsSlinky.materializeDashCss.M.Modal

/* static members */
@JSImport("materialize-css", "Modal")
@js.native
object Modal extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Modal = js.native
  /**
    * Init Modals
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Modal] = js.native
  def init(els: MElements, options: Partial[ModalOptions]): js.Array[typingsSlinky.materializeDashCss.M.Modal] = js.native
  /**
    * Init Modal
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Modal = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[ModalOptions]): typingsSlinky.materializeDashCss.M.Modal = js.native
}

