package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonDirectorySiteIds
import typingsSlinky.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySiteContactsResource extends js.Object {
  /** Gets one directory site contact by ID. */
  def get(request: AnonFields): Request_[DirectorySiteContact] = js.native
  /** Retrieves a list of directory site contacts, possibly filtered. This method supports paging. */
  def list(request: AnonDirectorySiteIds): Request_[DirectorySiteContactsListResponse] = js.native
}

object DirectorySiteContactsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[DirectorySiteContact],
    list: AnonDirectorySiteIds => Request_[DirectorySiteContactsListResponse]
  ): DirectorySiteContactsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DirectorySiteContactsResource]
  }
  @scala.inline
  implicit class DirectorySiteContactsResourceOps[Self <: DirectorySiteContactsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[DirectorySiteContact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonDirectorySiteIds => Request_[DirectorySiteContactsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

