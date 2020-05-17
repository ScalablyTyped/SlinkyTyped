package typingsSlinky.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesExpiredImportTokenExceptionMod.ExpiredImportTokenException
import typingsSlinky.awsSdkClientKmsBrowser.typesIncorrectKeyMaterialExceptionMod.IncorrectKeyMaterialException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidImportTokenExceptionMod.InvalidImportTokenException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
  - typingsSlinky.awsSdkClientKmsBrowser.typesIncorrectKeyMaterialExceptionMod.IncorrectKeyMaterialException
  - typingsSlinky.awsSdkClientKmsBrowser.typesExpiredImportTokenExceptionMod.ExpiredImportTokenException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidImportTokenExceptionMod.InvalidImportTokenException
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

