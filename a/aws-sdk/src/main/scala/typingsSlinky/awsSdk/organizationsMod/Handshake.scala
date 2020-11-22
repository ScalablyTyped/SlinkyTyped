package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handshake extends js.Object {
  
  /**
    * The type of handshake, indicating what action occurs when the recipient accepts the handshake. The following handshake types are supported:    INVITE: This type of handshake represents a request to join an organization. It is always sent from the management account to only non-member accounts.    ENABLE_ALL_FEATURES: This type of handshake represents a request to enable all features in an organization. It is always sent from the management account to only invited member accounts. Created accounts do not receive this because those accounts were created by the organization's management account and approval is inferred.    APPROVE_ALL_FEATURES: This type of handshake is sent from the Organizations service when all member accounts have approved the ENABLE_ALL_FEATURES invitation. It is sent only to the management account and signals the master that it can finalize the process to enable all features.  
    */
  var Action: js.UndefOr[ActionType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a handshake. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[HandshakeArn] = js.native
  
  /**
    * The date and time that the handshake expires. If the recipient of the handshake request fails to respond before the specified date and time, the handshake becomes inactive and is no longer valid.
    */
  var ExpirationTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the handshake. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var Id: js.UndefOr[HandshakeId] = js.native
  
  /**
    * Information about the two accounts that are participating in the handshake.
    */
  var Parties: js.UndefOr[HandshakeParties] = js.native
  
  /**
    * The date and time that the handshake request was made.
    */
  var RequestedTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * Additional information that is needed to process the handshake.
    */
  var Resources: js.UndefOr[HandshakeResources] = js.native
  
  /**
    * The current state of the handshake. Use the state to trace the flow of the handshake through the process from its creation to its acceptance. The meaning of each of the valid values is as follows:    REQUESTED: This handshake was sent to multiple recipients (applicable to only some handshake types) and not all recipients have responded yet. The request stays in this state until all recipients respond.    OPEN: This handshake was sent to multiple recipients (applicable to only some policy types) and all recipients have responded, allowing the originator to complete the handshake action.    CANCELED: This handshake is no longer active because it was canceled by the originating account.    ACCEPTED: This handshake is complete because it has been accepted by the recipient.    DECLINED: This handshake is no longer active because it was declined by the recipient account.    EXPIRED: This handshake is no longer active because the originator did not receive a response of any kind from the recipient before the expiration time (15 days).  
    */
  var State: js.UndefOr[HandshakeState] = js.native
}
object Handshake {
  
  @scala.inline
  def apply(): Handshake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handshake]
  }
  
  @scala.inline
  implicit class HandshakeOps[Self <: Handshake] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: ActionType): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setArn(value: HandshakeArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setExpirationTimestamp(value: js.Date): Self = this.set("ExpirationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTimestamp: Self = this.set("ExpirationTimestamp", js.undefined)
    
    @scala.inline
    def setId(value: HandshakeId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setPartiesVarargs(value: HandshakeParty*): Self = this.set("Parties", js.Array(value :_*))
    
    @scala.inline
    def setParties(value: HandshakeParties): Self = this.set("Parties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParties: Self = this.set("Parties", js.undefined)
    
    @scala.inline
    def setRequestedTimestamp(value: js.Date): Self = this.set("RequestedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedTimestamp: Self = this.set("RequestedTimestamp", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: HandshakeResource*): Self = this.set("Resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: HandshakeResources): Self = this.set("Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
    
    @scala.inline
    def setState(value: HandshakeState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
