package typingsSlinky.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod

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

