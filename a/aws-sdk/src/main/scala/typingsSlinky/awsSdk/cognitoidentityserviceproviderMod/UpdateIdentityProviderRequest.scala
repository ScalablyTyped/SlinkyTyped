package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIdentityProviderRequest extends js.Object {
  /**
    * The identity provider attribute mapping to be changed.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.native
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.native
  /**
    * The identity provider details to be updated, such as MetadataURL and MetadataFile.
    */
  var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.native
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object UpdateIdentityProviderRequest {
  @scala.inline
  def apply(ProviderName: ProviderNameType, UserPoolId: UserPoolIdType): UpdateIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderRequest]
  }
  @scala.inline
  implicit class UpdateIdentityProviderRequestOps[Self <: UpdateIdentityProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProviderName(value: ProviderNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeMapping(value: AttributeMappingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withIdpIdentifiers(value: IdpIdentifiersListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdpIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdpIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdpIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderDetails(value: ProviderDetailsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderDetails")(js.undefined)
        ret
    }
  }
  
}

