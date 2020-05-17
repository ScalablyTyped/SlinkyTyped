package typingsSlinky.awsSdkClientKinesisBrowser.deregisterStreamConsumerExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
*/
trait DeregisterStreamConsumerExceptionsUnion extends js.Object

object DeregisterStreamConsumerExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): DeregisterStreamConsumerExceptionsUnion = value.asInstanceOf[DeregisterStreamConsumerExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): DeregisterStreamConsumerExceptionsUnion = value.asInstanceOf[DeregisterStreamConsumerExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeregisterStreamConsumerExceptionsUnion = value.asInstanceOf[DeregisterStreamConsumerExceptionsUnion]
}

