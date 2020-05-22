package typingsSlinky.materializeCss.global.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.FloatingActionButtonOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialFloatingActionButt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.FloatingActionButton")
@js.native
class FloatingActionButton ()
  extends typingsSlinky.materializeCss.M.FloatingActionButton {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: FloatingActionButtonOptions = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
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
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.FloatingActionButton = js.native
  /**
    * Init FloatingActionButtons
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.FloatingActionButton] = js.native
  def init(els: MElements, options: PartialFloatingActionButt): js.Array[typingsSlinky.materializeCss.M.FloatingActionButton] = js.native
  /**
    * Init FloatingActionButton
    */
  def init(els: Element): typingsSlinky.materializeCss.M.FloatingActionButton = js.native
  def init(els: Element, options: PartialFloatingActionButt): typingsSlinky.materializeCss.M.FloatingActionButton = js.native
}

