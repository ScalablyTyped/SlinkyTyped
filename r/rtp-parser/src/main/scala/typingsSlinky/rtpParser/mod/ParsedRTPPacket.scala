package typingsSlinky.rtpParser.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedRTPPacket extends js.Object {
  var csrc: js.Array[Double] = js.native
  var csrcCount: Double = js.native
  var extension: Double = js.native
  var marker: Double = js.native
  var padding: Double = js.native
  var payload: Buffer = js.native
  var payloadType: Double = js.native
  var sequenceNumber: Double = js.native
  var ssrc: Double = js.native
  var timestamp: Double = js.native
  var version: Double = js.native
}

object ParsedRTPPacket {
  @scala.inline
  def apply(
    csrc: js.Array[Double],
    csrcCount: Double,
    extension: Double,
    marker: Double,
    padding: Double,
    payload: Buffer,
    payloadType: Double,
    sequenceNumber: Double,
    ssrc: Double,
    timestamp: Double,
    version: Double
  ): ParsedRTPPacket = {
    val __obj = js.Dynamic.literal(csrc = csrc.asInstanceOf[js.Any], csrcCount = csrcCount.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedRTPPacket]
  }
  @scala.inline
  implicit class ParsedRTPPacketOps[Self <: ParsedRTPPacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsrc(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsrcCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csrcCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayloadType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsrc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
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

