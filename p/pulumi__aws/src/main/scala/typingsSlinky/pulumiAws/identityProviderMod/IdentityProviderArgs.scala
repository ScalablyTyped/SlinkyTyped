package typingsSlinky.pulumiAws.identityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProviderArgs extends js.Object {
  /**
    * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
    */
  val attributeMapping: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The list of identity providers.
    */
  val idpIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The map of identity details, such as access token
    */
  val providerDetails: Input[StringDictionary[_]] = js.native
  /**
    * The provider name
    */
  val providerName: Input[String] = js.native
  /**
    * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
    */
  val providerType: Input[String] = js.native
  /**
    * The user pool id
    */
  val userPoolId: Input[String] = js.native
}

object IdentityProviderArgs {
  @scala.inline
  def apply(
    providerDetails: Input[StringDictionary[_]],
    providerName: Input[String],
    providerType: Input[String],
    userPoolId: Input[String]
  ): IdentityProviderArgs = {
    val __obj = js.Dynamic.literal(providerDetails = providerDetails.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], providerType = providerType.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderArgs]
  }
  @scala.inline
  implicit class IdentityProviderArgsOps[Self <: IdentityProviderArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProviderDetails(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeMapping(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withIdpIdentifiers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdpIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpIdentifiers")(js.undefined)
        ret
    }
  }
  
}

