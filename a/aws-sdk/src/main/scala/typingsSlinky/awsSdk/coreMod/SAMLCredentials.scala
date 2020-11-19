package typingsSlinky.awsSdk.coreMod

import typingsSlinky.awsSdk.samlCredentialsMod.SAMLCredentialsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/core", "SAMLCredentials")
@js.native
class SAMLCredentials protected ()
  extends typingsSlinky.awsSdk.samlCredentialsMod.SAMLCredentials {
  /**
  		 * Creates a new credentials object.
  		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
  		 */
  def this(params: SAMLCredentialsParams) = this()
}
