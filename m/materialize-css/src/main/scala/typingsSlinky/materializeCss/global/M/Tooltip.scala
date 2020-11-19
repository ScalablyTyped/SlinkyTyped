package typingsSlinky.materializeCss.global.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.anon.PartialTooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Tooltip")
@js.native
class Tooltip ()
  extends typingsSlinky.materializeCss.M.Tooltip
/* static members */
@JSGlobal("M.Tooltip")
@js.native
object Tooltip extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Tooltip = js.native
  
  /**
    * Init Tooltips
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typingsSlinky.materializeCss.M.Tooltip] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialTooltipOptions
  ): js.Array[typingsSlinky.materializeCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Tooltip = js.native
  def init(els: Element, options: PartialTooltipOptions): typingsSlinky.materializeCss.M.Tooltip = js.native
}
