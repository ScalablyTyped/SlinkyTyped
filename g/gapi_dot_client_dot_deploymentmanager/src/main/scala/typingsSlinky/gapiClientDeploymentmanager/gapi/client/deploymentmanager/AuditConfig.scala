package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditConfig extends js.Object {
  /** The configuration for logging of each type of permission. */
  var auditLogConfigs: js.UndefOr[js.Array[AuditLogConfig]] = js.native
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a
    * special value that covers all services.
    */
  var service: js.UndefOr[String] = js.native
}

object AuditConfig {
  @scala.inline
  def apply(): AuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditConfig]
  }
  @scala.inline
  implicit class AuditConfigOps[Self <: AuditConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditLogConfigs(value: js.Array[AuditLogConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditLogConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditLogConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditLogConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withExemptedMembers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exemptedMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExemptedMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exemptedMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

