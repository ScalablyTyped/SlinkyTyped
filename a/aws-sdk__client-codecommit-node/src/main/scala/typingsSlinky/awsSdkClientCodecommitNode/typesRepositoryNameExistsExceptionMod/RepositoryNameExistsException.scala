package typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updateRepositoryNameExceptionsUnionMod.UpdateRepositoryNameExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryNameExistsException
  extends ServiceException[RepositoryNameExistsExceptionDetails]
     with CreateRepositoryExceptionsUnion
     with UpdateRepositoryNameExceptionsUnion {
  @JSName("name")
  var name_RepositoryNameExistsException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameExistsException = js.native
}

