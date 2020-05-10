package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonYoutubeActorInfo extends js.Object {
  var youtubeActorInfo: js.UndefOr[AnonChannelId] = js.native
}

object AnonYoutubeActorInfo {
  @scala.inline
  def apply(): AnonYoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonYoutubeActorInfo]
  }
  @scala.inline
  implicit class AnonYoutubeActorInfoOps[Self <: AnonYoutubeActorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withYoutubeActorInfo(value: AnonChannelId): Self = {
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

