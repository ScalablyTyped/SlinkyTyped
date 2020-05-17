package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.AcceptsInStreamVideoPlacements
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySitesResource extends js.Object {
  /** Gets one directory site by ID. */
  def get(request: Fields): Request[DirectorySite] = js.native
  /** Inserts a new directory site. */
  def insert(request: Key): Request[DirectorySite] = js.native
  /** Retrieves a list of directory sites, possibly filtered. This method supports paging. */
  def list(request: AcceptsInStreamVideoPlacements): Request[DirectorySitesListResponse] = js.native
}

object DirectorySitesResource {
  @scala.inline
  def apply(
    get: Fields => Request[DirectorySite],
    insert: Key => Request[DirectorySite],
    list: AcceptsInStreamVideoPlacements => Request[DirectorySitesListResponse]
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
    def withGet(value: Fields => Request[DirectorySite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[DirectorySite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AcceptsInStreamVideoPlacements => Request[DirectorySitesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

