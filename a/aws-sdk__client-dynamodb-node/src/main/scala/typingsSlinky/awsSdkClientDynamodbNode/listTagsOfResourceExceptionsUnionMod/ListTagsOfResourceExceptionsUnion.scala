package typingsSlinky.awsSdkClientDynamodbNode.listTagsOfResourceExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
*/
trait ListTagsOfResourceExceptionsUnion extends js.Object

object ListTagsOfResourceExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): ListTagsOfResourceExceptionsUnion = value.asInstanceOf[ListTagsOfResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListTagsOfResourceExceptionsUnion = value.asInstanceOf[ListTagsOfResourceExceptionsUnion]
}

