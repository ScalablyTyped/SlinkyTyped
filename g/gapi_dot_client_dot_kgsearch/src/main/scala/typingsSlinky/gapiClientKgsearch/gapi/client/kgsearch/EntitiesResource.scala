package typingsSlinky.gapiClientKgsearch.gapi.client.kgsearch

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientKgsearch.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitiesResource extends js.Object {
  /**
    * Searches Knowledge Graph for entities that match the constraints.
    * A list of matched entities will be returned in response, which will be in
    * JSON-LD format and compatible with http://schema.org
    */
  def search(request: AnonAccesstoken): Request_[SearchResponse] = js.native
}

object EntitiesResource {
  @scala.inline
  def apply(search: AnonAccesstoken => Request_[SearchResponse]): EntitiesResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[EntitiesResource]
  }
  @scala.inline
  implicit class EntitiesResourceOps[Self <: EntitiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearch(value: AnonAccesstoken => Request_[SearchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

