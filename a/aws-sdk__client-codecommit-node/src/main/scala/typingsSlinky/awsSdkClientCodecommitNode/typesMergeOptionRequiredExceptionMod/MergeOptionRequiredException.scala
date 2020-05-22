package typingsSlinky.awsSdkClientCodecommitNode.typesMergeOptionRequiredExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeOptionRequiredException
  extends ServiceException[MergeOptionRequiredExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_MergeOptionRequiredException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MergeOptionRequiredException
}

object MergeOptionRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MergeOptionRequiredExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MergeOptionRequiredException,
    stack: String = null
  ): MergeOptionRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeOptionRequiredException]
  }
}

