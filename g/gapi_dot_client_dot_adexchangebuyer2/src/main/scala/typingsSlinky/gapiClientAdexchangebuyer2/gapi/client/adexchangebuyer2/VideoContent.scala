package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoContent extends js.Object {
  /** The URL to fetch a video ad. */
  var videoUrl: js.UndefOr[String] = js.native
}

object VideoContent {
  @scala.inline
  def apply(): VideoContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContent]
  }
  @scala.inline
  implicit class VideoContentOps[Self <: VideoContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoUrl")(js.undefined)
        ret
    }
  }
  
}

