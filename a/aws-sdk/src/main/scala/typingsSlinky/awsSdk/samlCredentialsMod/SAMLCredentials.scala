package typingsSlinky.awsSdk.samlCredentialsMod

import typingsSlinky.awsSdk.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/credentials/saml_credentials", "SAMLCredentials")
@js.native
class SAMLCredentials protected () extends Credentials {
  /**
  		 * Creates a new credentials object.
  		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
  		 */
  def this(params: SAMLCredentialsParams) = this()
  
  var params: SAMLCredentialsParams = js.native
}
