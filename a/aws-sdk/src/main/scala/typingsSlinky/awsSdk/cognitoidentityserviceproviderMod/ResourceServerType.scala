package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceServerType extends js.Object {
  /**
    * The identifier for the resource server.
    */
  var Identifier: js.UndefOr[ResourceServerIdentifierType] = js.native
  /**
    * The name of the resource server.
    */
  var Name: js.UndefOr[ResourceServerNameType] = js.native
  /**
    * A list of scopes that are defined for the resource server.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.native
  /**
    * The user pool ID for the user pool that hosts the resource server.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object ResourceServerType {
  @scala.inline
  def apply(): ResourceServerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceServerType]
  }
  @scala.inline
  implicit class ResourceServerTypeOps[Self <: ResourceServerType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: ResourceServerIdentifierType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceServerNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: ResourceServerScopeListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(js.undefined)
        ret
    }
  }
  
}

