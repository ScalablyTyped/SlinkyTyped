package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialTooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Tooltip")
@js.native
class Tooltip ()
  extends Component[TooltipOptions]
     with Openable {
  /**
    * If tooltip is hovered.
    */
  var isHovered: Boolean = js.native
}

/* static members */
@JSGlobal("M.Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(els: MElements): js.Array[Tooltip] = js.native
  def init(els: MElements, options: PartialTooltipOptions): js.Array[Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): Tooltip = js.native
  def init(els: Element, options: PartialTooltipOptions): Tooltip = js.native
}

