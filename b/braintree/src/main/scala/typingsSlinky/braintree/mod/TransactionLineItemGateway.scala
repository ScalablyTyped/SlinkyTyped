package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionLineItemGateway extends StObject {
  
  def findAll(transactionId: String): js.Promise[js.Array[TransactionLineItem]] = js.native
}
object TransactionLineItemGateway {
  
  @scala.inline
  def apply(findAll: String => js.Promise[js.Array[TransactionLineItem]]): TransactionLineItemGateway = {
    val __obj = js.Dynamic.literal(findAll = js.Any.fromFunction1(findAll))
    __obj.asInstanceOf[TransactionLineItemGateway]
  }
  
  @scala.inline
  implicit class TransactionLineItemGatewayMutableBuilder[Self <: TransactionLineItemGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindAll(value: String => js.Promise[js.Array[TransactionLineItem]]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
  }
}
