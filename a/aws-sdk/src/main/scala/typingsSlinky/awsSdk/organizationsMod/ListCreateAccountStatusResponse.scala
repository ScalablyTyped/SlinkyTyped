package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreateAccountStatusResponse extends js.Object {
  /**
    * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in the output only after the account has been successfully created.
    */
  var CreateAccountStatuses: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.CreateAccountStatuses] = js.native
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.NextToken] = js.native
}

object ListCreateAccountStatusResponse {
  @scala.inline
  def apply(): ListCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreateAccountStatusResponse]
  }
  @scala.inline
  implicit class ListCreateAccountStatusResponseOps[Self <: ListCreateAccountStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAccountStatuses(value: CreateAccountStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateAccountStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateAccountStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateAccountStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

