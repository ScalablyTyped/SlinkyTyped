package typingsSlinky.awsSdk.remoteCredentialsMod

import typingsSlinky.awsSdk.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/credentials/remote_credentials", "RemoteCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class RemoteCredentials () extends Credentials {
  def this(options: RemoteCredentialsOptions) = this()
}
