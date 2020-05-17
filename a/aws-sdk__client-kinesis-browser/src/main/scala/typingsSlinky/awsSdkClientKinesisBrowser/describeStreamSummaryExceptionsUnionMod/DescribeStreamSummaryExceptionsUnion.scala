package typingsSlinky.awsSdkClientKinesisBrowser.describeStreamSummaryExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
*/
trait DescribeStreamSummaryExceptionsUnion extends js.Object

object DescribeStreamSummaryExceptionsUnion {
  @scala.inline
  implicit def apply(value: LimitExceededException): DescribeStreamSummaryExceptionsUnion = value.asInstanceOf[DescribeStreamSummaryExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DescribeStreamSummaryExceptionsUnion = value.asInstanceOf[DescribeStreamSummaryExceptionsUnion]
}

