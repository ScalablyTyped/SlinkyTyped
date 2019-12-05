package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.TimepickerOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Timepicker")
@js.native
class Timepicker ()
  extends typingsSlinky.materializeDashCss.M.Timepicker

/* static members */
@JSImport("materialize-css", "Timepicker")
@js.native
object Timepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Timepicker = js.native
  /**
    * Init Timepickers
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Timepicker] = js.native
  def init(els: MElements, options: Partial[TimepickerOptions]): js.Array[typingsSlinky.materializeDashCss.M.Timepicker] = js.native
  /**
    * Init Timepicker
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Timepicker = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[TimepickerOptions]): typingsSlinky.materializeDashCss.M.Timepicker = js.native
}

