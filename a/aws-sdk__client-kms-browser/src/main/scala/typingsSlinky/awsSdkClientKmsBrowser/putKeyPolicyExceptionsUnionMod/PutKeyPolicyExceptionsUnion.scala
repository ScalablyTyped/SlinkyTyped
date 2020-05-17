package typingsSlinky.awsSdkClientKmsBrowser.putKeyPolicyExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsBrowser.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

