package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolOutputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCognitoIdentityProviderMod.UnmarshalledCognitoIdentityProvider
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIdentityPoolOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>TRUE if the identity pool supports unauthenticated logins.</p>
    */
  var AllowUnauthenticatedIdentities: Boolean = js.native
  /**
    * <p>A list representing an Amazon Cognito Identity User Pool and its client ID.</p>
    */
  var CognitoIdentityProviders: js.UndefOr[js.Array[UnmarshalledCognitoIdentityProvider]] = js.native
  /**
    * <p>The "domain" by which Cognito will refer to your users.</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.native
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: String = js.native
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: String = js.native
  /**
    * <p>A list of OpendID Connect provider ARNs.</p>
    */
  var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String]] = js.native
  /**
    * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.</p>
    */
  var SamlProviderARNs: js.UndefOr[js.Array[String]] = js.native
  /**
    * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
    */
  var SupportedLoginProviders: js.UndefOr[StringDictionary[String]] = js.native
}

object CreateIdentityPoolOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    AllowUnauthenticatedIdentities: Boolean,
    IdentityPoolId: String,
    IdentityPoolName: String
  ): CreateIdentityPoolOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityPoolOutput]
  }
  @scala.inline
  implicit class CreateIdentityPoolOutputOps[Self <: CreateIdentityPoolOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUnauthenticatedIdentities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowUnauthenticatedIdentities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityPoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityPoolName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCognitoIdentityProviders(value: js.Array[UnmarshalledCognitoIdentityProvider]): Self = {
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
    def withOpenIdConnectProviderARNs(value: js.Array[String]): Self = {
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
    def withSamlProviderARNs(value: js.Array[String]): Self = {
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
    def withSupportedLoginProviders(value: StringDictionary[String]): Self = {
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

