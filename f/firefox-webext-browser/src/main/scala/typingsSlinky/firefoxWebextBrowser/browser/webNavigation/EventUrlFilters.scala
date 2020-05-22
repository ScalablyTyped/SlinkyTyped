package typingsSlinky.firefoxWebextBrowser.browser.webNavigation

import typingsSlinky.firefoxWebextBrowser.browser.events.UrlFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventUrlFilters extends js.Object {
  var url: js.Array[UrlFilter]
}

object EventUrlFilters {
  @scala.inline
  def apply(url: js.Array[UrlFilter]): EventUrlFilters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventUrlFilters]
  }
}

