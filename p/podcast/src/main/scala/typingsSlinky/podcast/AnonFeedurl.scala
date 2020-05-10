package typingsSlinky.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeedurl extends js.Object {
  var feed_url: String = js.native
}

object AnonFeedurl {
  @scala.inline
  def apply(feed_url: String): AnonFeedurl = {
    val __obj = js.Dynamic.literal(feed_url = feed_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeedurl]
  }
  @scala.inline
  implicit class AnonFeedurlOps[Self <: AnonFeedurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeed_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

