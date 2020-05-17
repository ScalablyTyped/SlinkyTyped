package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FULL_CONTROL
  - typingsSlinky.awsSdk.awsSdkStrings.READ
  - typingsSlinky.awsSdk.awsSdkStrings.WRITE
  - java.lang.String
*/
trait BucketLogsPermission extends js.Object

object BucketLogsPermission {
  @scala.inline
  def FULL_CONTROL: typingsSlinky.awsSdk.awsSdkStrings.FULL_CONTROL = "FULL_CONTROL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FULL_CONTROL]
  @scala.inline
  def READ: typingsSlinky.awsSdk.awsSdkStrings.READ = "READ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READ]
  @scala.inline
  def WRITE: typingsSlinky.awsSdk.awsSdkStrings.WRITE = "WRITE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WRITE]
  @scala.inline
  implicit def apply(value: String): BucketLogsPermission = value.asInstanceOf[BucketLogsPermission]
}

