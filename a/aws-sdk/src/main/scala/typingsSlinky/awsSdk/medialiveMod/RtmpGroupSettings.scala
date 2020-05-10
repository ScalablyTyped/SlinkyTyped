package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RtmpGroupSettings extends js.Object {
  /**
    * Authentication scheme to use when connecting with CDN
    */
  var AuthenticationScheme: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AuthenticationScheme] = js.native
  /**
    * Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does not accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration specified by cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the RTMP output will force a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to waitForServer, the RTMP output will wait up to 5 minutes to allow the origin server to begin accepting data again.
    */
  var CacheFullBehavior: js.UndefOr[RtmpCacheFullBehavior] = js.native
  /**
    * Cache length, in seconds, is used to calculate buffer size.
    */
  var CacheLength: js.UndefOr[integerMin30] = js.native
  /**
    * Controls the types of data that passes to onCaptionInfo outputs.  If set to 'all' then 608 and 708 carried DTVCC data will be passed.  If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608 data from both fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1 video will be passed.
    */
  var CaptionData: js.UndefOr[RtmpCaptionData] = js.native
  /**
    * Controls the behavior of this RTMP group if input becomes unavailable.
  - emitOutput: Emit a slate until input returns.
  - pauseOutput: Stop transmitting data until input returns. This does not close the underlying RTMP connection.
    */
  var InputLossAction: js.UndefOr[InputLossActionForRtmpOut] = js.native
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0] = js.native
}

object RtmpGroupSettings {
  @scala.inline
  def apply(): RtmpGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RtmpGroupSettings]
  }
  @scala.inline
  implicit class RtmpGroupSettingsOps[Self <: RtmpGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationScheme(value: AuthenticationScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheFullBehavior(value: RtmpCacheFullBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheFullBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheFullBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheFullBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheLength(value: integerMin30): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheLength")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionData(value: RtmpCaptionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionData")(js.undefined)
        ret
    }
    @scala.inline
    def withInputLossAction(value: InputLossActionForRtmpOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputLossAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossAction")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartDelay(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartDelay")(js.undefined)
        ret
    }
  }
  
}

