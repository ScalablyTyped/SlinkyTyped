package typingsSlinky.googleFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait feedResult extends js.Object {
  var error: js.UndefOr[feedError] = js.native
  var feed: feedJSON = js.native
  var xmlDocument: js.UndefOr[String] = js.native
}

object feedResult {
  @scala.inline
  def apply(feed: feedJSON): feedResult = {
    val __obj = js.Dynamic.literal(feed = feed.asInstanceOf[js.Any])
    __obj.asInstanceOf[feedResult]
  }
  @scala.inline
  implicit class feedResultOps[Self <: feedResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeed(value: feedJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: feedError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlDocument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlDocument")(js.undefined)
        ret
    }
  }
  
}

