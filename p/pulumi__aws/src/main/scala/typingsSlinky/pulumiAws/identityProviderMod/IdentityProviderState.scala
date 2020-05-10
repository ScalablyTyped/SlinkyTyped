package typingsSlinky.pulumiAws.identityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProviderState extends js.Object {
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
  val providerDetails: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The provider name
    */
  val providerName: js.UndefOr[Input[String]] = js.native
  /**
    * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
    */
  val providerType: js.UndefOr[Input[String]] = js.native
  /**
    * The user pool id
    */
  val userPoolId: js.UndefOr[Input[String]] = js.native
}

object IdentityProviderState {
  @scala.inline
  def apply(): IdentityProviderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderState]
  }
  @scala.inline
  implicit class IdentityProviderStateOps[Self <: IdentityProviderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withProviderDetails(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(js.undefined)
        ret
    }
  }
  
}

