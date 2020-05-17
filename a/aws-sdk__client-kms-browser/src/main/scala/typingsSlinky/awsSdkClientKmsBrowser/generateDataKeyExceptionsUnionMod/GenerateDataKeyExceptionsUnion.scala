package typingsSlinky.awsSdkClientKmsBrowser.generateDataKeyExceptionsUnionMod

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
trait GenerateDataKeyExceptionsUnion extends js.Object

object GenerateDataKeyExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): GenerateDataKeyExceptionsUnion = value.asInstanceOf[GenerateDataKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: DisabledException): GenerateDataKeyExceptionsUnion = value.asInstanceOf[GenerateDataKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidGrantTokenException): GenerateDataKeyExceptionsUnion = value.asInstanceOf[GenerateDataKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidKeyUsageException): GenerateDataKeyExceptionsUnion = value.asInstanceOf[GenerateDataKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): GenerateDataKeyExceptionsUnion = value.asInstanceOf[GenerateDataKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): GenerateDataKeyExceptionsUnion = value.asInstanceOf[GenerateDataKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KeyUnavailableException): GenerateDataKeyExceptionsUnion = value.asInstanceOf[GenerateDataKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GenerateDataKeyExceptionsUnion = value.asInstanceOf[GenerateDataKeyExceptionsUnion]
}

