package typingsSlinky.awsSdkClientKmsBrowser.deleteImportedKeyMaterialExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
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

