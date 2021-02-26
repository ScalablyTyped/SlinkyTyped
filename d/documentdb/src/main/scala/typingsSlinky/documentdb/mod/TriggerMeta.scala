package typingsSlinky.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerMeta extends AbstractMeta {
  
  var body: String = js.native
  
  var triggerOperation: String = js.native
  
  var triggerType: String = js.native
}
object TriggerMeta {
  
  @scala.inline
  def apply(
    _self: String,
    _ts: Double,
    body: String,
    id: String,
    triggerOperation: String,
    triggerType: String
  ): TriggerMeta = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], triggerOperation = triggerOperation.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerMeta]
  }
  
  @scala.inline
  implicit class TriggerMetaMutableBuilder[Self <: TriggerMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerOperation(value: String): Self = StObject.set(x, "triggerOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
