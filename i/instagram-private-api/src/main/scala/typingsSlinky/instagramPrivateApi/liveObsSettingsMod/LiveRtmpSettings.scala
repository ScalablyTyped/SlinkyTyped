package typingsSlinky.instagramPrivateApi.liveObsSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveRtmpSettings extends js.Object {
  var stream_key: String = js.native
  var stream_url: String = js.native
}

object LiveRtmpSettings {
  @scala.inline
  def apply(stream_key: String, stream_url: String): LiveRtmpSettings = {
    val __obj = js.Dynamic.literal(stream_key = stream_key.asInstanceOf[js.Any], stream_url = stream_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveRtmpSettings]
  }
  @scala.inline
  implicit class LiveRtmpSettingsOps[Self <: LiveRtmpSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStream_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

