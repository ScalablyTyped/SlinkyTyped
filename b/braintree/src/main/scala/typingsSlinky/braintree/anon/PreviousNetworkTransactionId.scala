package typingsSlinky.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousNetworkTransactionId extends StObject {
  
  var previousNetworkTransactionId: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object PreviousNetworkTransactionId {
  
  @scala.inline
  def apply(): PreviousNetworkTransactionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviousNetworkTransactionId]
  }
  
  @scala.inline
  implicit class PreviousNetworkTransactionIdMutableBuilder[Self <: PreviousNetworkTransactionId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviousNetworkTransactionId(value: String): Self = StObject.set(x, "previousNetworkTransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousNetworkTransactionIdUndefined: Self = StObject.set(x, "previousNetworkTransactionId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
