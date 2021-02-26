package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessfulQueuedPurchaseDeletion extends StObject {
  
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
}
object SuccessfulQueuedPurchaseDeletion {
  
  @scala.inline
  def apply(): SuccessfulQueuedPurchaseDeletion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessfulQueuedPurchaseDeletion]
  }
  
  @scala.inline
  implicit class SuccessfulQueuedPurchaseDeletionMutableBuilder[Self <: SuccessfulQueuedPurchaseDeletion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedInstancesId(value: String): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
  }
}
