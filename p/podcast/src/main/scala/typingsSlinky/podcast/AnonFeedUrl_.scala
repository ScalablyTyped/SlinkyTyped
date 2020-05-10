package typingsSlinky.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeedUrl_ extends js.Object {
  var feedUrl: String = js.native
}

object AnonFeedUrl_ {
  @scala.inline
  def apply(feedUrl: String): AnonFeedUrl_ = {
    val __obj = js.Dynamic.literal(feedUrl = feedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeedUrl_]
  }
  @scala.inline
  implicit class AnonFeedUrl_Ops[Self <: AnonFeedUrl_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

