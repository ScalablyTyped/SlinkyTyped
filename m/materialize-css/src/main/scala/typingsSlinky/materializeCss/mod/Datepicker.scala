package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialDatepickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Datepicker")
@js.native
class Datepicker ()
  extends typingsSlinky.materializeCss.M.Datepicker

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
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeCss.M.Datepicker = js.native
  def init(els: typingsSlinky.std.Element, options: PartialDatepickerOptions): typingsSlinky.materializeCss.M.Datepicker = js.native
}

