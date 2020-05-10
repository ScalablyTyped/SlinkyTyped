package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigTypeData extends js.Object {
  /**
    * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
    */
  var antennaDownlinkConfig: js.UndefOr[AntennaDownlinkConfig] = js.native
  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
    */
  var antennaDownlinkDemodDecodeConfig: js.UndefOr[AntennaDownlinkDemodDecodeConfig] = js.native
  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
    */
  var antennaUplinkConfig: js.UndefOr[AntennaUplinkConfig] = js.native
  /**
    * Information about the dataflow endpoint Config.
    */
  var dataflowEndpointConfig: js.UndefOr[DataflowEndpointConfig] = js.native
  /**
    * Object that determines whether tracking should be used during a contact executed with this Config in the mission profile. 
    */
  var trackingConfig: js.UndefOr[TrackingConfig] = js.native
  /**
    * Information about an uplink echo Config. Parameters from the AntennaUplinkConfig, corresponding to the specified AntennaUplinkConfigArn, are used when this UplinkEchoConfig is used in a contact.
    */
  var uplinkEchoConfig: js.UndefOr[UplinkEchoConfig] = js.native
}

object ConfigTypeData {
  @scala.inline
  def apply(): ConfigTypeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigTypeData]
  }
  @scala.inline
  implicit class ConfigTypeDataOps[Self <: ConfigTypeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntennaDownlinkConfig(value: AntennaDownlinkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antennaDownlinkConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntennaDownlinkConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antennaDownlinkConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAntennaDownlinkDemodDecodeConfig(value: AntennaDownlinkDemodDecodeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antennaDownlinkDemodDecodeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntennaDownlinkDemodDecodeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antennaDownlinkDemodDecodeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAntennaUplinkConfig(value: AntennaUplinkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antennaUplinkConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntennaUplinkConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antennaUplinkConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDataflowEndpointConfig(value: DataflowEndpointConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataflowEndpointConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingConfig(value: TrackingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUplinkEchoConfig(value: UplinkEchoConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkEchoConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUplinkEchoConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkEchoConfig")(js.undefined)
        ret
    }
  }
  
}

