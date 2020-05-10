package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelStatistics extends js.Object {
  /** The number of comments for the channel. */
  var commentCount: js.UndefOr[String] = js.native
  /** Whether or not the number of subscribers is shown for this user. */
  var hiddenSubscriberCount: js.UndefOr[Boolean] = js.native
  /** The number of subscribers that the channel has. */
  var subscriberCount: js.UndefOr[String] = js.native
  /** The number of videos uploaded to the channel. */
  var videoCount: js.UndefOr[String] = js.native
  /** The number of times the channel has been viewed. */
  var viewCount: js.UndefOr[String] = js.native
}

object ChannelStatistics {
  @scala.inline
  def apply(): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStatistics]
  }
  @scala.inline
  implicit class ChannelStatisticsOps[Self <: ChannelStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenSubscriberCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenSubscriberCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenSubscriberCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenSubscriberCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriberCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriberCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberCount")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCount")(js.undefined)
        ret
    }
    @scala.inline
    def withViewCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewCount")(js.undefined)
        ret
    }
  }
  
}

