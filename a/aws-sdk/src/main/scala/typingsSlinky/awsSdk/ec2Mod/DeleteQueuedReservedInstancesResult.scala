package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteQueuedReservedInstancesResult extends StObject {
  
  /**
    * Information about the queued purchases that could not be deleted.
    */
  var FailedQueuedPurchaseDeletions: js.UndefOr[FailedQueuedPurchaseDeletionSet] = js.native
  
  /**
    * Information about the queued purchases that were successfully deleted.
    */
  var SuccessfulQueuedPurchaseDeletions: js.UndefOr[SuccessfulQueuedPurchaseDeletionSet] = js.native
}
object DeleteQueuedReservedInstancesResult {
  
  @scala.inline
  def apply(): DeleteQueuedReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueuedReservedInstancesResult]
  }
  
  @scala.inline
  implicit class DeleteQueuedReservedInstancesResultMutableBuilder[Self <: DeleteQueuedReservedInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedQueuedPurchaseDeletions(value: FailedQueuedPurchaseDeletionSet): Self = StObject.set(x, "FailedQueuedPurchaseDeletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedQueuedPurchaseDeletionsUndefined: Self = StObject.set(x, "FailedQueuedPurchaseDeletions", js.undefined)
    
    @scala.inline
    def setFailedQueuedPurchaseDeletionsVarargs(value: FailedQueuedPurchaseDeletion*): Self = StObject.set(x, "FailedQueuedPurchaseDeletions", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulQueuedPurchaseDeletions(value: SuccessfulQueuedPurchaseDeletionSet): Self = StObject.set(x, "SuccessfulQueuedPurchaseDeletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulQueuedPurchaseDeletionsUndefined: Self = StObject.set(x, "SuccessfulQueuedPurchaseDeletions", js.undefined)
    
    @scala.inline
    def setSuccessfulQueuedPurchaseDeletionsVarargs(value: SuccessfulQueuedPurchaseDeletion*): Self = StObject.set(x, "SuccessfulQueuedPurchaseDeletions", js.Array(value :_*))
  }
}
