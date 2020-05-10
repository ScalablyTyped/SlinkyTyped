package typingsSlinky.chrome.chrome.serial

import typingsSlinky.chrome.chromeStrings.eight
import typingsSlinky.chrome.chromeStrings.even
import typingsSlinky.chrome.chromeStrings.no
import typingsSlinky.chrome.chromeStrings.odd
import typingsSlinky.chrome.chromeStrings.one
import typingsSlinky.chrome.chromeStrings.seven
import typingsSlinky.chrome.chromeStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionInfo extends js.Object {
  /** Optional. See ConnectionOptions.bitrate.
    * This field may be omitted or inaccurate if a non-standard bitrate is in use, or if an error occurred while querying the underlying device. */
  var bitrate: js.UndefOr[Double] = js.native
  /** See ConnectionOptions.bufferSize */
  var bufferSize: Double = js.native
  /** The id of the serial port connection. */
  var connectionId: js.UndefOr[Double] = js.native
  /** Optional. Flag indicating whether or not to enable RTS/CTS hardware flow control. Defaults to false. */
  var ctsFlowControl: js.UndefOr[Boolean] = js.native
  /** Optional. See ConnectionOptions.dataBits. This field may be omitted if an error occurred while querying the underlying device. */
  var dataBits: js.UndefOr[seven | eight] = js.native
  /** See ConnectionOptions.name */
  var name: String = js.native
  /** Optional. See ConnectionOptions.parityBit. This field may be omitted if an error occurred while querying the underlying device. */
  var parityBit: js.UndefOr[no | odd | even] = js.native
  /** Flag indicating whether the connection is blocked from firing onReceive events. */
  var paused: Boolean = js.native
  /** See ConnectionOptions.persistent */
  var peristent: Boolean = js.native
  /** See ConnectionOptions.receiveTimeout */
  var receiveTimeout: js.UndefOr[Double] = js.native
  /** See ConnectionOptions.sendTimeout */
  var sendTimeout: js.UndefOr[Double] = js.native
  /** Optional. See ConnectionOptions.stopBits. This field may be omitted if an error occurred while querying the underlying device. */
  var stopBits: js.UndefOr[one | two] = js.native
}

object ConnectionInfo {
  @scala.inline
  def apply(bufferSize: Double, name: String, paused: Boolean, peristent: Boolean): ConnectionInfo = {
    val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], peristent = peristent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
  @scala.inline
  implicit class ConnectionInfoOps[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeristent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peristent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withCtsFlowControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctsFlowControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtsFlowControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctsFlowControl")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBits(value: seven | eight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBits")(js.undefined)
        ret
    }
    @scala.inline
    def withParityBit(value: no | odd | even): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parityBit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParityBit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parityBit")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSendTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStopBits(value: one | two): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopBits")(js.undefined)
        ret
    }
  }
  
}

