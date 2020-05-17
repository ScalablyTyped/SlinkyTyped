package typingsSlinky.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
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
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod.KeyUnavailableException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait ReEncryptExceptionsUnion extends js.Object

object ReEncryptExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): ReEncryptExceptionsUnion = value.asInstanceOf[ReEncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: DisabledException): ReEncryptExceptionsUnion = value.asInstanceOf[ReEncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidCiphertextException): ReEncryptExceptionsUnion = value.asInstanceOf[ReEncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidGrantTokenException): ReEncryptExceptionsUnion = value.asInstanceOf[ReEncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidKeyUsageException): ReEncryptExceptionsUnion = value.asInstanceOf[ReEncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): ReEncryptExceptionsUnion = value.asInstanceOf[ReEncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): ReEncryptExceptionsUnion = value.asInstanceOf[ReEncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: KeyUnavailableException): ReEncryptExceptionsUnion = value.asInstanceOf[ReEncryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): ReEncryptExceptionsUnion = value.asInstanceOf[ReEncryptExceptionsUnion]
}

