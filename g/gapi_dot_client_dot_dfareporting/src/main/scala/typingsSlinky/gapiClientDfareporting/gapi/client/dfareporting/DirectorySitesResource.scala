package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonAcceptsInStreamVideoPlacements
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySitesResource extends js.Object {
  /** Gets one directory site by ID. */
  def get(request: AnonFields): Request_[DirectorySite] = js.native
  /** Inserts a new directory site. */
  def insert(request: AnonKey): Request_[DirectorySite] = js.native
  /** Retrieves a list of directory sites, possibly filtered. This method supports paging. */
  def list(request: AnonAcceptsInStreamVideoPlacements): Request_[DirectorySitesListResponse] = js.native
}

object DirectorySitesResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[DirectorySite],
    insert: AnonKey => Request_[DirectorySite],
    list: AnonAcceptsInStreamVideoPlacements => Request_[DirectorySitesListResponse]
  ): DirectorySitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DirectorySitesResource]
  }
  @scala.inline
  implicit class DirectorySitesResourceOps[Self <: DirectorySitesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[DirectorySite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[DirectorySite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAcceptsInStreamVideoPlacements => Request_[DirectorySitesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

