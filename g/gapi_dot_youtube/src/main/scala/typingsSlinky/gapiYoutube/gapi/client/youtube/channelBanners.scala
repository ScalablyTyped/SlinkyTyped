package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.AnonOnBehalfOfContentOwner
import typingsSlinky.gapiYoutube.GoogleApiYouTubeChannelBannerResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait channelBanners extends js.Object {
  /**
    * Uploads a channel banner to YouTube.
    */
  def insert(`object`: AnonOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeChannelBannerResource] = js.native
}

object channelBanners {
  @scala.inline
  def apply(insert: AnonOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeChannelBannerResource]): channelBanners = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[channelBanners]
  }
  @scala.inline
  implicit class channelBannersOps[Self <: channelBanners] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: AnonOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeChannelBannerResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

