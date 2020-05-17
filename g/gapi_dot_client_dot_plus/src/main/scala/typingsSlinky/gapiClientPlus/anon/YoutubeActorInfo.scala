package typingsSlinky.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YoutubeActorInfo extends js.Object {
  /** Actor info specific to YouTube clients. */
  var youtubeActorInfo: js.UndefOr[ChannelId] = js.native
}

object YoutubeActorInfo {
  @scala.inline
  def apply(): YoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YoutubeActorInfo]
  }
  @scala.inline
  implicit class YoutubeActorInfoOps[Self <: YoutubeActorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withYoutubeActorInfo(value: ChannelId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtubeActorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoutubeActorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtubeActorInfo")(js.undefined)
        ret
    }
  }
  
}

