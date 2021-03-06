package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedQueuedPurchaseDeletion extends StObject {
  
  /**
    * The error.
    */
  var Error: js.UndefOr[DeleteQueuedReservedInstancesError] = js.native
  
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
}
object FailedQueuedPurchaseDeletion {
  
  @scala.inline
  def apply(): FailedQueuedPurchaseDeletion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedQueuedPurchaseDeletion]
  }
  
  @scala.inline
  implicit class FailedQueuedPurchaseDeletionMutableBuilder[Self <: FailedQueuedPurchaseDeletion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: DeleteQueuedReservedInstancesError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setReservedInstancesId(value: String): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
  }
}
