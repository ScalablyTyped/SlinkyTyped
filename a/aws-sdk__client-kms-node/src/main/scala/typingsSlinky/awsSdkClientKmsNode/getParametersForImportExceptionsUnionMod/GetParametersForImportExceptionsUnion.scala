package typingsSlinky.awsSdkClientKmsNode.getParametersForImportExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import typingsSlinky.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait GetParametersForImportExceptionsUnion extends js.Object

object GetParametersForImportExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperationException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
}

