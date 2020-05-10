package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribedServer extends js.Object {
  /**
    * Specifies the unique Amazon Resource Name (ARN) for the server to be described.
    */
  var Arn: typingsSlinky.awsSdk.transferMod.Arn = js.native
  /**
    * The virtual private cloud (VPC) endpoint settings that you configured for your SFTP server.
    */
  var EndpointDetails: js.UndefOr[typingsSlinky.awsSdk.transferMod.EndpointDetails] = js.native
  /**
    * The type of endpoint that your SFTP server is connected to. If your SFTP server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typingsSlinky.awsSdk.transferMod.EndpointType] = js.native
  /**
    * This value contains the message-digest algorithm (MD5) hash of the server's host key. This value is equivalent to the output of the ssh-keygen -l -E md5 -f my-new-server-key command.
    */
  var HostKeyFingerprint: js.UndefOr[typingsSlinky.awsSdk.transferMod.HostKeyFingerprint] = js.native
  /**
    * Specifies information to call a customer-supplied authentication API. This field is not populated when the IdentityProviderType of the server is SERVICE_MANAGED&gt;.
    */
  var IdentityProviderDetails: js.UndefOr[typingsSlinky.awsSdk.transferMod.IdentityProviderDetails] = js.native
  /**
    * This property defines the mode of authentication method enabled for this service. A value of SERVICE_MANAGED means that you are using this server to store and access SFTP user credentials within the service. A value of API_GATEWAY indicates that you have integrated an API Gateway endpoint that will be invoked for authenticating your user into the service.
    */
  var IdentityProviderType: js.UndefOr[typingsSlinky.awsSdk.transferMod.IdentityProviderType] = js.native
  /**
    * This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on Amazon CloudWatch logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.native
  /**
    * This property is a unique system-assigned identifier for the SFTP server that you instantiate.
    */
  var ServerId: js.UndefOr[typingsSlinky.awsSdk.transferMod.ServerId] = js.native
  /**
    * The condition of the SFTP server for the server that was described. A value of ONLINE indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typingsSlinky.awsSdk.transferMod.State] = js.native
  /**
    * This property contains the key-value pairs that you can use to search for and group servers that were assigned to the server that was described.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.transferMod.Tags] = js.native
  /**
    * The number of users that are assigned to the SFTP server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typingsSlinky.awsSdk.transferMod.UserCount] = js.native
}

object DescribedServer {
  @scala.inline
  def apply(Arn: Arn): DescribedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedServer]
  }
  @scala.inline
  implicit class DescribedServerOps[Self <: DescribedServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointDetails(value: EndpointDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointType(value: EndpointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(js.undefined)
        ret
    }
    @scala.inline
    def withHostKeyFingerprint(value: HostKeyFingerprint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostKeyFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostKeyFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostKeyFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityProviderDetails(value: IdentityProviderDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityProviderDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityProviderType(value: IdentityProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityProviderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderType")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingRole")(js.undefined)
        ret
    }
    @scala.inline
    def withServerId(value: ServerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUserCount(value: UserCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserCount")(js.undefined)
        ret
    }
  }
  
}

