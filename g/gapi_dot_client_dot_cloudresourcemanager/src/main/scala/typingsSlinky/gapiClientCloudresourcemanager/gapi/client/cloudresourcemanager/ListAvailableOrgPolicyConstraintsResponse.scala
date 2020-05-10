package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableOrgPolicyConstraintsResponse extends js.Object {
  /** The collection of constraints that are settable on the request resource. */
  var constraints: js.UndefOr[js.Array[Constraint]] = js.native
  /** Page token used to retrieve the next page. This is currently not used. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListAvailableOrgPolicyConstraintsResponse {
  @scala.inline
  def apply(): ListAvailableOrgPolicyConstraintsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableOrgPolicyConstraintsResponse]
  }
  @scala.inline
  implicit class ListAvailableOrgPolicyConstraintsResponseOps[Self <: ListAvailableOrgPolicyConstraintsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: js.Array[Constraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

