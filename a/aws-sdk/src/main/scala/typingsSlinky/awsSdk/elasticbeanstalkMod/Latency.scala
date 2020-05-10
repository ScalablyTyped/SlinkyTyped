package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Latency extends js.Object {
  /**
    * The average latency for the slowest 90 percent of requests over the last 10 seconds.
    */
  var P10: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 50 percent of requests over the last 10 seconds.
    */
  var P50: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 25 percent of requests over the last 10 seconds.
    */
  var P75: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 15 percent of requests over the last 10 seconds.
    */
  var P85: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 10 percent of requests over the last 10 seconds.
    */
  var P90: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 5 percent of requests over the last 10 seconds.
    */
  var P95: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 1 percent of requests over the last 10 seconds.
    */
  var P99: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
    */
  var P999: js.UndefOr[NullableDouble] = js.native
}

object Latency {
  @scala.inline
  def apply(): Latency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Latency]
  }
  @scala.inline
  implicit class LatencyOps[Self <: Latency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withP10(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP10: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P10")(js.undefined)
        ret
    }
    @scala.inline
    def withP50(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P50")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP50: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P50")(js.undefined)
        ret
    }
    @scala.inline
    def withP75(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P75")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP75: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P75")(js.undefined)
        ret
    }
    @scala.inline
    def withP85(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P85")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP85: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P85")(js.undefined)
        ret
    }
    @scala.inline
    def withP90(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P90")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP90: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P90")(js.undefined)
        ret
    }
    @scala.inline
    def withP95(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P95")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP95: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P95")(js.undefined)
        ret
    }
    @scala.inline
    def withP99(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P99")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP99: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P99")(js.undefined)
        ret
    }
    @scala.inline
    def withP999(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P999")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP999: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P999")(js.undefined)
        ret
    }
  }
  
}

