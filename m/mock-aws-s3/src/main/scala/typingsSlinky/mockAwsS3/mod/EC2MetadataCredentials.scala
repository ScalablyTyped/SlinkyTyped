package typingsSlinky.mockAwsS3.mod

import typingsSlinky.awsSdk.ec2MetadataCredentialsMod.EC2MetadataCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "EC2MetadataCredentials")
@js.native
/**
		 * Creates credentials from the metadata service on an EC2 instance.
		 * @param {object} options - Override the default (1s) timeout period.
		 */
class EC2MetadataCredentials ()
  extends typingsSlinky.awsSdk.mod.EC2MetadataCredentials {
  def this(options: EC2MetadataCredentialsOptions) = this()
}

