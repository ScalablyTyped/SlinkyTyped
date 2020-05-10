package typingsSlinky.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleIamV1AuditLogConfig extends js.Object {
  /**
    * Specifies the identities that do not cause logging for this type of
    * permission.
    * Follows the same format of Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
  /** The log type that this config enables. */
  var logType: js.UndefOr[String] = js.native
}

object GoogleIamV1AuditLogConfig {
  @scala.inline
  def apply(): GoogleIamV1AuditLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIamV1AuditLogConfig]
  }
  @scala.inline
  implicit class GoogleIamV1AuditLogConfigOps[Self <: GoogleIamV1AuditLogConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLogType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logType")(js.undefined)
        ret
    }
  }
  
}

