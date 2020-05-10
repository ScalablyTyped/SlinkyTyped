package typingsSlinky.pulumiAws.inputMod.cognito

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolCognitoIdentityProvider extends js.Object {
  /**
    * The client ID for the Amazon Cognito Identity User Pool.
    */
  var clientId: js.UndefOr[Input[String]] = js.native
  /**
    * The provider name for an Amazon Cognito Identity User Pool.
    */
  var providerName: js.UndefOr[Input[String]] = js.native
  /**
    * Whether server-side token validation is enabled for the identity provider’s token or not.
    */
  var serverSideTokenCheck: js.UndefOr[Input[Boolean]] = js.native
}

object IdentityPoolCognitoIdentityProvider {
  @scala.inline
  def apply(): IdentityPoolCognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolCognitoIdentityProvider]
  }
  @scala.inline
  implicit class IdentityPoolCognitoIdentityProviderOps[Self <: IdentityPoolCognitoIdentityProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
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
    def withServerSideTokenCheck(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideTokenCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideTokenCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideTokenCheck")(js.undefined)
        ret
    }
  }
  
}

