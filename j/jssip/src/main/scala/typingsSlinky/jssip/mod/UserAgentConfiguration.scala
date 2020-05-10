package typingsSlinky.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentConfiguration extends js.Object {
  var authorization_user: js.UndefOr[String] = js.native
  var connection_recovery_max_interval: js.UndefOr[Double] = js.native
  var connection_recovery_min_interval: js.UndefOr[Double] = js.native
  var contact_uri: js.UndefOr[String] = js.native
  var display_name: js.UndefOr[String] = js.native
  var ha1: js.UndefOr[String] = js.native
  var instance_id: js.UndefOr[String] = js.native
  var no_answer_timeout: js.UndefOr[Double] = js.native
  var password: js.UndefOr[String] = js.native
  var realm: js.UndefOr[String] = js.native
  var register: js.UndefOr[Boolean] = js.native
  var register_expires: js.UndefOr[Double] = js.native
  var registrar_server: js.UndefOr[String] = js.native
  var session_timers: js.UndefOr[Boolean] = js.native
  var session_timers_refresh_method: js.UndefOr[String] = js.native
  var sockets: Socket | js.Array[Socket] = js.native
  var uri: String = js.native
  var use_reloaded_route: js.UndefOr[Boolean] = js.native
  var user_agent: js.UndefOr[String] = js.native
}

object UserAgentConfiguration {
  @scala.inline
  def apply(sockets: Socket | js.Array[Socket], uri: String): UserAgentConfiguration = {
    val __obj = js.Dynamic.literal(sockets = sockets.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentConfiguration]
  }
  @scala.inline
  implicit class UserAgentConfigurationOps[Self <: UserAgentConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSockets(value: Socket | js.Array[Socket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorization_user(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization_user: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_user")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_recovery_max_interval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_recovery_max_interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_recovery_max_interval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_recovery_max_interval")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_recovery_min_interval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_recovery_min_interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_recovery_min_interval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_recovery_min_interval")(js.undefined)
        ret
    }
    @scala.inline
    def withContact_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(js.undefined)
        ret
    }
    @scala.inline
    def withHa1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHa1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha1")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance_id")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_answer_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_answer_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_answer_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_answer_timeout")(js.undefined)
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
    def withRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister_expires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register_expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegister_expires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register_expires")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrar_server(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrar_server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrar_server: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrar_server")(js.undefined)
        ret
    }
    @scala.inline
    def withSession_timers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_timers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_timers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_timers")(js.undefined)
        ret
    }
    @scala.inline
    def withSession_timers_refresh_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_timers_refresh_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_timers_refresh_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_timers_refresh_method")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_reloaded_route(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_reloaded_route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_reloaded_route: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_reloaded_route")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_agent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_agent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(js.undefined)
        ret
    }
  }
  
}

