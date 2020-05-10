package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfigCloudAuditOptions extends js.Object {
  /** Information used by the Cloud Audit Logging pipeline. */
  var authorizationLoggingOptions: js.UndefOr[AuthorizationLoggingOptions] = js.native
  /** The log_name to populate in the Cloud Audit Record. */
  var logName: js.UndefOr[String] = js.native
}

object LogConfigCloudAuditOptions {
  @scala.inline
  def apply(): LogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigCloudAuditOptions]
  }
  @scala.inline
  implicit class LogConfigCloudAuditOptionsOps[Self <: LogConfigCloudAuditOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationLoggingOptions(value: AuthorizationLoggingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationLoggingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationLoggingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationLoggingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLogName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logName")(js.undefined)
        ret
    }
  }
  
}

