package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/credentials/environment_credentials", JSImport.Namespace)
@js.native
object environmentCredentialsMod extends js.Object {
  
  @js.native
  class EnvironmentCredentials protected () extends Credentials {
    /**
      * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
      * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
      */
    def this(envPrefix: String) = this()
  }
}
