package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.configBaseMod.ConfigurationOptions
import typingsSlinky.awsSdk.credentialsMod.Credentials
import typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
import typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityResponse
import typingsSlinky.awsSdk.webIdentityCredentialsMod.WebIdentityCredentials.WebIdentityCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/credentials/web_identity_credentials", JSImport.Namespace)
@js.native
object webIdentityCredentialsMod extends js.Object {
  
  @js.native
  /**
    * Creates a new credentials object.
    * @param {string} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  class WebIdentityCredentials () extends Credentials {
    /**
      * Creates a new credentials object with optional configuraion.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
      */
    def this(options: WebIdentityCredentialsOptions) = this()
    def this(options: WebIdentityCredentialsOptions, clientConfig: ConfigurationOptions) = this()
    
    var data: AssumeRoleWithWebIdentityResponse = js.native
    
    var params: AssumeRoleWithWebIdentityRequest = js.native
  }
  // Needed to expose interfaces on the class
  @js.native
  object WebIdentityCredentials extends js.Object {
    
    type ClientConfiguration = ConfigurationOptions
    
    type WebIdentityCredentialsOptions = AssumeRoleWithWebIdentityRequest
  }
}
