package typingsSlinky.awsSdkClientKmsNode.deleteImportedKeyMaterialExceptionsUnionMod

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
trait DeleteImportedKeyMaterialExceptionsUnion extends js.Object

object DeleteImportedKeyMaterialExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): DeleteImportedKeyMaterialExceptionsUnion = value.asInstanceOf[DeleteImportedKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): DeleteImportedKeyMaterialExceptionsUnion = value.asInstanceOf[DeleteImportedKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): DeleteImportedKeyMaterialExceptionsUnion = value.asInstanceOf[DeleteImportedKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): DeleteImportedKeyMaterialExceptionsUnion = value.asInstanceOf[DeleteImportedKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteImportedKeyMaterialExceptionsUnion = value.asInstanceOf[DeleteImportedKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperationException): DeleteImportedKeyMaterialExceptionsUnion = value.asInstanceOf[DeleteImportedKeyMaterialExceptionsUnion]
}

