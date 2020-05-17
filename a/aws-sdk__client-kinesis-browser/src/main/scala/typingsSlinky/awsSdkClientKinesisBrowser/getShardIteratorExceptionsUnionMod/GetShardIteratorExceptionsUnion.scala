package typingsSlinky.awsSdkClientKinesisBrowser.getShardIteratorExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
*/
trait GetShardIteratorExceptionsUnion extends js.Object

object GetShardIteratorExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): GetShardIteratorExceptionsUnion = value.asInstanceOf[GetShardIteratorExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): GetShardIteratorExceptionsUnion = value.asInstanceOf[GetShardIteratorExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetShardIteratorExceptionsUnion = value.asInstanceOf[GetShardIteratorExceptionsUnion]
}

