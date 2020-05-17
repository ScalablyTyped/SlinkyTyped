package typingsSlinky.awsSdkClientKinesisBrowser.deleteStreamExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
*/
trait DeleteStreamExceptionsUnion extends js.Object

object DeleteStreamExceptionsUnion {
  @scala.inline
  implicit def apply(value: LimitExceededException): DeleteStreamExceptionsUnion = value.asInstanceOf[DeleteStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): DeleteStreamExceptionsUnion = value.asInstanceOf[DeleteStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteStreamExceptionsUnion = value.asInstanceOf[DeleteStreamExceptionsUnion]
}

