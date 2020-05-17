package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AccessDenied
  - typingsSlinky.awsSdk.awsSdkStrings.InternalServerError
  - java.lang.String
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def AccessDenied: typingsSlinky.awsSdk.awsSdkStrings.AccessDenied = "AccessDenied".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AccessDenied]
  @scala.inline
  def InternalServerError: typingsSlinky.awsSdk.awsSdkStrings.InternalServerError = "InternalServerError".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InternalServerError]
  @scala.inline
  implicit def apply(value: String): ErrorCode = value.asInstanceOf[ErrorCode]
}

