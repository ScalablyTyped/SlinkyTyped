package typingsSlinky.awsSdk.globalMod

import typingsSlinky.awsSdk.ecsCredentialsMod.ECSCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/global", "ECSCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class ECSCredentials ()
  extends typingsSlinky.awsSdk.coreMod.ECSCredentials {
  def this(options: ECSCredentialsOptions) = this()
}
