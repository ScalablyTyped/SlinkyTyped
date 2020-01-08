package typingsSlinky.awsDashSdk.awsDashSdkMod

import typingsSlinky.awsDashSdk.libConfigMod.ConfigurationOptions
import typingsSlinky.awsDashSdk.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "CognitoIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  */
class CognitoIdentityCredentials ()
  extends typingsSlinky.awsDashSdk.libCoreMod.CognitoIdentityCredentials {
  /**
    * Creates a new credentials object with optional configuration.
    */
  def this(options: CognitoIdentityOptions) = this()
  def this(options: CognitoIdentityOptions, clientConfig: ConfigurationOptions) = this()
}

// Needed to expose interfaces on the class
@JSImport("aws-sdk", "CognitoIdentityCredentials")
@js.native
object CognitoIdentityCredentials extends js.Object

