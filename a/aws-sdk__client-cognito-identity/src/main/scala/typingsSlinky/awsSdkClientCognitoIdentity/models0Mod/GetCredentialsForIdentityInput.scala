package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCredentialsForIdentityInput extends js.Object {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were
    *          received in the token from the identity provider. For example, a SAML-based identity
    *          provider. This parameter is optional for identity providers that do not support role
    *          customization.</p>
    */
  var CustomRoleArn: js.UndefOr[String] = js.native
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens. The
    *          name-value pair will follow the syntax "provider_name":
    *          "provider_user_identifier".</p>
    *          <p>Logins should not be specified when trying to get credentials for an unauthenticated
    *          identity.</p>
    *          <p>The Logins parameter is required when using identities associated with external
    *          identity providers such as FaceBook. For examples of <code>Logins</code> maps, see the code
    *          examples in the <a href="http://docs.aws.amazon.com/cognito/latest/developerguide/external-identity-providers.html">External Identity Providers</a> section of the Amazon Cognito Developer
    *          Guide.</p>
    */
  var Logins: js.UndefOr[StringDictionary[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetCredentialsForIdentityInput")
@js.native
object GetCredentialsForIdentityInput extends js.Object {
  
  def filterSensitiveLog(obj: GetCredentialsForIdentityInput): js.Any = js.native
}
