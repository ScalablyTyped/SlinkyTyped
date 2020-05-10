package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpectrumConfig extends js.Object {
  /**
    * Bandwidth of a spectral Config.
    */
  var bandwidth: FrequencyBandwidth = js.native
  /**
    * Center frequency of a spectral Config.
    */
  var centerFrequency: Frequency = js.native
  /**
    * Polarization of a spectral Config.
    */
  var polarization: js.UndefOr[Polarization] = js.native
}

object SpectrumConfig {
  @scala.inline
  def apply(bandwidth: FrequencyBandwidth, centerFrequency: Frequency): SpectrumConfig = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], centerFrequency = centerFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpectrumConfig]
  }
  @scala.inline
  implicit class SpectrumConfigOps[Self <: SpectrumConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidth(value: FrequencyBandwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
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

