package typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNamesRequiredExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.batchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryNamesRequiredException
  extends ServiceException[RepositoryNamesRequiredExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_RepositoryNamesRequiredException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNamesRequiredException = js.native
}

