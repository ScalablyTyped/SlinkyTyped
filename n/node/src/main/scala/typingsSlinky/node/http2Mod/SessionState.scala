package typingsSlinky.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionState extends js.Object {
  var deflateDynamicTableSize: js.UndefOr[Double] = js.native
  var effectiveLocalWindowSize: js.UndefOr[Double] = js.native
  var effectiveRecvDataLength: js.UndefOr[Double] = js.native
  var inflateDynamicTableSize: js.UndefOr[Double] = js.native
  var lastProcStreamID: js.UndefOr[Double] = js.native
  var localWindowSize: js.UndefOr[Double] = js.native
  var nextStreamID: js.UndefOr[Double] = js.native
  var outboundQueueSize: js.UndefOr[Double] = js.native
  var remoteWindowSize: js.UndefOr[Double] = js.native
}

object SessionState {
  @scala.inline
  def apply(): SessionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionState]
  }
  @scala.inline
  implicit class SessionStateOps[Self <: SessionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeflateDynamicTableSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateDynamicTableSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeflateDynamicTableSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateDynamicTableSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveLocalWindowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveLocalWindowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveLocalWindowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveLocalWindowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveRecvDataLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveRecvDataLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveRecvDataLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveRecvDataLength")(js.undefined)
        ret
    }
    @scala.inline
    def withInflateDynamicTableSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflateDynamicTableSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInflateDynamicTableSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflateDynamicTableSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLastProcStreamID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastProcStreamID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastProcStreamID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastProcStreamID")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalWindowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localWindowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalWindowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localWindowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNextStreamID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextStreamID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextStreamID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextStreamID")(js.undefined)
        ret
    }
    @scala.inline
    def withOutboundQueueSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundQueueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutboundQueueSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundQueueSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteWindowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteWindowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteWindowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteWindowSize")(js.undefined)
        ret
    }
  }
  
}

