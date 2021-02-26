package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionRiskData extends StObject {
  
  var decision: String = js.native
  
  var deviceDataCaptured: Boolean = js.native
  
  var fraudServiceProvider: String = js.native
  
  var id: String = js.native
}
object TransactionRiskData {
  
  @scala.inline
  def apply(decision: String, deviceDataCaptured: Boolean, fraudServiceProvider: String, id: String): TransactionRiskData = {
    val __obj = js.Dynamic.literal(decision = decision.asInstanceOf[js.Any], deviceDataCaptured = deviceDataCaptured.asInstanceOf[js.Any], fraudServiceProvider = fraudServiceProvider.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRiskData]
  }
  
  @scala.inline
  implicit class TransactionRiskDataMutableBuilder[Self <: TransactionRiskData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecision(value: String): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataCaptured(value: Boolean): Self = StObject.set(x, "deviceDataCaptured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFraudServiceProvider(value: String): Self = StObject.set(x, "fraudServiceProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
