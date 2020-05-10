package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditConfig extends js.Object {
  /**
    * Specifies the identities that are exempted from "data access" audit logging for the `service` specified above. Follows the same format of
    * Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies a service that will be enabled for "data access" audit logging. For example, `resourcemanager`, `storage`, `compute`. `allServices` is a
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

