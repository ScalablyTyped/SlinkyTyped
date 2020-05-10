package typingsSlinky.naudiodon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  var defaultHighInputLatency: Double = js.native
  var defaultHighOutputLatency: Double = js.native
  var defaultLowInputLatency: Double = js.native
  var defaultLowOutputLatency: Double = js.native
  var defaultSampleRate: Double = js.native
  var hostAPIName: Double = js.native
  var id: Double = js.native
  var maxInputChannels: Double = js.native
  var maxOutputChannels: Double = js.native
  var name: String = js.native
}

object Device {
  @scala.inline
  def apply(
    defaultHighInputLatency: Double,
    defaultHighOutputLatency: Double,
    defaultLowInputLatency: Double,
    defaultLowOutputLatency: Double,
    defaultSampleRate: Double,
    hostAPIName: Double,
    id: Double,
    maxInputChannels: Double,
    maxOutputChannels: Double,
    name: String
  ): Device = {
    val __obj = js.Dynamic.literal(defaultHighInputLatency = defaultHighInputLatency.asInstanceOf[js.Any], defaultHighOutputLatency = defaultHighOutputLatency.asInstanceOf[js.Any], defaultLowInputLatency = defaultLowInputLatency.asInstanceOf[js.Any], defaultLowOutputLatency = defaultLowOutputLatency.asInstanceOf[js.Any], defaultSampleRate = defaultSampleRate.asInstanceOf[js.Any], hostAPIName = hostAPIName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxInputChannels = maxInputChannels.asInstanceOf[js.Any], maxOutputChannels = maxOutputChannels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultHighInputLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighInputLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHighOutputLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighOutputLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultLowInputLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLowInputLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultLowOutputLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLowOutputLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostAPIName(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostAPIName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxInputChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInputChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxOutputChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOutputChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

