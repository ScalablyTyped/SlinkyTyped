package typingsSlinky.awsSdkClientKmsNode.createKeyExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
import typingsSlinky.awsSdkClientKmsNode.typesTagExceptionMod.TagException
import typingsSlinky.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsNode.typesTagExceptionMod.TagException
*/
trait CreateKeyExceptionsUnion extends js.Object

object CreateKeyExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): CreateKeyExceptionsUnion = value.asInstanceOf[CreateKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): CreateKeyExceptionsUnion = value.asInstanceOf[CreateKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): CreateKeyExceptionsUnion = value.asInstanceOf[CreateKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): CreateKeyExceptionsUnion = value.asInstanceOf[CreateKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: MalformedPolicyDocumentException): CreateKeyExceptionsUnion = value.asInstanceOf[CreateKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: TagException): CreateKeyExceptionsUnion = value.asInstanceOf[CreateKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperationException): CreateKeyExceptionsUnion = value.asInstanceOf[CreateKeyExceptionsUnion]
}

