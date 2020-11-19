package typingsSlinky.awsSdk.coreMod

import typingsSlinky.awsSdk.ec2MetadataCredentialsMod.EC2MetadataCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/core", "EC2MetadataCredentials")
@js.native
/**
		 * Creates credentials from the metadata service on an EC2 instance.
		 * @param {object} options - Override the default (1s) timeout period.
		 */
class EC2MetadataCredentials ()
  extends typingsSlinky.awsSdk.ec2MetadataCredentialsMod.EC2MetadataCredentials {
  def this(options: EC2MetadataCredentialsOptions) = this()
}
