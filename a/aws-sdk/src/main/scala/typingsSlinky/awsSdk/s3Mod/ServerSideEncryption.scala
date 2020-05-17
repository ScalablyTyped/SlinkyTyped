package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AES256
  - typingsSlinky.awsSdk.awsSdkStrings.awsColonkms
  - java.lang.String
*/
trait ServerSideEncryption extends js.Object

object ServerSideEncryption {
  @scala.inline
  def AES256: typingsSlinky.awsSdk.awsSdkStrings.AES256 = "AES256".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AES256]
  @scala.inline
  def awsColonkms: typingsSlinky.awsSdk.awsSdkStrings.awsColonkms = "aws:kms".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.awsColonkms]
  @scala.inline
  implicit def apply(value: String): ServerSideEncryption = value.asInstanceOf[ServerSideEncryption]
}

