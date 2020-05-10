package typingsSlinky.instagramPrivateApi.musicGenreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicGenreFeedResponsePageInfo extends js.Object {
  var auto_load_more_available: Boolean = js.native
  var more_available: Boolean = js.native
  var next_max_id: String = js.native
}

object MusicGenreFeedResponsePageInfo {
  @scala.inline
  def apply(auto_load_more_available: Boolean, more_available: Boolean, next_max_id: String): MusicGenreFeedResponsePageInfo = {
    val __obj = js.Dynamic.literal(auto_load_more_available = auto_load_more_available.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicGenreFeedResponsePageInfo]
  }
  @scala.inline
  implicit class MusicGenreFeedResponsePageInfoOps[Self <: MusicGenreFeedResponsePageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_load_more_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_load_more_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_max_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

