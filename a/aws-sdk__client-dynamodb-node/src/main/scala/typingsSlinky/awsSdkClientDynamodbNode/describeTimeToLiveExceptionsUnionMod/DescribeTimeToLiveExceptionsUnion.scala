package typingsSlinky.awsSdkClientDynamodbNode.describeTimeToLiveExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
*/
trait DescribeTimeToLiveExceptionsUnion extends js.Object

object DescribeTimeToLiveExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeTimeToLiveExceptionsUnion = value.asInstanceOf[DescribeTimeToLiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DescribeTimeToLiveExceptionsUnion = value.asInstanceOf[DescribeTimeToLiveExceptionsUnion]
}

