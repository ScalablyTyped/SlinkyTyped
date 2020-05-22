package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.TimepickerOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialTimepickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Timepicker")
@js.native
class Timepicker ()
  extends typingsSlinky.materializeCss.M.Timepicker {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: TimepickerOptions = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSImport("materialize-css", "Timepicker")
@js.native
object Timepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Timepicker = js.native
  /**
    * Init Timepickers
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Timepicker] = js.native
  def init(els: MElements, options: PartialTimepickerOptions): js.Array[typingsSlinky.materializeCss.M.Timepicker] = js.native
  /**
    * Init Timepicker
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Timepicker = js.native
  def init(els: Element, options: PartialTimepickerOptions): typingsSlinky.materializeCss.M.Timepicker = js.native
}

