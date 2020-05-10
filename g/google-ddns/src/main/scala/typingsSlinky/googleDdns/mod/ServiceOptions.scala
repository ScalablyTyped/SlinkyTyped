package typingsSlinky.googleDdns.mod

import typingsSlinky.googleDdns.googleDdnsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOptions extends DynamicDNSOptions {
  /**
    * The number of seconds between updates.
    */
  var checkInterval: js.UndefOr[Double] = js.native
  /**
    * Whether to stop the service if the maximum number of consecutive
    * errors is reached.
    */
  var exitOnMaxErrors: js.UndefOr[Boolean] = js.native
  /**
    * The path of the log file to output to. Set to `false` to disable
    * logging to file.
    */
  var logPath: js.UndefOr[String | `false`] = js.native
  /**
    * Whether to log output to the console.
    */
  var logToConsole: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of consecutive errors before stopping the service
    * if `exitOnMaxErrors` is `true`.
    */
  var maxConsecutiveErrors: js.UndefOr[Double] = js.native
}

object ServiceOptions {
  @scala.inline
  def apply(hostname: String, password: String, username: String): ServiceOptions = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOptions]
  }
  @scala.inline
  implicit class ServiceOptionsOps[Self <: ServiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withExitOnMaxErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnMaxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitOnMaxErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnMaxErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withLogPath(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLogToConsole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logToConsole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogToConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logToConsole")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConsecutiveErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConsecutiveErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConsecutiveErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConsecutiveErrors")(js.undefined)
        ret
    }
  }
  
}

