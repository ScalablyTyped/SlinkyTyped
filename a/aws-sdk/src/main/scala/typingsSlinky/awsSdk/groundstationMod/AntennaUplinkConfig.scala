package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntennaUplinkConfig extends js.Object {
  /**
    * Information about the uplink spectral Config.
    */
  var spectrumConfig: UplinkSpectrumConfig = js.native
  /**
    * EIRP of the target.
    */
  var targetEirp: Eirp = js.native
}

object AntennaUplinkConfig {
  @scala.inline
  def apply(spectrumConfig: UplinkSpectrumConfig, targetEirp: Eirp): AntennaUplinkConfig = {
    val __obj = js.Dynamic.literal(spectrumConfig = spectrumConfig.asInstanceOf[js.Any], targetEirp = targetEirp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaUplinkConfig]
  }
  @scala.inline
  implicit class AntennaUplinkConfigOps[Self <: AntennaUplinkConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpectrumConfig(value: UplinkSpectrumConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectrumConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetEirp(value: Eirp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetEirp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

