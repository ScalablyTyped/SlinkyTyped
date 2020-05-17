package typingsSlinky.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsBrowser.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
import typingsSlinky.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException
import typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesMalformedPolicyDocumentExceptionMod.MalformedPolicyDocumentException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException
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

