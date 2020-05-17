package typingsSlinky.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import typingsSlinky.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait PutKeyPolicyExceptionsUnion extends js.Object

object PutKeyPolicyExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): PutKeyPolicyExceptionsUnion = value.asInstanceOf[PutKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): PutKeyPolicyExceptionsUnion = value.asInstanceOf[PutKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): PutKeyPolicyExceptionsUnion = value.asInstanceOf[PutKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): PutKeyPolicyExceptionsUnion = value.asInstanceOf[PutKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): PutKeyPolicyExceptionsUnion = value.asInstanceOf[PutKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: MalformedPolicyDocumentException): PutKeyPolicyExceptionsUnion = value.asInstanceOf[PutKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): PutKeyPolicyExceptionsUnion = value.asInstanceOf[PutKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperationException): PutKeyPolicyExceptionsUnion = value.asInstanceOf[PutKeyPolicyExceptionsUnion]
}

