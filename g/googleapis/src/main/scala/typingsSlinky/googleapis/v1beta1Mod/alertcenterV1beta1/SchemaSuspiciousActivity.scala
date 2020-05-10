package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mobile suspicious activity alert. Derived from audit logs.
  */
@js.native
trait SchemaSuspiciousActivity extends js.Object {
  /**
    * The email of the user this alert was created for.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Required. The list of security events.
    */
  var events: js.UndefOr[js.Array[SchemaSuspiciousActivitySecurityDetail]] = js.native
}

object SchemaSuspiciousActivity {
  @scala.inline
  def apply(): SchemaSuspiciousActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuspiciousActivity]
  }
  @scala.inline
  implicit class SchemaSuspiciousActivityOps[Self <: SchemaSuspiciousActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[SchemaSuspiciousActivitySecurityDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
  }
  
}

