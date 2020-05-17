package typingsSlinky.awsSdkClientKinesisBrowser.describeStreamExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
*/
trait DescribeStreamExceptionsUnion extends js.Object

object DescribeStreamExceptionsUnion {
  @scala.inline
  implicit def apply(value: LimitExceededException): DescribeStreamExceptionsUnion = value.asInstanceOf[DescribeStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DescribeStreamExceptionsUnion = value.asInstanceOf[DescribeStreamExceptionsUnion]
}

