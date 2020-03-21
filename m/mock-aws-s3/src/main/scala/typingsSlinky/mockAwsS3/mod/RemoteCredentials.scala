package typingsSlinky.mockAwsS3.mod

import typingsSlinky.awsSdk.remoteCredentialsMod.RemoteCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "RemoteCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class RemoteCredentials ()
  extends typingsSlinky.awsSdk.mod.RemoteCredentials {
  def this(options: RemoteCredentialsOptions) = this()
}

