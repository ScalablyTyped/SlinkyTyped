package typingsSlinky.materializeCss.global.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialModalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Modal")
@js.native
class Modal ()
  extends typingsSlinky.materializeCss.M.Modal

/* static members */
@JSGlobal("M.Modal")
@js.native
object Modal extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Modal = js.native
  /**
    * Init Modals
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Modal] = js.native
  def init(els: MElements, options: PartialModalOptions): js.Array[typingsSlinky.materializeCss.M.Modal] = js.native
  /**
    * Init Modal
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Modal = js.native
  def init(els: Element, options: PartialModalOptions): typingsSlinky.materializeCss.M.Modal = js.native
}

