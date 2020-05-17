package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.InternalServiceException
  - typingsSlinky.awsSdk.awsSdkStrings.InvalidParameterException
  - java.lang.String
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def InternalServiceException: typingsSlinky.awsSdk.awsSdkStrings.InternalServiceException = "InternalServiceException".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InternalServiceException]
  @scala.inline
  def InvalidParameterException: typingsSlinky.awsSdk.awsSdkStrings.InvalidParameterException = "InvalidParameterException".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InvalidParameterException]
  @scala.inline
  implicit def apply(value: String): ErrorCode = value.asInstanceOf[ErrorCode]
}

