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
trait ConnectionOptions extends js.Object {
  /** Optional. The requested bitrate of the connection to be opened.
    * For compatibility with the widest range of hardware, this number should match one of commonly-available bitrates,
    * such as 110, 300, 1200, 2400, 4800, 9600, 14400, 19200, 38400, 57600, 115200.
    * There is no guarantee, of course, that the device connected to the serial port will support the requested bitrate, even if the port itself supports that bitrate.
    * 9600 will be passed by default. */
  var bitrate: js.UndefOr[Double] = js.native
  /** Optional. The size of the buffer used to receive data. The default value is 4096. */
  var bufferSize: js.UndefOr[Double] = js.native
  /** Optional. Flag indicating whether or not to enable RTS/CTS hardware flow control. Defaults to false. */
  var ctsFlowControl: js.UndefOr[Boolean] = js.native
  /** Optional. "eight" will be passed by default. */
  var dataBits: js.UndefOr[seven | eight] = js.native
  /** Optional. An application-defined string to associate with the connection. */
  var name: js.UndefOr[String] = js.native
  /** Optional. "no" will be passed by default. */
  var parityBit: js.UndefOr[no | odd | even] = js.native
  /** Optional. Flag indicating whether or not the connection should be left open when the application is suspended (see Manage App Lifecycle: https://developer.chrome.com/apps/app_lifecycle).
    *  The default value is "false." When the application is loaded, any serial connections previously opened with persistent=true can be fetched with getConnections. */
  var peristent: js.UndefOr[Boolean] = js.native
  /** Optional. The maximum amount of time (in milliseconds) to wait for new data before raising an onReceiveError event with a "timeout" error.
    * If zero, receive timeout errors will not be raised for the connection.
    * Defaults to 0. */
  var receiveTimeout: js.UndefOr[Double] = js.native
  /** Optional. The maximum amount of time (in milliseconds) to wait for a send operation to complete before calling the callback with a "timeout" error.
    * If zero, send timeout errors will not be triggered.
    * Defaults to 0. */
  var sendTimeout: js.UndefOr[Double] = js.native
  /** Optional. "one" will be passed by default. */
  var stopBits: js.UndefOr[one | two] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withPeristent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peristent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeristent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peristent")(js.undefined)
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

