package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialConfig
import typingsSlinky.plotlyJs.anon.PartialLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforePlotEvent extends StObject {
  
  var config: PartialConfig = js.native
  
  var data: js.Array[Data] = js.native
  
  var layout: PartialLayout = js.native
}
object BeforePlotEvent {
  
  @scala.inline
  def apply(config: PartialConfig, data: js.Array[Data], layout: PartialLayout): BeforePlotEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforePlotEvent]
  }
  
  @scala.inline
  implicit class BeforePlotEventMutableBuilder[Self <: BeforePlotEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
