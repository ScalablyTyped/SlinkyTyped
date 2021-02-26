package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedInstancesModification extends StObject {
  
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The time when the modification request was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The time for the modification to become effective.
    */
  var EffectiveDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Contains target configurations along with their corresponding new Reserved Instance IDs.
    */
  var ModificationResults: js.UndefOr[ReservedInstancesModificationResultList] = js.native
  
  /**
    * The IDs of one or more Reserved Instances.
    */
  var ReservedInstancesIds: js.UndefOr[ReservedIntancesIds] = js.native
  
  /**
    * A unique ID for the Reserved Instance modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.native
  
  /**
    * The status of the Reserved Instances modification request.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The reason for the status.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  
  /**
    * The time when the modification request was last updated.
    */
  var UpdateDate: js.UndefOr[js.Date] = js.native
}
object ReservedInstancesModification {
  
  @scala.inline
  def apply(): ReservedInstancesModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesModification]
  }
  
  @scala.inline
  implicit class ReservedInstancesModificationMutableBuilder[Self <: ReservedInstancesModification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setEffectiveDate(value: js.Date): Self = StObject.set(x, "EffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDateUndefined: Self = StObject.set(x, "EffectiveDate", js.undefined)
    
    @scala.inline
    def setModificationResults(value: ReservedInstancesModificationResultList): Self = StObject.set(x, "ModificationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationResultsUndefined: Self = StObject.set(x, "ModificationResults", js.undefined)
    
    @scala.inline
    def setModificationResultsVarargs(value: ReservedInstancesModificationResult*): Self = StObject.set(x, "ModificationResults", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstancesIds(value: ReservedIntancesIds): Self = StObject.set(x, "ReservedInstancesIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesIdsUndefined: Self = StObject.set(x, "ReservedInstancesIds", js.undefined)
    
    @scala.inline
    def setReservedInstancesIdsVarargs(value: ReservedInstancesId*): Self = StObject.set(x, "ReservedInstancesIds", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstancesModificationId(value: String): Self = StObject.set(x, "ReservedInstancesModificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesModificationIdUndefined: Self = StObject.set(x, "ReservedInstancesModificationId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdateDate(value: js.Date): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDateUndefined: Self = StObject.set(x, "UpdateDate", js.undefined)
  }
}
