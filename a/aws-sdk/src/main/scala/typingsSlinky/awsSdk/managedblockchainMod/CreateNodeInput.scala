package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodeInput extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString = js.native
  /**
    * The unique identifier of the member that owns this node.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique identifier of the network in which this node runs.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The properties of a node configuration.
    */
  var NodeConfiguration: typingsSlinky.awsSdk.managedblockchainMod.NodeConfiguration = js.native
}

object CreateNodeInput {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestTokenString,
    MemberId: ResourceIdString,
    NetworkId: ResourceIdString,
    NodeConfiguration: NodeConfiguration
  ): CreateNodeInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeConfiguration = NodeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodeInput]
  }
  @scala.inline
  implicit class CreateNodeInputOps[Self <: CreateNodeInput] (val x: Self) extends AnyVal {
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
    def withMemberId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeConfiguration(value: NodeConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

