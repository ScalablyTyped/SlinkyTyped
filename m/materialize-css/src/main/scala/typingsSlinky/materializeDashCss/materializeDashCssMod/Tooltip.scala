package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.TooltipOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tooltip")
@js.native
class Tooltip ()
  extends typingsSlinky.materializeDashCss.M.Tooltip

/* static members */
@JSImport("materialize-css", "Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Tooltip] = js.native
  def init(els: MElements, options: Partial[TooltipOptions]): js.Array[typingsSlinky.materializeDashCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Tooltip = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[TooltipOptions]): typingsSlinky.materializeDashCss.M.Tooltip = js.native
}

