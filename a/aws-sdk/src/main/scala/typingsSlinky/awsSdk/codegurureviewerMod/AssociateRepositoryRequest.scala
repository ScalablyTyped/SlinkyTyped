package typingsSlinky.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateRepositoryRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you want to add a new repository association, this parameter specifies a unique identifier for the new repository association that helps ensure idempotency. If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken yourself for new versions and include that value in the request. You typically only need to interact with this value if you implement your own retry logic and want to ensure that a given repository association is not created twice. We recommend that you generate a UUID-type value to ensure uniqueness within the specified repository association. Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate repository associations if there are failures and retries. 
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.ClientRequestToken] = js.native
  /**
    * The repository to associate.
    */
  var Repository: typingsSlinky.awsSdk.codegurureviewerMod.Repository = js.native
}

object AssociateRepositoryRequest {
  @scala.inline
  def apply(Repository: Repository): AssociateRepositoryRequest = {
    val __obj = js.Dynamic.literal(Repository = Repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateRepositoryRequest]
  }
  @scala.inline
  implicit class AssociateRepositoryRequestOps[Self <: AssociateRepositoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepository(value: Repository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
  }
  
}

