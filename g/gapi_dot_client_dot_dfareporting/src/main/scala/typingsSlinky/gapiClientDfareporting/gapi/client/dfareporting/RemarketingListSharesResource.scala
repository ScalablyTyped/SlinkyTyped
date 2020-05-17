package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Key
import typingsSlinky.gapiClientDfareporting.anon.RemarketingListId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingListSharesResource extends js.Object {
  /** Gets one remarketing list share by remarketing list ID. */
  def get(request: RemarketingListId): Request[RemarketingListShare] = js.native
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: RemarketingListId): Request[RemarketingListShare] = js.native
  /** Updates an existing remarketing list share. */
  def update(request: Key): Request[RemarketingListShare] = js.native
}

object RemarketingListSharesResource {
  @scala.inline
  def apply(
    get: RemarketingListId => Request[RemarketingListShare],
    patch: RemarketingListId => Request[RemarketingListShare],
    update: Key => Request[RemarketingListShare]
  ): RemarketingListSharesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RemarketingListSharesResource]
  }
  @scala.inline
  implicit class RemarketingListSharesResourceOps[Self <: RemarketingListSharesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: RemarketingListId => Request[RemarketingListShare]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: RemarketingListId => Request[RemarketingListShare]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[RemarketingListShare]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

