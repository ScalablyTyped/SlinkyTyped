package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProposalInput extends js.Object {
  
  /**
    * The type of actions proposed, such as inviting a member or removing a member. The types of Actions in a proposal are mutually exclusive. For example, a proposal with Invitations actions cannot also contain Removals actions.
    */
  var Actions: ProposalActions = js.native
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString = js.native
  
  /**
    * A description for the proposal that is visible to voting members, for example, "Proposal to add Example Corp. as member."
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The unique identifier of the member that is creating the proposal. This identifier is especially useful for identifying the member making the proposal when multiple members exist in a single AWS account.
    */
  var MemberId: ResourceIdString = js.native
  
  /**
    *  The unique identifier of the network for which the proposal is made.
    */
  var NetworkId: ResourceIdString = js.native
}
object CreateProposalInput {
  
  @scala.inline
  def apply(
    Actions: ProposalActions,
    ClientRequestToken: ClientRequestTokenString,
    MemberId: ResourceIdString,
    NetworkId: ResourceIdString
  ): CreateProposalInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProposalInput]
  }
  
  @scala.inline
  implicit class CreateProposalInputOps[Self <: CreateProposalInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActions(value: ProposalActions): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestTokenString): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberId(value: ResourceIdString): Self = this.set("MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
}
