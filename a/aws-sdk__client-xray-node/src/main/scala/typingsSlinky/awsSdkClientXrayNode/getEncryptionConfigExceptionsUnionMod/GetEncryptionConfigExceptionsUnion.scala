package typingsSlinky.awsSdkClientXrayNode.getEncryptionConfigExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait GetEncryptionConfigExceptionsUnion extends js.Object

object GetEncryptionConfigExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): GetEncryptionConfigExceptionsUnion = value.asInstanceOf[GetEncryptionConfigExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): GetEncryptionConfigExceptionsUnion = value.asInstanceOf[GetEncryptionConfigExceptionsUnion]
}

