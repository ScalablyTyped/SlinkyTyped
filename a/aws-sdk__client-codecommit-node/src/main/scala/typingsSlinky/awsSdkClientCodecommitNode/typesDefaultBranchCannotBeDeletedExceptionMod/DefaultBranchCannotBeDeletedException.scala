package typingsSlinky.awsSdkClientCodecommitNode.typesDefaultBranchCannotBeDeletedExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.deleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultBranchCannotBeDeletedException
  extends ServiceException[DefaultBranchCannotBeDeletedExceptionDetails]
     with DeleteBranchExceptionsUnion {
  @JSName("name")
  var name_DefaultBranchCannotBeDeletedException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DefaultBranchCannotBeDeletedException
}

object DefaultBranchCannotBeDeletedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DefaultBranchCannotBeDeletedExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DefaultBranchCannotBeDeletedException,
    stack: String = null
  ): DefaultBranchCannotBeDeletedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultBranchCannotBeDeletedException]
  }
}

