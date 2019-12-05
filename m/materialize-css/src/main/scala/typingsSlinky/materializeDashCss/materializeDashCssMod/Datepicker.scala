package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.DatepickerOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Datepicker")
@js.native
class Datepicker ()
  extends typingsSlinky.materializeDashCss.M.Datepicker

/* static members */
@JSImport("materialize-css", "Datepicker")
@js.native
object Datepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Datepicker = js.native
  /**
    * Init Datepickers
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Datepicker] = js.native
  def init(els: MElements, options: Partial[DatepickerOptions]): js.Array[typingsSlinky.materializeDashCss.M.Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Datepicker = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[DatepickerOptions]): typingsSlinky.materializeDashCss.M.Datepicker = js.native
}

