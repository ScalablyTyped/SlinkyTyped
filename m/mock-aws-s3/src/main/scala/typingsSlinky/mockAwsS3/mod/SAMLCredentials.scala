package typingsSlinky.mockAwsS3.mod

import typingsSlinky.awsSdk.samlCredentialsMod.SAMLCredentialsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "SAMLCredentials")
@js.native
class SAMLCredentials protected ()
  extends typingsSlinky.awsSdk.mod.SAMLCredentials {
  /**
  		 * Creates a new credentials object.
  		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
  		 */
  def this(params: SAMLCredentialsParams) = this()
}
