package typingsSlinky.awsSdkClientKinesisBrowser.describeStreamConsumerExceptionsUnionMod

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
trait DescribeStreamConsumerExceptionsUnion extends js.Object

object DescribeStreamConsumerExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): DescribeStreamConsumerExceptionsUnion = value.asInstanceOf[DescribeStreamConsumerExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): DescribeStreamConsumerExceptionsUnion = value.asInstanceOf[DescribeStreamConsumerExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DescribeStreamConsumerExceptionsUnion = value.asInstanceOf[DescribeStreamConsumerExceptionsUnion]
}

