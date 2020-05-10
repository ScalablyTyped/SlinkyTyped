package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCognitoIdentityProviderMod.CognitoIdentityProvider
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIdentityPoolInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * <p>TRUE if the identity pool supports unauthenticated logins.</p>
    */
  var AllowUnauthenticatedIdentities: Boolean = js.native
  /**
    * <p>An array of Amazon Cognito Identity user pools and their client IDs.</p>
    */
  var CognitoIdentityProviders: js.UndefOr[js.Array[CognitoIdentityProvider] | js.Iterable[CognitoIdentityProvider]] = js.native
  /**
    * <p>The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can use letters as well as period (<code>.</code>), underscore (<code>_</code>), and dash (<code>-</code>).</p> <p>Once you have set a developer provider name, you cannot change it. Please take care in setting this parameter.</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.native
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: String = js.native
  /**
    * <p>A list of OpendID Connect provider ARNs.</p>
    */
  var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.</p>
    */
  var SamlProviderARNs: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
    */
  var SupportedLoginProviders: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
}

object CreateIdentityPoolInput {
  @scala.inline
  def apply(AllowUnauthenticatedIdentities: Boolean, IdentityPoolName: String): CreateIdentityPoolInput = {
    val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityPoolInput]
  }
  @scala.inline
  implicit class CreateIdentityPoolInputOps[Self <: CreateIdentityPoolInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUnauthenticatedIdentities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowUnauthenticatedIdentities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityPoolName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$abortSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$abortSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(js.undefined)
        ret
    }
    @scala.inline
    def with$httpOptions(value: BrowserHttpOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$httpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def with$maxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$maxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withCognitoIdentityProvidersIterable(value: js.Iterable[CognitoIdentityProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoIdentityProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCognitoIdentityProviders(value: js.Array[CognitoIdentityProvider] | js.Iterable[CognitoIdentityProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoIdentityProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoIdentityProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoIdentityProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperProviderName")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenIdConnectProviderARNsIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenIdConnectProviderARNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenIdConnectProviderARNs(value: js.Array[String] | js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenIdConnectProviderARNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenIdConnectProviderARNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenIdConnectProviderARNs")(js.undefined)
        ret
    }
    @scala.inline
    def withSamlProviderARNsIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamlProviderARNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSamlProviderARNs(value: js.Array[String] | js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamlProviderARNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamlProviderARNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamlProviderARNs")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedLoginProvidersIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedLoginProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedLoginProviders(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedLoginProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedLoginProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedLoginProviders")(js.undefined)
        ret
    }
  }
  
}

