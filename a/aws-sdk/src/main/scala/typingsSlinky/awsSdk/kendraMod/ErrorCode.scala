package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.InternalError
  - typingsSlinky.awsSdk.awsSdkStrings.InvalidRequest
  - java.lang.String
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def InternalError: typingsSlinky.awsSdk.awsSdkStrings.InternalError = "InternalError".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InternalError]
  @scala.inline
  def InvalidRequest: typingsSlinky.awsSdk.awsSdkStrings.InvalidRequest = "InvalidRequest".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InvalidRequest]
  @scala.inline
  implicit def apply(value: java.lang.String): ErrorCode = value.asInstanceOf[ErrorCode]
}

