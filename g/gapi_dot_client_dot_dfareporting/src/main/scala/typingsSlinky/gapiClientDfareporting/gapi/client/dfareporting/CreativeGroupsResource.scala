package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.GroupNumber
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeGroupsResource extends js.Object {
  /** Gets one creative group by ID. */
  def get(request: Fields): Request[CreativeGroup] = js.native
  /** Inserts a new creative group. */
  def insert(request: Key): Request[CreativeGroup] = js.native
  /** Retrieves a list of creative groups, possibly filtered. This method supports paging. */
  def list(request: GroupNumber): Request[CreativeGroupsListResponse] = js.native
  /** Updates an existing creative group. This method supports patch semantics. */
  def patch(request: Fields): Request[CreativeGroup] = js.native
  /** Updates an existing creative group. */
  def update(request: Key): Request[CreativeGroup] = js.native
}

object CreativeGroupsResource {
  @scala.inline
  def apply(
    get: Fields => Request[CreativeGroup],
    insert: Key => Request[CreativeGroup],
    list: GroupNumber => Request[CreativeGroupsListResponse],
    patch: Fields => Request[CreativeGroup],
    update: Key => Request[CreativeGroup]
  ): CreativeGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeGroupsResource]
  }
  @scala.inline
  implicit class CreativeGroupsResourceOps[Self <: CreativeGroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Fields => Request[CreativeGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[CreativeGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: GroupNumber => Request[CreativeGroupsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[CreativeGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[CreativeGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

