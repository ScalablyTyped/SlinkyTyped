package typingsSlinky.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipEvent extends LeafletEvent {
  
  var tooltip: Tooltip_ = js.native
}
object TooltipEvent {
  
  @scala.inline
  def apply(
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    tooltip: Tooltip_,
    `type`: String
  ): TooltipEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipEvent]
  }
  
  @scala.inline
  implicit class TooltipEventMutableBuilder[Self <: TooltipEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltip(value: Tooltip_): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
