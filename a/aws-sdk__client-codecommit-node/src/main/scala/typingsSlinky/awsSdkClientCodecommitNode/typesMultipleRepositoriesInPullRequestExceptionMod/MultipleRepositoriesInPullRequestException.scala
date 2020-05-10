package typingsSlinky.awsSdkClientCodecommitNode.typesMultipleRepositoriesInPullRequestExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleRepositoriesInPullRequestException
  extends ServiceException[MultipleRepositoriesInPullRequestExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_MultipleRepositoriesInPullRequestException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MultipleRepositoriesInPullRequestException = js.native
}

object MultipleRepositoriesInPullRequestException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MultipleRepositoriesInPullRequestExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MultipleRepositoriesInPullRequestException
  ): MultipleRepositoriesInPullRequestException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleRepositoriesInPullRequestException]
  }
  @scala.inline
  implicit class MultipleRepositoriesInPullRequestExceptionOps[Self <: MultipleRepositoriesInPullRequestException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MultipleRepositoriesInPullRequestException
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

