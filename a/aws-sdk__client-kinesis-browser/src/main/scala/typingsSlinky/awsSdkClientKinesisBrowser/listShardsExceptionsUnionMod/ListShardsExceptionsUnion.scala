package typingsSlinky.awsSdkClientKinesisBrowser.listShardsExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod.ExpiredNextTokenException
import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod.ExpiredNextTokenException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
*/
trait ListShardsExceptionsUnion extends js.Object

object ListShardsExceptionsUnion {
  @scala.inline
  implicit def apply(value: ExpiredNextTokenException): ListShardsExceptionsUnion = value.asInstanceOf[ListShardsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArgumentException): ListShardsExceptionsUnion = value.asInstanceOf[ListShardsExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): ListShardsExceptionsUnion = value.asInstanceOf[ListShardsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): ListShardsExceptionsUnion = value.asInstanceOf[ListShardsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListShardsExceptionsUnion = value.asInstanceOf[ListShardsExceptionsUnion]
}

