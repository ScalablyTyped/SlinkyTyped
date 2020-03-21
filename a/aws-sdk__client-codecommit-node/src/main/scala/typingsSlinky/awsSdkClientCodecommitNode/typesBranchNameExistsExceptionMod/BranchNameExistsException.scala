package typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameExistsExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchNameExistsException
  extends ServiceException[BranchNameExistsExceptionDetails]
     with CreateBranchExceptionsUnion {
  @JSName("name")
  var name_BranchNameExistsException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException = js.native
}

