package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonOnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelBannersResource extends js.Object {
  /**
    * Uploads a channel banner image to YouTube. This method represents the first two steps in a three-step process to update the banner image for a channel:
    *
    * - Call the channelBanners.insert method to upload the binary image data to YouTube. The image must have a 16:9 aspect ratio and be at least 2120x1192
    * pixels.
    * - Extract the url property's value from the response that the API returns for step 1.
    * - Call the channels.update method to update the channel's branding settings. Set the brandingSettings.image.bannerExternalUrl property's value to the
    * URL obtained in step 2.
    */
  def insert(request: AnonOnBehalfOfContentOwner): Request_[ChannelBannerResource] = js.native
}

object ChannelBannersResource {
  @scala.inline
  def apply(insert: AnonOnBehalfOfContentOwner => Request_[ChannelBannerResource]): ChannelBannersResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[ChannelBannersResource]
  }
  @scala.inline
  implicit class ChannelBannersResourceOps[Self <: ChannelBannersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: AnonOnBehalfOfContentOwner => Request_[ChannelBannerResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

