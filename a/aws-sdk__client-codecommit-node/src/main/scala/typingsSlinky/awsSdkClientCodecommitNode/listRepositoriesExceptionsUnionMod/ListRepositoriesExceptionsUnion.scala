package typingsSlinky.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod

import typingsSlinky.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException
import typingsSlinky.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException
import typingsSlinky.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException
  - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException
  - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException
*/
trait ListRepositoriesExceptionsUnion extends js.Object

object ListRepositoriesExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidContinuationTokenException): ListRepositoriesExceptionsUnion = value.asInstanceOf[ListRepositoriesExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidOrderException): ListRepositoriesExceptionsUnion = value.asInstanceOf[ListRepositoriesExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidSortByException): ListRepositoriesExceptionsUnion = value.asInstanceOf[ListRepositoriesExceptionsUnion]
}

