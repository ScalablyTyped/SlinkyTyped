package typingsSlinky.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectionInput extends js.Object {
  /**
    * The name of the connection to be created. The name must be unique in the calling AWS account.
    */
  var ConnectionName: typingsSlinky.awsSdk.codestarconnectionsMod.ConnectionName = js.native
  /**
    * The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.
    */
  var ProviderType: typingsSlinky.awsSdk.codestarconnectionsMod.ProviderType = js.native
}

object CreateConnectionInput {
  @scala.inline
  def apply(ConnectionName: ConnectionName, ProviderType: ProviderType): CreateConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionInput]
  }
  @scala.inline
  implicit class CreateConnectionInputOps[Self <: CreateConnectionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionName(value: ConnectionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderType(value: ProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

