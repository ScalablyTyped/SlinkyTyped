package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
  - typingsSlinky.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
trait BucketAccelerateStatus extends js.Object

object BucketAccelerateStatus {
  @scala.inline
  def Enabled_ : typingsSlinky.awsSdk.awsSdkStrings.Enabled_ = "Enabled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Enabled_]
  @scala.inline
  def Suspended_ : typingsSlinky.awsSdk.awsSdkStrings.Suspended_ = "Suspended".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Suspended_]
  @scala.inline
  implicit def apply(value: String): BucketAccelerateStatus = value.asInstanceOf[BucketAccelerateStatus]
}

