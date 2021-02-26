package typingsSlinky.pulumiAws.mod.pulumiAwsAugmentingMod.sdk

import typingsSlinky.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "@pulumi/aws.sdk.CognitoIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  */
class CognitoIdentityCredentials ()
  extends typingsSlinky.awsSdk.mod.CognitoIdentityCredentials {
  /**
    * Creates a new credentials object with optional configuration.
    */
  def this(options: CognitoIdentityOptions) = this()
  def this(
    options: CognitoIdentityOptions,
    clientConfig: typingsSlinky.awsSdk.configBaseMod.ConfigurationOptions
  ) = this()
}
// Needed to expose interfaces on the class
object CognitoIdentityCredentials
