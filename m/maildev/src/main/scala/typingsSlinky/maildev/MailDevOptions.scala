package typingsSlinky.maildev

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for {@link MailDev} options.
  */
@js.native
trait MailDevOptions extends js.Object {
  /**
    * Do not start web UI
    *
    * @type {boolean}
    */
  var disableWeb: js.UndefOr[Boolean] = js.native
  /**
    * IP Address to bind SMTP service to', '0.0.0.0'
    *
    * @type {string}
    */
  var ip: js.UndefOr[String] = js.native
  /**
    * Open the Web GUI after startup
    *
    * @type {boolean}
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * SMTP host for outgoing emails
    *
    * @type {string}
    */
  var outgoingHost: js.UndefOr[String] = js.native
  /**
    * SMTP password for outgoing emails
    *
    * @type {string}
    */
  var outgoingPass: js.UndefOr[String] = js.native
  /**
    * SMTP port for outgoing emails.
    *
    * @type {number}
    */
  var outgoingPort: js.UndefOr[Double] = js.native
  /**
    * Use SMTP SSL for outgoing emails
    *
    * @type {boolean}
    */
  var outgoingSecure: js.UndefOr[Boolean] = js.native
  /**
    * SMTP user for outgoing emails
    *
    * @type {string}
    */
  var outgoingUser: js.UndefOr[String] = js.native
  /**
    * Do not output console.log messages
    *
    * @type {boolean}
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * SMTP port to catch emails.
    *
    * @type {number}
    */
  var smtp: js.UndefOr[Double] = js.native
  /**
    * Port to use for web UI
    *
    * @type {number}
    */
  var web: js.UndefOr[Double] = js.native
  /**
    * IP Address to bind HTTP service to
    *
    * @type {string}
    */
  var webIp: js.UndefOr[String] = js.native
  /**
    * HTTP password for GUI
    *
    * @type {string}
    */
  var webPass: js.UndefOr[String] = js.native
  /**
    * HTTP user for GUI
    *
    * @type {string}
    */
  var webUser: js.UndefOr[String] = js.native
}

object MailDevOptions {
  @scala.inline
  def apply(): MailDevOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailDevOptions]
  }
  @scala.inline
  implicit class MailDevOptionsOps[Self <: MailDevOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeb")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoingHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingHost")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoingPass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingPass")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoingPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingPort")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoingSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingSecure")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoingUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingUser")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSmtp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smtp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmtp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smtp")(js.undefined)
        ret
    }
    @scala.inline
    def withWeb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(js.undefined)
        ret
    }
    @scala.inline
    def withWebIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webIp")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPass")(js.undefined)
        ret
    }
    @scala.inline
    def withWebUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUser")(js.undefined)
        ret
    }
  }
  
}

