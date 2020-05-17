package typingsSlinky.awsSdkClientXrayNode.putEncryptionConfigExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait PutEncryptionConfigExceptionsUnion extends js.Object

object PutEncryptionConfigExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): PutEncryptionConfigExceptionsUnion = value.asInstanceOf[PutEncryptionConfigExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): PutEncryptionConfigExceptionsUnion = value.asInstanceOf[PutEncryptionConfigExceptionsUnion]
}

