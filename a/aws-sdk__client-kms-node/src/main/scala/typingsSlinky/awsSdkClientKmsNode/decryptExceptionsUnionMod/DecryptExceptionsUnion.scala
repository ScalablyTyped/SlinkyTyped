package typingsSlinky.awsSdkClientKmsNode.decryptExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
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
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait DecryptExceptionsUnion extends js.Object

object DecryptExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): DecryptExceptionsUnion = value.asInstanceOf[DecryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: DisabledException): DecryptExceptionsUnion = value.asInstanceOf[DecryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidCiphertextException): DecryptExceptionsUnion = value.asInstanceOf[DecryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidGrantTokenException): DecryptExceptionsUnion = value.asInstanceOf[DecryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): DecryptExceptionsUnion = value.asInstanceOf[DecryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): DecryptExceptionsUnion = value.asInstanceOf[DecryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: KeyUnavailableException): DecryptExceptionsUnion = value.asInstanceOf[DecryptExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DecryptExceptionsUnion = value.asInstanceOf[DecryptExceptionsUnion]
}

