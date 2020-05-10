package typingsSlinky.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryHighlightsTrayResponseRootObject extends js.Object {
  var show_empty_state: Boolean = js.native
  var status: String = js.native
  var tray: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem] = js.native
  var tv_channel: HighlightsRepositoryHighlightsTrayResponseTvChannel = js.native
}

object HighlightsRepositoryHighlightsTrayResponseRootObject {
  @scala.inline
  def apply(
    show_empty_state: Boolean,
    status: String,
    tray: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem],
    tv_channel: HighlightsRepositoryHighlightsTrayResponseTvChannel
  ): HighlightsRepositoryHighlightsTrayResponseRootObject = {
    val __obj = js.Dynamic.literal(show_empty_state = show_empty_state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any], tv_channel = tv_channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseRootObject]
  }
  @scala.inline
  implicit class HighlightsRepositoryHighlightsTrayResponseRootObjectOps[Self <: HighlightsRepositoryHighlightsTrayResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShow_empty_state(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_empty_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTray(value: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTv_channel(value: HighlightsRepositoryHighlightsTrayResponseTvChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tv_channel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

