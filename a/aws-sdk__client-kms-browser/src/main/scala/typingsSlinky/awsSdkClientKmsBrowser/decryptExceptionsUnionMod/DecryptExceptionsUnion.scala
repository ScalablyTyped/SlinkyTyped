package typingsSlinky.awsSdkClientKmsBrowser.decryptExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
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
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

