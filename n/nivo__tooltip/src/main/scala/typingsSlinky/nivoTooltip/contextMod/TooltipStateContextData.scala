package typingsSlinky.nivoTooltip.contextMod

import slinky.core.facade.ReactElement
import typingsSlinky.nivoTooltip.nivoTooltipBooleans.`false`
import typingsSlinky.nivoTooltip.nivoTooltipBooleans.`true`
import typingsSlinky.nivoTooltip.typesMod.TooltipAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nivoTooltip.contextMod.TooltipStateContextDataVisible
  - typingsSlinky.nivoTooltip.contextMod.TooltipStateContextDataHidden
*/
trait TooltipStateContextData extends js.Object
object TooltipStateContextData {
  
  @scala.inline
  def TooltipStateContextDataVisible(
    anchor: TooltipAnchor,
    content: ReactElement,
    isVisible: `true`,
    position: js.Tuple2[Double, Double]
  ): TooltipStateContextData = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipStateContextData]
  }
  
  @scala.inline
  def TooltipStateContextDataHidden(anchor: Null, content: Null, isVisible: `false`, position: js.Tuple2[Null, Null]): TooltipStateContextData = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipStateContextData]
  }
}
