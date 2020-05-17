package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialTooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tooltip")
@js.native
class Tooltip ()
  extends typingsSlinky.materializeCss.M.Tooltip

/* static members */
@JSImport("materialize-css", "Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Tooltip] = js.native
  def init(els: MElements, options: PartialTooltipOptions): js.Array[typingsSlinky.materializeCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Tooltip = js.native
  def init(els: Element, options: PartialTooltipOptions): typingsSlinky.materializeCss.M.Tooltip = js.native
}

