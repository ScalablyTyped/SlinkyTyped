package typingsSlinky.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.  The ARN is never reused if the connection is deleted. 
    */
  var ConnectionArn: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.ConnectionArn] = js.native
  /**
    * The name of the connection. Connection names must be unique in an AWS user account.
    */
  var ConnectionName: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.ConnectionName] = js.native
  /**
    * The current status of the connection. 
    */
  var ConnectionStatus: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.ConnectionStatus] = js.native
  /**
    * The name of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.
    */
  var OwnerAccountId: js.UndefOr[AccountId] = js.native
  /**
    * The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.
    */
  var ProviderType: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.ProviderType] = js.native
}

object Connection {
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionArn(value: ConnectionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionName(value: ConnectionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionName")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionStatus(value: ConnectionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderType(value: ProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderType")(js.undefined)
        ret
    }
  }
  
}

