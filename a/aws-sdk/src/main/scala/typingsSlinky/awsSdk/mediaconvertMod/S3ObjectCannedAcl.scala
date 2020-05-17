package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC_READ
  - typingsSlinky.awsSdk.awsSdkStrings.AUTHENTICATED_READ
  - typingsSlinky.awsSdk.awsSdkStrings.BUCKET_OWNER_READ
  - typingsSlinky.awsSdk.awsSdkStrings.BUCKET_OWNER_FULL_CONTROL
  - java.lang.String
*/
trait S3ObjectCannedAcl extends js.Object

object S3ObjectCannedAcl {
  @scala.inline
  def PUBLIC_READ: typingsSlinky.awsSdk.awsSdkStrings.PUBLIC_READ = "PUBLIC_READ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PUBLIC_READ]
  @scala.inline
  def AUTHENTICATED_READ: typingsSlinky.awsSdk.awsSdkStrings.AUTHENTICATED_READ = "AUTHENTICATED_READ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AUTHENTICATED_READ]
  @scala.inline
  def BUCKET_OWNER_READ: typingsSlinky.awsSdk.awsSdkStrings.BUCKET_OWNER_READ = "BUCKET_OWNER_READ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BUCKET_OWNER_READ]
  @scala.inline
  def BUCKET_OWNER_FULL_CONTROL: typingsSlinky.awsSdk.awsSdkStrings.BUCKET_OWNER_FULL_CONTROL = "BUCKET_OWNER_FULL_CONTROL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BUCKET_OWNER_FULL_CONTROL]
  @scala.inline
  implicit def apply(value: String): S3ObjectCannedAcl = value.asInstanceOf[S3ObjectCannedAcl]
}

