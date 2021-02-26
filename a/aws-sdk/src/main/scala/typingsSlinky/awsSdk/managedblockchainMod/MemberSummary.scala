package typingsSlinky.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberSummary extends StObject {
  
  /**
    * The date and time that the member was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * An optional description of the member.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The unique identifier of the member.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  
  /**
    * An indicator of whether the member is owned by your AWS account or a different AWS account.
    */
  var IsOwned: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.IsOwned] = js.native
  
  /**
    * The name of the member.
    */
  var Name: js.UndefOr[NetworkMemberNameString] = js.native
  
  /**
    * The status of the member.    CREATING - The AWS account is in the process of creating a member.    AVAILABLE - The member has been created and can participate in the network.    CREATE_FAILED - The AWS account attempted to create a member and creation failed.    DELETING - The member and all associated resources are in the process of being deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an APPROVED PROPOSAL to remove the member.    DELETED - The member can no longer participate on the network and all associated resources are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an APPROVED PROPOSAL to remove the member.  
    */
  var Status: js.UndefOr[MemberStatus] = js.native
}
object MemberSummary {
  
  @scala.inline
  def apply(): MemberSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberSummary]
  }
  
  @scala.inline
  implicit class MemberSummaryMutableBuilder[Self <: MemberSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: ResourceIdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIsOwned(value: IsOwned): Self = StObject.set(x, "IsOwned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOwnedUndefined: Self = StObject.set(x, "IsOwned", js.undefined)
    
    @scala.inline
    def setName(value: NetworkMemberNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: MemberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
