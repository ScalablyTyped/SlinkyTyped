package typingsSlinky.awsSdkClientDynamodbBrowser.listTagsOfResourceExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait ListTagsOfResourceExceptionsUnion extends js.Object

object ListTagsOfResourceExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): ListTagsOfResourceExceptionsUnion = value.asInstanceOf[ListTagsOfResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListTagsOfResourceExceptionsUnion = value.asInstanceOf[ListTagsOfResourceExceptionsUnion]
}

