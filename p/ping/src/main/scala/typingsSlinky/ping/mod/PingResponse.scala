package typingsSlinky.ping.mod

import typingsSlinky.ping.pingStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PingResponse extends js.Object {
  /**
    * `true` for existing host
    */
  var alive: Boolean = js.native
  /**
    * Average time for collection records. `unknown` if ping fails.
    */
  var avg: String = js.native
  /**
    * The input IP address or host. `unknown` if ping fails.
    */
  var host: String = js.native
  /**
    * Maximum time for collection records. `unknown` if ping fails.
    */
  var max: String = js.native
  /**
    * Minimum time for collection records. `unknown` if ping fails.
    */
  var min: String = js.native
  /**
    * Numeric target IP address
    */
  var numeric_host: js.UndefOr[String] = js.native
  /**
    * Raw stdout from system ping
    */
  var output: String = js.native
  /**
    * Standard deviation time for collected records. `unknown` if ping fails.
    */
  var stddev: String = js.native
  /**
    * Time (float) in ms for first successful ping response. `unknown` if ping fails.
    */
  var time: Double | unknown = js.native
}

object PingResponse {
  @scala.inline
  def apply(
    alive: Boolean,
    avg: String,
    host: String,
    max: String,
    min: String,
    output: String,
    stddev: String,
    time: Double | unknown
  ): PingResponse = {
    val __obj = js.Dynamic.literal(alive = alive.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingResponse]
  }
  @scala.inline
  implicit class PingResponseOps[Self <: PingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStddev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stddev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double | unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumeric_host(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric_host: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric_host")(js.undefined)
        ret
    }
  }
  
}

