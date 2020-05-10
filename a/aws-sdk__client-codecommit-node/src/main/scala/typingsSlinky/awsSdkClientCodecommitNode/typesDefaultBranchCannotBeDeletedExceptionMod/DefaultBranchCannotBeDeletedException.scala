package typingsSlinky.awsSdkClientCodecommitNode.typesDefaultBranchCannotBeDeletedExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.deleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultBranchCannotBeDeletedException
  extends ServiceException[DefaultBranchCannotBeDeletedExceptionDetails]
     with DeleteBranchExceptionsUnion {
  @JSName("name")
  var name_DefaultBranchCannotBeDeletedException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DefaultBranchCannotBeDeletedException = js.native
}

object DefaultBranchCannotBeDeletedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DefaultBranchCannotBeDeletedExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DefaultBranchCannotBeDeletedException
  ): DefaultBranchCannotBeDeletedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultBranchCannotBeDeletedException]
  }
  @scala.inline
  implicit class DefaultBranchCannotBeDeletedExceptionOps[Self <: DefaultBranchCannotBeDeletedException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DefaultBranchCannotBeDeletedException
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

