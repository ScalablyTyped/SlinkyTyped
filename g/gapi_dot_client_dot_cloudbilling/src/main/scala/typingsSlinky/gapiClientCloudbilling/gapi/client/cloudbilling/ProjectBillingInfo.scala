package typingsSlinky.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectBillingInfo extends js.Object {
  /**
    * The resource name of the billing account associated with the project, if
    * any. For example, `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccountName: js.UndefOr[String] = js.native
  /**
    * True if the project is associated with an open billing account, to which
    * usage on the project is charged. False if the project is associated with a
    * closed billing account, or no billing account at all, and therefore cannot
    * use paid services. This field is read-only.
    */
  var billingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The resource name for the `ProjectBillingInfo`; has the form
    * `projects/{project_id}/billingInfo`. For example, the resource name for the
    * billing information for project `tokyo-rain-123` would be
    * `projects/tokyo-rain-123/billingInfo`. This field is read-only.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the project that this `ProjectBillingInfo` represents, such as
    * `tokyo-rain-123`. This is a convenience field so that you don't need to
    * parse the `name` field to obtain a project ID. This field is read-only.
    */
  var projectId: js.UndefOr[String] = js.native
}

object ProjectBillingInfo {
  @scala.inline
  def apply(): ProjectBillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectBillingInfo]
  }
  @scala.inline
  implicit class ProjectBillingInfoOps[Self <: ProjectBillingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAccountName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAccountName")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
  }
  
}

