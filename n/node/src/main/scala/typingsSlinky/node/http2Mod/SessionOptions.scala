package typingsSlinky.node.http2Mod

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionOptions extends js.Object {
  var createConnection: js.UndefOr[js.Function2[/* authority */ URL_, /* option */ this.type, Duplex]] = js.native
  var maxDeflateDynamicTableSize: js.UndefOr[Double] = js.native
  var maxHeaderListPairs: js.UndefOr[Double] = js.native
  var maxOutstandingPings: js.UndefOr[Double] = js.native
  var maxSendHeaderBlockLength: js.UndefOr[Double] = js.native
  var maxSessionMemory: js.UndefOr[Double] = js.native
  var paddingStrategy: js.UndefOr[Double] = js.native
  var peerMaxConcurrentStreams: js.UndefOr[Double] = js.native
  var selectPadding: js.UndefOr[js.Function2[/* frameLen */ Double, /* maxFrameLen */ Double, Double]] = js.native
  var settings: js.UndefOr[Settings] = js.native
}

object SessionOptions {
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateConnection(value: (/* authority */ URL_, SessionOptions) => Duplex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createConnection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeflateDynamicTableSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeflateDynamicTableSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeflateDynamicTableSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeflateDynamicTableSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeaderListPairs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderListPairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeaderListPairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderListPairs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOutstandingPings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOutstandingPings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOutstandingPings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOutstandingPings")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSendHeaderBlockLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSendHeaderBlockLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSendHeaderBlockLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSendHeaderBlockLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSessionMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSessionMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSessionMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSessionMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingStrategy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerMaxConcurrentStreams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerMaxConcurrentStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerMaxConcurrentStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerMaxConcurrentStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectPadding(value: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPadding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
  }
  
}

