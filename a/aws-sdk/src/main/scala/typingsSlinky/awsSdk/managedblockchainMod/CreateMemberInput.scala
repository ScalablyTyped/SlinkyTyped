package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMemberInput extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString = js.native
  /**
    * The unique identifier of the invitation that is sent to the member to join the network.
    */
  var InvitationId: ResourceIdString = js.native
  /**
    * Member configuration parameters.
    */
  var MemberConfiguration: typingsSlinky.awsSdk.managedblockchainMod.MemberConfiguration = js.native
  /**
    * The unique identifier of the network in which the member is created.
    */
  var NetworkId: ResourceIdString = js.native
}

object CreateMemberInput {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestTokenString,
    InvitationId: ResourceIdString,
    MemberConfiguration: MemberConfiguration,
    NetworkId: ResourceIdString
  ): CreateMemberInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], InvitationId = InvitationId.asInstanceOf[js.Any], MemberConfiguration = MemberConfiguration.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMemberInput]
  }
  @scala.inline
  implicit class CreateMemberInputOps[Self <: CreateMemberInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRequestToken(value: ClientRequestTokenString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvitationId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberConfiguration(value: MemberConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

