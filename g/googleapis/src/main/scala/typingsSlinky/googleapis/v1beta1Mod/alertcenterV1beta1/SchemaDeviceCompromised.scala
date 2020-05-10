package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mobile device compromised alert. Derived from audit logs.
  */
@js.native
trait SchemaDeviceCompromised extends js.Object {
  /**
    * The email of the user this alert was created for.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Required. The list of security events.
    */
  var events: js.UndefOr[js.Array[SchemaDeviceCompromisedSecurityDetail]] = js.native
}

object SchemaDeviceCompromised {
  @scala.inline
  def apply(): SchemaDeviceCompromised = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceCompromised]
  }
  @scala.inline
  implicit class SchemaDeviceCompromisedOps[Self <: SchemaDeviceCompromised] (val x: Self) extends AnyVal {
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
    def withEvents(value: js.Array[SchemaDeviceCompromisedSecurityDetail]): Self = {
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

