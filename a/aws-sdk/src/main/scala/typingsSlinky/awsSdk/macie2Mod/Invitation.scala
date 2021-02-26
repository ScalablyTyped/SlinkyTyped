package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invitation extends StObject {
  
  /**
    * The AWS account ID for the account that sent the invitation.
    */
  var accountId: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the invitation. Amazon Macie uses this identifier to validate the inviter account with the invitee account.
    */
  var invitationId: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the invitation was sent.
    */
  var invitedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of the relationship between the account that sent the invitation (inviter account) and the account that received the invitation (invitee account).
    */
  var relationshipStatus: js.UndefOr[RelationshipStatus] = js.native
}
object Invitation {
  
  @scala.inline
  def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  
  @scala.inline
  implicit class InvitationMutableBuilder[Self <: Invitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setInvitationId(value: string): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    @scala.inline
    def setInvitedAt(value: js.Date): Self = StObject.set(x, "invitedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedAtUndefined: Self = StObject.set(x, "invitedAt", js.undefined)
    
    @scala.inline
    def setRelationshipStatus(value: RelationshipStatus): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
  }
}
