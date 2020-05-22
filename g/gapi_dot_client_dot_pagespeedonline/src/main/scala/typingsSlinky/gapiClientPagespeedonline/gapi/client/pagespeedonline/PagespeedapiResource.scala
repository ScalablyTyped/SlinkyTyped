package typingsSlinky.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPagespeedonline.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagespeedapiResource extends js.Object {
  /**
    * Runs PageSpeed analysis on the page at the specified URL, and returns PageSpeed scores, a list of suggestions to make that page faster, and other
    * information.
    */
  def runpagespeed(request: Alt): Request[Result]
}

object PagespeedapiResource {
  @scala.inline
  def apply(runpagespeed: Alt => Request[Result]): PagespeedapiResource = {
    val __obj = js.Dynamic.literal(runpagespeed = js.Any.fromFunction1(runpagespeed))
    __obj.asInstanceOf[PagespeedapiResource]
  }
}

