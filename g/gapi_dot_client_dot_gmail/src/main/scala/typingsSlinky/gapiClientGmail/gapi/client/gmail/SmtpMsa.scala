package typingsSlinky.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmtpMsa extends js.Object {
  /** The hostname of the SMTP service. Required. */
  var host: js.UndefOr[String] = js.native
  /**
    * The password that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or
    * update SendAs settings; it is never populated in responses.
    */
  var password: js.UndefOr[String] = js.native
  /** The port of the SMTP service. Required. */
  var port: js.UndefOr[Double] = js.native
  /** The protocol that will be used to secure communication with the SMTP service. Required. */
  var securityMode: js.UndefOr[String] = js.native
  /**
    * The username that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or
    * update SendAs settings; it is never populated in responses.
    */
  var username: js.UndefOr[String] = js.native
}

object SmtpMsa {
  @scala.inline
  def apply(): SmtpMsa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmtpMsa]
  }
  @scala.inline
  implicit class SmtpMsaOps[Self <: SmtpMsa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityMode")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

