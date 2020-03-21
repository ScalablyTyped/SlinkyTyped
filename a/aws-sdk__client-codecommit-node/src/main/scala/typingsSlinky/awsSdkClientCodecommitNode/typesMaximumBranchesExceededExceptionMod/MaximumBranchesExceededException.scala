package typingsSlinky.awsSdkClientCodecommitNode.typesMaximumBranchesExceededExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaximumBranchesExceededException
  extends ServiceException[MaximumBranchesExceededExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_MaximumBranchesExceededException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumBranchesExceededException = js.native
}

