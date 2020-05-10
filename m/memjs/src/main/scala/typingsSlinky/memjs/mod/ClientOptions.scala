package typingsSlinky.memjs.mod

import typingsSlinky.memjs.AnonLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  /**
    * The default expiration in seconds to use. A `0` means never expire,
    * if it is greater than 30 days (60 x 60 x 24 x 30), it is
    * treated as a UNIX time (number of seconds since January 1, 1970).
    * @default 0
    */
  var expires: js.UndefOr[Double] = js.native
  /**
    * How many seconds to wait until retrying a failed server.
    * @default 60
    */
  var failoverTime: js.UndefOr[Double] = js.native
  /**
    * A logger object that responds to `log(string)` method calls.
    * @default console
    */
  var logger: js.UndefOr[AnonLog] = js.native
  /**
    * The number of times to retry an operation in lieu of failures.
    * @default 2
    */
  var retries: js.UndefOr[Double] = js.native
  /**
    * @default 0.2
    */
  var retry_delay: js.UndefOr[Double] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withFailoverTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailoverTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: AnonLog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_delay")(js.undefined)
        ret
    }
  }
  
}

