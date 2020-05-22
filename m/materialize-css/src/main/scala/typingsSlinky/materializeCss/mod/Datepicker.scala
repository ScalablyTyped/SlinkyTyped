package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.DatepickerOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialDatepickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Datepicker")
@js.native
class Datepicker ()
  extends typingsSlinky.materializeCss.M.Datepicker {
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
  override var options: DatepickerOptions = js.native
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
@JSImport("materialize-css", "Datepicker")
@js.native
object Datepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Datepicker = js.native
  /**
    * Init Datepickers
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Datepicker] = js.native
  def init(els: MElements, options: PartialDatepickerOptions): js.Array[typingsSlinky.materializeCss.M.Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Datepicker = js.native
  def init(els: Element, options: PartialDatepickerOptions): typingsSlinky.materializeCss.M.Datepicker = js.native
}

