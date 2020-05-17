package typingsSlinky.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesExpiredImportTokenExceptionMod.ExpiredImportTokenException
import typingsSlinky.awsSdkClientKmsNode.typesIncorrectKeyMaterialExceptionMod.IncorrectKeyMaterialException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidImportTokenExceptionMod.InvalidImportTokenException
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
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
  - typingsSlinky.awsSdkClientKmsNode.typesIncorrectKeyMaterialExceptionMod.IncorrectKeyMaterialException
  - typingsSlinky.awsSdkClientKmsNode.typesExpiredImportTokenExceptionMod.ExpiredImportTokenException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidImportTokenExceptionMod.InvalidImportTokenException
*/
trait ImportKeyMaterialExceptionsUnion extends js.Object

object ImportKeyMaterialExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): ImportKeyMaterialExceptionsUnion = value.asInstanceOf[ImportKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: ExpiredImportTokenException): ImportKeyMaterialExceptionsUnion = value.asInstanceOf[ImportKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: IncorrectKeyMaterialException): ImportKeyMaterialExceptionsUnion = value.asInstanceOf[ImportKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): ImportKeyMaterialExceptionsUnion = value.asInstanceOf[ImportKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidCiphertextException): ImportKeyMaterialExceptionsUnion = value.asInstanceOf[ImportKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidImportTokenException): ImportKeyMaterialExceptionsUnion = value.asInstanceOf[ImportKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): ImportKeyMaterialExceptionsUnion = value.asInstanceOf[ImportKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): ImportKeyMaterialExceptionsUnion = value.asInstanceOf[ImportKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): ImportKeyMaterialExceptionsUnion = value.asInstanceOf[ImportKeyMaterialExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperationException): ImportKeyMaterialExceptionsUnion = value.asInstanceOf[ImportKeyMaterialExceptionsUnion]
}

