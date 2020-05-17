package typingsSlinky.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BidProtocol extends js.Object {
  /**
    * The protocol that the bidder endpoint is using. OpenRTB protocols with prefix PROTOCOL_OPENRTB_PROTOBUF use proto buffer, otherwise use JSON.  Allowed
    * values:
    * - PROTOCOL_ADX
    * - PROTOCOL_OPENRTB_2_2
    * - PROTOCOL_OPENRTB_2_3
    * - PROTOCOL_OPENRTB_2_4
    * - PROTOCOL_OPENRTB_2_5
    * - PROTOCOL_OPENRTB_PROTOBUF_2_3
    * - PROTOCOL_OPENRTB_PROTOBUF_2_4
    * - PROTOCOL_OPENRTB_PROTOBUF_2_5
    */
  var bidProtocol: js.UndefOr[String] = js.native
  /** The maximum queries per second the Ad Exchange will send. */
  var maximumQps: js.UndefOr[Double] = js.native
  /**
    * The geographical region the Ad Exchange should send requests from. Only used by some quota systems, but always setting the value is recommended.
    * Allowed values:
    * - ASIA
    * - EUROPE
    * - US_EAST
    * - US_WEST
    */
  var region: js.UndefOr[String] = js.native
  /** The URL to which the Ad Exchange will send bid requests. */
  var url: js.UndefOr[String] = js.native
}

object BidProtocol {
  @scala.inline
  def apply(): BidProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BidProtocol]
  }
  @scala.inline
  implicit class BidProtocolOps[Self <: BidProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumQps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumQps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumQps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumQps")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

