package typingsSlinky.pulumiAws.identityPoolMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.cognito.IdentityPoolCognitoIdentityProvider
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolState extends js.Object {
  /**
    * Whether the identity pool supports unauthenticated logins or not.
    */
  val allowUnauthenticatedIdentities: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of the identity pool.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * An array of Amazon Cognito Identity user pools and their client IDs.
    */
  val cognitoIdentityProviders: js.UndefOr[Input[js.Array[Input[IdentityPoolCognitoIdentityProvider]]]] = js.native
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
    * backend and the Cognito service to communicate about the developer provider.
    */
  val developerProviderName: js.UndefOr[Input[String]] = js.native
  /**
    * The Cognito Identity Pool name.
    */
  val identityPoolName: js.UndefOr[Input[String]] = js.native
  /**
    * A list of OpendID Connect provider ARNs.
    */
  val openidConnectProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
    */
  val samlProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-Value pairs mapping provider names to provider app IDs.
    */
  val supportedLoginProviders: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the Identity Pool.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object IdentityPoolState {
  @scala.inline
  def apply(): IdentityPoolState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolState]
  }
  @scala.inline
  implicit class IdentityPoolStateOps[Self <: IdentityPoolState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUnauthenticatedIdentities(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnauthenticatedIdentities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnauthenticatedIdentities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnauthenticatedIdentities")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCognitoIdentityProviders(value: Input[js.Array[Input[IdentityPoolCognitoIdentityProvider]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoIdentityProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoIdentityProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoIdentityProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperProviderName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerProviderName")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityPoolName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityPoolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityPoolName")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenidConnectProviderArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openidConnectProviderArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenidConnectProviderArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openidConnectProviderArns")(js.undefined)
        ret
    }
    @scala.inline
    def withSamlProviderArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samlProviderArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamlProviderArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samlProviderArns")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedLoginProviders(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedLoginProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedLoginProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedLoginProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

