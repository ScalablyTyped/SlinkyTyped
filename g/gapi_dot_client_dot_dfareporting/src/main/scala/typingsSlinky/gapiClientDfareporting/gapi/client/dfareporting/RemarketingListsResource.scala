package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import typingsSlinky.gapiClientDfareporting.anon.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: Fields): Request[RemarketingList] = js.native
  /** Inserts a new remarketing list. */
  def insert(request: Key): Request[RemarketingList] = js.native
  /** Retrieves a list of remarketing lists, possibly filtered. This method supports paging. */
  def list(request: SortOrder): Request[RemarketingListsListResponse] = js.native
  /** Updates an existing remarketing list. This method supports patch semantics. */
  def patch(request: Fields): Request[RemarketingList] = js.native
  /** Updates an existing remarketing list. */
  def update(request: Key): Request[RemarketingList] = js.native
}

object RemarketingListsResource {
  @scala.inline
  def apply(
    get: Fields => Request[RemarketingList],
    insert: Key => Request[RemarketingList],
    list: SortOrder => Request[RemarketingListsListResponse],
    patch: Fields => Request[RemarketingList],
    update: Key => Request[RemarketingList]
  ): RemarketingListsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RemarketingListsResource]
  }
  @scala.inline
  implicit class RemarketingListsResourceOps[Self <: RemarketingListsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Fields => Request[RemarketingList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[RemarketingList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: SortOrder => Request[RemarketingListsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[RemarketingList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[RemarketingList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

