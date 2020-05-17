package typingsSlinky.googleCloudPubsub.pubsubMod.google.iam.v1

import typingsSlinky.googleCloudPubsub.pubsubMod.google.iam.v1.AuditConfigDelta.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an AuditConfigDelta. */
@js.native
trait IAuditConfigDelta extends js.Object {
  /** AuditConfigDelta action */
  var action: js.UndefOr[Action | Null] = js.native
  /** AuditConfigDelta exemptedMember */
  var exemptedMember: js.UndefOr[String | Null] = js.native
  /** AuditConfigDelta logType */
  var logType: js.UndefOr[String | Null] = js.native
  /** AuditConfigDelta service */
  var service: js.UndefOr[String | Null] = js.native
}

object IAuditConfigDelta {
  @scala.inline
  def apply(): IAuditConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuditConfigDelta]
  }
  @scala.inline
  implicit class IAuditConfigDeltaOps[Self <: IAuditConfigDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withActionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(null)
        ret
    }
    @scala.inline
    def withExemptedMember(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exemptedMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExemptedMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exemptedMember")(js.undefined)
        ret
    }
    @scala.inline
    def withExemptedMemberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exemptedMember")(null)
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
    @scala.inline
    def withLogTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logType")(null)
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
    @scala.inline
    def withServiceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(null)
        ret
    }
  }
  
}

