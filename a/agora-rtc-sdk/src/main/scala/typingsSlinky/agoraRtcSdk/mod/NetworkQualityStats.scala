package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Statistics of the network quality.
  *
  * After joining the channel, the SDK triggers the `"network-quality"` callback once every two seconds and provides the network quality ratings in this interface.
  */
@js.native
trait NetworkQualityStats extends js.Object {
  /**
    * Downlink network quality rating of the user in terms of packet loss rate, average RTT, and jitter of the downlink network.
    *
    *  - "0": The network quality is unknown.
    *  - "1": The network quality is excellent.
    *  - "2": The network quality is quite good, but the bitrate may be slightly lower than excellent.
    *  - "3": Users can feel the communication slightly impaired.
    *  - "4": Users can communicate only not very smoothly.
    *  - "5": The network is so bad that users can hardly communicate.
    *  - "6": The network is down and users cannot communicate at all.
    */
  val downlinkNetworkQuality: js.UndefOr[String] = js.native
  /**
    * Uplink network quality rating of the user in terms of the transmission bitrate, packet loss rate, average RTT (Round-Trip Time) and jitter of the uplink network.
    *
    *  - "0": The network quality is unknown.
    *  - "1": The network quality is excellent.
    *  - "2": The network quality is quite good, but the bitrate may be slightly lower than excellent.
    *  - "3": Users can feel the communication slightly impaired.
    *  - "4": Users can communicate only not very smoothly.
    *  - "5": The network is so bad that users can hardly communicate.
    *  - "6": The network is disconnected and users cannot communicate at all.
    */
  val uplinkNetworkQuality: js.UndefOr[String] = js.native
}

object NetworkQualityStats {
  @scala.inline
  def apply(): NetworkQualityStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkQualityStats]
  }
  @scala.inline
  implicit class NetworkQualityStatsOps[Self <: NetworkQualityStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownlinkNetworkQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlinkNetworkQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownlinkNetworkQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlinkNetworkQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withUplinkNetworkQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkNetworkQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUplinkNetworkQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkNetworkQuality")(js.undefined)
        ret
    }
  }
  
}

