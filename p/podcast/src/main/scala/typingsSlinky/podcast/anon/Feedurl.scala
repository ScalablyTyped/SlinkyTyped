package typingsSlinky.podcast.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feedurl extends js.Object {
  var feed_url: String = js.native
}

object Feedurl {
  @scala.inline
  def apply(feed_url: String): Feedurl = {
    val __obj = js.Dynamic.literal(feed_url = feed_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feedurl]
  }
  @scala.inline
  implicit class FeedurlOps[Self <: Feedurl] (val x: Self) extends AnyVal {
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

