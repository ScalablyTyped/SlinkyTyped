package typingsSlinky.awsSdk.ecsCredentialsMod

import typingsSlinky.awsSdk.remoteCredentialsMod.RemoteCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/credentials/ecs_credentials", "ECSCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class ECSCredentials () extends RemoteCredentials {
  def this(options: ECSCredentialsOptions) = this()
}
