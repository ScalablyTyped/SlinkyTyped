package typingsSlinky.awsSdkClientKinesisBrowser.updateShardCountExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
*/
trait UpdateShardCountExceptionsUnion extends js.Object

object UpdateShardCountExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): UpdateShardCountExceptionsUnion = value.asInstanceOf[UpdateShardCountExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): UpdateShardCountExceptionsUnion = value.asInstanceOf[UpdateShardCountExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): UpdateShardCountExceptionsUnion = value.asInstanceOf[UpdateShardCountExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UpdateShardCountExceptionsUnion = value.asInstanceOf[UpdateShardCountExceptionsUnion]
}

