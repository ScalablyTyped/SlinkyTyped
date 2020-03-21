package typingsSlinky.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidOrderException
  extends ServiceException[InvalidOrderExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidOrderException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException = js.native
}

