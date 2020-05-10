package typingsSlinky.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceAccountRequest extends js.Object {
  /**
    * Required. The account id that is used to generate the service account
    * email address and a stable unique id. It is unique within a project,
    * must be 6-30 characters long, and match the regular expression
    * `[a-z]([-a-z0-9]&#42;[a-z0-9])` to comply with RFC1035.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The ServiceAccount resource to create.
    * Currently, only the following values are user assignable:
    * `display_name` .
    */
  var serviceAccount: js.UndefOr[ServiceAccount] = js.native
}

object CreateServiceAccountRequest {
  @scala.inline
  def apply(): CreateServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceAccountRequest]
  }
  @scala.inline
  implicit class CreateServiceAccountRequestOps[Self <: CreateServiceAccountRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccount(value: ServiceAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(js.undefined)
        ret
    }
  }
  
}

