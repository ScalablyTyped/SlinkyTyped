package typingsSlinky.awsSdkClientKmsBrowser.getParametersForImportExceptionsUnionMod

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
trait GetParametersForImportExceptionsUnion extends js.Object

object GetParametersForImportExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperationException): GetParametersForImportExceptionsUnion = value.asInstanceOf[GetParametersForImportExceptionsUnion]
}

