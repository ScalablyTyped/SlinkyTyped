package typingsSlinky.awsSdkClientCodecommitNode.typesCommitRequiredExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitRequiredException
  extends ServiceException[CommitRequiredExceptionDetails]
     with GetDifferencesExceptionsUnion
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_CommitRequiredException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitRequiredException = js.native
}

