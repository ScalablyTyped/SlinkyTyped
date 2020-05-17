package typingsSlinky.awsSdkClientKmsNode.reEncryptExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
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
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
  - typingsSlinky.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

