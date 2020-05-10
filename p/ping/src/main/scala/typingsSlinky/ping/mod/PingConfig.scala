package typingsSlinky.ping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PingConfig extends js.Object {
  /**
    * Additional arguments. Default `[]`
    */
  var extra: js.UndefOr[js.Array[String]] = js.native
  /**
    *  Exit after sending number of `ECHO_REQUEST`. Default `1`
    */
  var min_reply: js.UndefOr[Double] = js.native
  /**
    * Map IP address to hostname or not. Default `true`
    */
  var numeric: js.UndefOr[Boolean] = js.native
  /**
    * Source address for sending the ping.
    */
  var sourceAddr: js.UndefOr[String] = js.native
  /**
    * Time duration, in seconds, for ping command to exit. Default `2` on Mac/Linux, `5` on Windows.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Ping via ipv6 or not. Default `false`
    */
  var v6: js.UndefOr[Boolean] = js.native
}

object PingConfig {
  @scala.inline
  def apply(): PingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PingConfig]
  }
  @scala.inline
  implicit class PingConfigOps[Self <: PingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_reply(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_reply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_reply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_reply")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAddr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAddr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAddr")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withV6(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v6")(js.undefined)
        ret
    }
  }
  
}

