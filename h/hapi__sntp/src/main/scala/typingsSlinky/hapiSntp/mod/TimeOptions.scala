package typingsSlinky.hapiSntp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeOptions extends js.Object {
  var d: Double = js.native
  var isValid: Boolean = js.native
  var leapIndicator: String = js.native
  var mode: String = js.native
  var originateTimestamp: Double = js.native
  var pollInterval: Double = js.native
  var precision: Double = js.native
  var receiveTimestamp: Double = js.native
  var receivedLocally: Double = js.native
  var referenceId: String = js.native
  var referenceTimestamp: Double = js.native
  var rootDelay: Double = js.native
  var rootDispersion: Double = js.native
  var stratum: String = js.native
  var t: Double = js.native
  var transmitTimestamp: Double = js.native
  var version: Double = js.native
}

object TimeOptions {
  @scala.inline
  def apply(
    d: Double,
    isValid: Boolean,
    leapIndicator: String,
    mode: String,
    originateTimestamp: Double,
    pollInterval: Double,
    precision: Double,
    receiveTimestamp: Double,
    receivedLocally: Double,
    referenceId: String,
    referenceTimestamp: Double,
    rootDelay: Double,
    rootDispersion: Double,
    stratum: String,
    t: Double,
    transmitTimestamp: Double,
    version: Double
  ): TimeOptions = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], leapIndicator = leapIndicator.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], originateTimestamp = originateTimestamp.asInstanceOf[js.Any], pollInterval = pollInterval.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], receiveTimestamp = receiveTimestamp.asInstanceOf[js.Any], receivedLocally = receivedLocally.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], referenceTimestamp = referenceTimestamp.asInstanceOf[js.Any], rootDelay = rootDelay.asInstanceOf[js.Any], rootDispersion = rootDispersion.asInstanceOf[js.Any], stratum = stratum.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], transmitTimestamp = transmitTimestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeOptions]
  }
  @scala.inline
  implicit class TimeOptionsOps[Self <: TimeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeapIndicator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leapIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginateTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originateTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPollInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiveTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivedLocally(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedLocally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDispersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDispersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStratum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stratum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransmitTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmitTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

