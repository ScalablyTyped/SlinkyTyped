package typingsSlinky.reconnectingwebsocket.mod

import typingsSlinky.std.BinaryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Whether or not the WebSocket should attempt to connect immediately upon instantiation.
    * The socket can be manually opened or closed at any time using `open()` and `close()`.
    * @default `true`
    */
  var automaticOpen: js.UndefOr[Boolean] = js.native
  /**
    * The binary type, possible values `'blob'` or `'arraybuffer'`.
    * @default `'blob'`
    */
  var binaryType: js.UndefOr[BinaryType] = js.native
  /**
    * Whether this instance should log debug messages.
    * @default `false`
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of reconnection attempts to make. Unlimited if `null`.
    * @default `null`
    */
  var maxReconnectAttempts: js.UndefOr[Double | Null] = js.native
  /**
    * The maximum number of milliseconds to delay a reconnection attempt.
    * Accepts integer.
    * @default `30000`
    */
  var maxReconnectInterval: js.UndefOr[Double] = js.native
  /**
    * The rate of increase of the reconnect delay. Allows reconnect attempts to back off when problems persist.
    * Accepts integer or float.
    * @default `1.5`
    */
  var reconnectDecay: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds to delay before attempting to reconnect.
    * Accepts integer.
    * @default `1000`
    */
  var reconnectInterval: js.UndefOr[Double] = js.native
  /**
    * The maximum time in milliseconds to wait for a connection to succeed before closing and retrying.
    * Accepts integer.
    * @default `2000`
    */
  var timeoutInterval: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryType(value: BinaryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryType")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReconnectAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnectAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReconnectAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnectAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReconnectAttemptsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnectAttempts")(null)
        ret
    }
    @scala.inline
    def withMaxReconnectInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnectInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReconnectInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnectInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectDecay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectDecay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectDecay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectDecay")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInterval")(js.undefined)
        ret
    }
  }
  
}

