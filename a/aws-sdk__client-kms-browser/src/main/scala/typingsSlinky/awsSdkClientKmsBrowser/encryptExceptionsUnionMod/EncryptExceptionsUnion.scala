package typingsSlinky.awsSdkClientKmsBrowser.encryptExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException
import typingsSlinky.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod.KeyUnavailableException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod.KeyUnavailableException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait EncryptExceptionsUnion extends js.Object

object EncryptExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): EncryptExceptionsUnion = value.asInstanceOf[EncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: DisabledException): EncryptExceptionsUnion = value.asInstanceOf[EncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidGrantTokenException): EncryptExceptionsUnion = value.asInstanceOf[EncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidKeyUsageException): EncryptExceptionsUnion = value.asInstanceOf[EncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): EncryptExceptionsUnion = value.asInstanceOf[EncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): EncryptExceptionsUnion = value.asInstanceOf[EncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: KeyUnavailableException): EncryptExceptionsUnion = value.asInstanceOf[EncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): EncryptExceptionsUnion = value.asInstanceOf[EncryptExceptionsUnion]
}

