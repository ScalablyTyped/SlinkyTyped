package typingsSlinky.mockAwsS3.mod

import typingsSlinky.awsSdk.ecsCredentialsMod.ECSCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "ECSCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class ECSCredentials ()
  extends typingsSlinky.awsSdk.mod.ECSCredentials {
  def this(options: ECSCredentialsOptions) = this()
}

