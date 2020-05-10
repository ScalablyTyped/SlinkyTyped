package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsMediaFeedResponseStoryCtaItem extends js.Object {
  var links: js.Array[ReelsMediaFeedResponseLinksItem] = js.native
}

object ReelsMediaFeedResponseStoryCtaItem {
  @scala.inline
  def apply(links: js.Array[ReelsMediaFeedResponseLinksItem]): ReelsMediaFeedResponseStoryCtaItem = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseStoryCtaItem]
  }
  @scala.inline
  implicit class ReelsMediaFeedResponseStoryCtaItemOps[Self <: ReelsMediaFeedResponseStoryCtaItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: js.Array[ReelsMediaFeedResponseLinksItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

