package typingsSlinky.gapiPagespeedonline.gapi.client.pagespeedonline

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiPagespeedonline.AnonFields
import typingsSlinky.gapiPagespeedonline.GoogleApiPageSpeedOnlineResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pagespeedapi extends js.Object {
  /**
    * Runs Page Speed analysis on the page at the specified URL, and returns a Page Speed score, a list of suggestions to make that page faster, and other information.
    */
  def runpagespeed(`object`: AnonFields): HttpRequest[GoogleApiPageSpeedOnlineResource] = js.native
}

object pagespeedapi {
  @scala.inline
  def apply(runpagespeed: AnonFields => HttpRequest[GoogleApiPageSpeedOnlineResource]): pagespeedapi = {
    val __obj = js.Dynamic.literal(runpagespeed = js.Any.fromFunction1(runpagespeed))
    __obj.asInstanceOf[pagespeedapi]
  }
  @scala.inline
  implicit class pagespeedapiOps[Self <: pagespeedapi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRunpagespeed(value: AnonFields => HttpRequest[GoogleApiPageSpeedOnlineResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runpagespeed")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

