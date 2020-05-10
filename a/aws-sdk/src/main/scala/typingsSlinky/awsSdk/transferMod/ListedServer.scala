package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedServer extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) for the server to be listed.
    */
  var Arn: typingsSlinky.awsSdk.transferMod.Arn = js.native
  /**
    * The type of VPC endpoint that your SFTP server is connected to. If your SFTP server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typingsSlinky.awsSdk.transferMod.EndpointType] = js.native
  /**
    * The authentication method used to validate a user for the server that was specified. This can include Secure Shell (SSH), user name and password combinations, or your own custom authentication method. Valid values include SERVICE_MANAGED or API_GATEWAY.
    */
  var IdentityProviderType: js.UndefOr[typingsSlinky.awsSdk.transferMod.IdentityProviderType] = js.native
  /**
    * The AWS Identity and Access Management entity that allows the server to turn on Amazon CloudWatch logging.
    */
  var LoggingRole: js.UndefOr[Role] = js.native
  /**
    * This value is the unique system assigned identifier for the SFTP servers that were listed.
    */
  var ServerId: js.UndefOr[typingsSlinky.awsSdk.transferMod.ServerId] = js.native
  /**
    * This property describes the condition of the SFTP server for the server that was described. A value of ONLINE&gt; indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typingsSlinky.awsSdk.transferMod.State] = js.native
  /**
    * This property is a numeric value that indicates the number of users that are assigned to the SFTP server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typingsSlinky.awsSdk.transferMod.UserCount] = js.native
}

object ListedServer {
  @scala.inline
  def apply(Arn: Arn): ListedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedServer]
  }
  @scala.inline
  implicit class ListedServerOps[Self <: ListedServer] (val x: Self) extends AnyVal {
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

