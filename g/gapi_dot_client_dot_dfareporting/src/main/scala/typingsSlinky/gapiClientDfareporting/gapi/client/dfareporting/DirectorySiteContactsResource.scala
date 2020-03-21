package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonDirectorySiteIds
import typingsSlinky.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteContactsResource extends js.Object {
  /** Gets one directory site contact by ID. */
  def get(request: AnonFields): Request_[DirectorySiteContact]
  /** Retrieves a list of directory site contacts, possibly filtered. This method supports paging. */
  def list(request: AnonDirectorySiteIds): Request_[DirectorySiteContactsListResponse]
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
}

