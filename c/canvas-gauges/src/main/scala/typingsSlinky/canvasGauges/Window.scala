package typingsSlinky.canvasGauges

import typingsSlinky.canvasGauges.CanvasGauges.BaseGauge
import typingsSlinky.canvasGauges.CanvasGauges.LinearGauge
import typingsSlinky.canvasGauges.CanvasGauges.RadialGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var BaseGauge: typingsSlinky.canvasGauges.CanvasGauges.BaseGauge = js.native
  
  var LinearGauge: typingsSlinky.canvasGauges.CanvasGauges.LinearGauge = js.native
  
  var RadialGauge: typingsSlinky.canvasGauges.CanvasGauges.RadialGauge = js.native
}
object Window {
  
  @scala.inline
  def apply(BaseGauge: BaseGauge, LinearGauge: LinearGauge, RadialGauge: RadialGauge): Window = {
    val __obj = js.Dynamic.literal(BaseGauge = BaseGauge.asInstanceOf[js.Any], LinearGauge = LinearGauge.asInstanceOf[js.Any], RadialGauge = RadialGauge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseGauge(value: BaseGauge): Self = StObject.set(x, "BaseGauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearGauge(value: LinearGauge): Self = StObject.set(x, "LinearGauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialGauge(value: RadialGauge): Self = StObject.set(x, "RadialGauge", value.asInstanceOf[js.Any])
  }
}
