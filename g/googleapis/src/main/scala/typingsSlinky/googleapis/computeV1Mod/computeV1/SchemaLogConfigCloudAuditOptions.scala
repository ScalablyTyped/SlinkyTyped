package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Write a Cloud Audit log
  */
@js.native
trait SchemaLogConfigCloudAuditOptions extends js.Object {
  /**
    * Information used by the Cloud Audit Logging pipeline.
    */
  var authorizationLoggingOptions: js.UndefOr[SchemaAuthorizationLoggingOptions] = js.native
  /**
    * The log_name to populate in the Cloud Audit Record.
    */
  var logName: js.UndefOr[String] = js.native
}

object SchemaLogConfigCloudAuditOptions {
  @scala.inline
  def apply(): SchemaLogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigCloudAuditOptions]
  }
  @scala.inline
  implicit class SchemaLogConfigCloudAuditOptionsOps[Self <: SchemaLogConfigCloudAuditOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationLoggingOptions(value: SchemaAuthorizationLoggingOptions): Self = {
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

