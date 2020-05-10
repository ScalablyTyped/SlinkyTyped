package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsInputSettings extends js.Object {
  /**
    * When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen, otherwise the highest bandwidth stream in the m3u8 will be chosen.  The bitrate is specified in bits per second, as in an HLS manifest.
    */
  var Bandwidth: js.UndefOr[integerMin0] = js.native
  /**
    * When specified, reading of the HLS input will begin this many buffer segments from the end (most recently written segment).  When not specified, the HLS input will begin with the first segment specified in the m3u8.
    */
  var BufferSegments: js.UndefOr[integerMin0] = js.native
  /**
    * The number of consecutive times that attempts to read a manifest or segment must fail before the input is considered unavailable.
    */
  var Retries: js.UndefOr[integerMin0] = js.native
  /**
    * The number of seconds between retries when an attempt to read a manifest or segment fails.
    */
  var RetryInterval: js.UndefOr[integerMin0] = js.native
}

object HlsInputSettings {
  @scala.inline
  def apply(): HlsInputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsInputSettings]
  }
  @scala.inline
  implicit class HlsInputSettingsOps[Self <: HlsInputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidth(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferSegments(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retries")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryInterval(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryInterval")(js.undefined)
        ret
    }
  }
  
}

