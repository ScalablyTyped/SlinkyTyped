package typingsSlinky.awsSdkClientKmsNode.encryptExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException
import typingsSlinky.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
  - typingsSlinky.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

