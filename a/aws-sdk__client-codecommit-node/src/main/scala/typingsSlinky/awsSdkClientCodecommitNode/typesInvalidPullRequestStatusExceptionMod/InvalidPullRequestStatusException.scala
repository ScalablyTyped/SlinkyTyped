package typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPullRequestStatusExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidPullRequestStatusException
  extends ServiceException[InvalidPullRequestStatusExceptionDetails]
     with ListPullRequestsExceptionsUnion
     with UpdatePullRequestStatusExceptionsUnion {
  @JSName("name")
  var name_InvalidPullRequestStatusException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusException = js.native
}

