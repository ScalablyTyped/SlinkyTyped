package typingsSlinky.redis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOpts extends js.Object {
  var auth_pass: js.UndefOr[String] = js.native
  var connect_timeout: js.UndefOr[Double] = js.native
  var db: js.UndefOr[String | Double] = js.native
  var detect_buffers: js.UndefOr[Boolean] = js.native
  var enable_offline_queue: js.UndefOr[Boolean] = js.native
  var family: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var max_attempts: js.UndefOr[Double] = js.native
  var no_ready_check: js.UndefOr[Boolean] = js.native
  var parser: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var rename_commands: js.UndefOr[StringDictionary[String] | Null] = js.native
  var retry_max_delay: js.UndefOr[Double] = js.native
  var retry_strategy: js.UndefOr[RetryStrategy] = js.native
  var retry_unfulfilled_commands: js.UndefOr[Boolean] = js.native
  var return_buffers: js.UndefOr[Boolean] = js.native
  var socket_initial_delay: js.UndefOr[Double] = js.native
  var socket_keepalive: js.UndefOr[Boolean] = js.native
  var string_numbers: js.UndefOr[Boolean] = js.native
  var tls: js.UndefOr[js.Any] = js.native
  var url: js.UndefOr[String] = js.native
}

object ClientOpts {
  @scala.inline
  def apply(): ClientOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOpts]
  }
  @scala.inline
  implicit class ClientOptsOps[Self <: ClientOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth_pass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_pass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_pass")(js.undefined)
        ret
    }
    @scala.inline
    def withConnect_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnect_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDb(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(js.undefined)
        ret
    }
    @scala.inline
    def withDetect_buffers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect_buffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetect_buffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect_buffers")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable_offline_queue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_offline_queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable_offline_queue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_offline_queue")(js.undefined)
        ret
    }
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
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
    def withMax_attempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_attempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_attempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_attempts")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_ready_check(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_ready_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_ready_check: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_ready_check")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
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
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRename_commands(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename_commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRename_commands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename_commands")(js.undefined)
        ret
    }
    @scala.inline
    def withRename_commandsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename_commands")(null)
        ret
    }
    @scala.inline
    def withRetry_max_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_max_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_max_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_max_delay")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry_strategy(value: /* options */ RetryStrategyOptions => Double | js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_strategy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRetry_strategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry_unfulfilled_commands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_unfulfilled_commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_unfulfilled_commands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_unfulfilled_commands")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_buffers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_buffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_buffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_buffers")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket_initial_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket_initial_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket_initial_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket_initial_delay")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket_keepalive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket_keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket_keepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket_keepalive")(js.undefined)
        ret
    }
    @scala.inline
    def withString_numbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string_numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString_numbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string_numbers")(js.undefined)
        ret
    }
    @scala.inline
    def withTls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

