package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_ACCESS_DENIED_ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_THROTTLING_ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_SERVICE_ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_QUOTA_NOT_AVAILABLE_ERROR
  - java.lang.String
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def DEPENDENCY_ACCESS_DENIED_ERROR: typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_ACCESS_DENIED_ERROR = "DEPENDENCY_ACCESS_DENIED_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_ACCESS_DENIED_ERROR]
  @scala.inline
  def DEPENDENCY_THROTTLING_ERROR: typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_THROTTLING_ERROR = "DEPENDENCY_THROTTLING_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_THROTTLING_ERROR]
  @scala.inline
  def DEPENDENCY_SERVICE_ERROR: typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_SERVICE_ERROR = "DEPENDENCY_SERVICE_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_SERVICE_ERROR]
  @scala.inline
  def SERVICE_QUOTA_NOT_AVAILABLE_ERROR: typingsSlinky.awsSdk.awsSdkStrings.SERVICE_QUOTA_NOT_AVAILABLE_ERROR = "SERVICE_QUOTA_NOT_AVAILABLE_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SERVICE_QUOTA_NOT_AVAILABLE_ERROR]
  @scala.inline
  implicit def apply(value: String): ErrorCode = value.asInstanceOf[ErrorCode]
}

