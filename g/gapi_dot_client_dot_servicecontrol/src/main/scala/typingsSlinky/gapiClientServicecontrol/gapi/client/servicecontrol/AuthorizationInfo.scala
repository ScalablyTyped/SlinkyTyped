package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationInfo extends js.Object {
  /**
    * Whether or not authorization for `resource` and `permission`
    * was granted.
    */
  var granted: js.UndefOr[Boolean] = js.native
  /** The required IAM permission. */
  var permission: js.UndefOr[String] = js.native
  /**
    * The resource being accessed, as a REST-style string. For example:
    *
    * bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
    */
  var resource: js.UndefOr[String] = js.native
}

object AuthorizationInfo {
  @scala.inline
  def apply(): AuthorizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationInfo]
  }
  @scala.inline
  implicit class AuthorizationInfoOps[Self <: AuthorizationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGranted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granted")(js.undefined)
        ret
    }
    @scala.inline
    def withPermission(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

