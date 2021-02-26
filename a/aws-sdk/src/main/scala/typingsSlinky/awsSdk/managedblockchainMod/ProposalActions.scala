package typingsSlinky.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProposalActions extends StObject {
  
  /**
    *  The actions to perform for an APPROVED proposal to invite an AWS account to create a member and join the network. 
    */
  var Invitations: js.UndefOr[InviteActionList] = js.native
  
  /**
    *  The actions to perform for an APPROVED proposal to remove a member from the network, which deletes the member and all associated member resources from the network. 
    */
  var Removals: js.UndefOr[RemoveActionList] = js.native
}
object ProposalActions {
  
  @scala.inline
  def apply(): ProposalActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProposalActions]
  }
  
  @scala.inline
  implicit class ProposalActionsMutableBuilder[Self <: ProposalActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitations(value: InviteActionList): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: InviteAction*): Self = StObject.set(x, "Invitations", js.Array(value :_*))
    
    @scala.inline
    def setRemovals(value: RemoveActionList): Self = StObject.set(x, "Removals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovalsUndefined: Self = StObject.set(x, "Removals", js.undefined)
    
    @scala.inline
    def setRemovalsVarargs(value: RemoveAction*): Self = StObject.set(x, "Removals", js.Array(value :_*))
  }
}
