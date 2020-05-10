package typingsSlinky.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends js.Object {
  var URI: js.UndefOr[String] = js.native
  var authToken: js.UndefOr[String] = js.native
  var callTimeout: js.UndefOr[Double] = js.native
  var callback: js.UndefOr[CbCallback] = js.native
  var defaultQoS: js.UndefOr[MessagingQOS] = js.native
  var email: js.UndefOr[String] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var messagingPort: js.UndefOr[Double] = js.native
  var messagingURI: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var registerUser: js.UndefOr[Boolean] = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var useUser: js.UndefOr[APIUser] = js.native
  var userToken: js.UndefOr[String] = js.native
}

object InitOptions {
  @scala.inline
  def apply(systemKey: String, systemSecret: String): InitOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCallTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: (/* error */ Boolean, /* response */ Resp_) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultQoS(value: MessagingQOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultQoS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultQoS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultQoS")(js.undefined)
        ret
    }
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
    def withLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagingPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagingPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagingPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagingPort")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagingURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagingURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagingURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagingURI")(js.undefined)
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
    def withRegisterUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisterUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerUser")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUser(value: APIUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUser")(js.undefined)
        ret
    }
    @scala.inline
    def withUserToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userToken")(js.undefined)
        ret
    }
  }
  
}

