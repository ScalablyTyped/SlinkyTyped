package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UplinkSpectrumConfig extends js.Object {
  /**
    * Center frequency of an uplink spectral Config.
    */
  var centerFrequency: Frequency = js.native
  /**
    * Polarization of an uplink spectral Config.
    */
  var polarization: js.UndefOr[Polarization] = js.native
}

object UplinkSpectrumConfig {
  @scala.inline
  def apply(centerFrequency: Frequency): UplinkSpectrumConfig = {
    val __obj = js.Dynamic.literal(centerFrequency = centerFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[UplinkSpectrumConfig]
  }
  @scala.inline
  implicit class UplinkSpectrumConfigOps[Self <: UplinkSpectrumConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterFrequency(value: Frequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolarization(value: Polarization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polarization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolarization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polarization")(js.undefined)
        ret
    }
  }
  
}

