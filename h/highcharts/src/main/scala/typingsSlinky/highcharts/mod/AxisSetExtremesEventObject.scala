package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.setExtremes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisSetExtremesEventObject extends ExtremesObject {
  
  var preventDefault: js.Function = js.native
  
  var target: SVGElement = js.native
  
  var trigger: String | AxisExtremesTriggerValue = js.native
  
  var `type`: setExtremes = js.native
}
object AxisSetExtremesEventObject {
  
  @scala.inline
  def apply(
    dataMax: Double,
    dataMin: Double,
    max: Double,
    min: Double,
    preventDefault: js.Function,
    target: SVGElement,
    trigger: String | AxisExtremesTriggerValue,
    `type`: setExtremes,
    userMax: Double,
    userMin: Double
  ): AxisSetExtremesEventObject = {
    val __obj = js.Dynamic.literal(dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], userMax = userMax.asInstanceOf[js.Any], userMin = userMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisSetExtremesEventObject]
  }
  
  @scala.inline
  implicit class AxisSetExtremesEventObjectMutableBuilder[Self <: AxisSetExtremesEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: SVGElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: String | AxisExtremesTriggerValue): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: setExtremes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
