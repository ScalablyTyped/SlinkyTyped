package typingsSlinky.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPagespeedonline.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagespeedapiResource extends js.Object {
  /**
    * Runs PageSpeed analysis on the page at the specified URL, and returns PageSpeed scores, a list of suggestions to make that page faster, and other
    * information.
    */
  def runpagespeed(request: AnonAlt): Request_[Result] = js.native
}

object PagespeedapiResource {
  @scala.inline
  def apply(runpagespeed: AnonAlt => Request_[Result]): PagespeedapiResource = {
    val __obj = js.Dynamic.literal(runpagespeed = js.Any.fromFunction1(runpagespeed))
    __obj.asInstanceOf[PagespeedapiResource]
  }
  @scala.inline
  implicit class PagespeedapiResourceOps[Self <: PagespeedapiResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRunpagespeed(value: AnonAlt => Request_[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runpagespeed")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

