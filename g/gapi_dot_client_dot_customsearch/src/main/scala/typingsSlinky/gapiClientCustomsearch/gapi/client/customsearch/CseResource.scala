package typingsSlinky.gapiClientCustomsearch.gapi.client.customsearch

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCustomsearch.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CseResource extends js.Object {
  /** Returns metadata about the search performed, metadata about the custom search engine used for the search, and the search results. */
  def list(request: AnonAlt): Request_[Search] = js.native
}

object CseResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[Search]): CseResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CseResource]
  }
  @scala.inline
  implicit class CseResourceOps[Self <: CseResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonAlt => Request_[Search]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

