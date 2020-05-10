package typingsSlinky.nodeBrowserHistory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserHistory extends js.Object {
  var browser: String = js.native
  var title: String = js.native
  var url: String = js.native
  var utc_time: Double = js.native
}

object BrowserHistory {
  @scala.inline
  def apply(browser: String, title: String, url: String, utc_time: Double): BrowserHistory = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], utc_time = utc_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserHistory]
  }
  @scala.inline
  implicit class BrowserHistoryOps[Self <: BrowserHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtc_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc_time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

