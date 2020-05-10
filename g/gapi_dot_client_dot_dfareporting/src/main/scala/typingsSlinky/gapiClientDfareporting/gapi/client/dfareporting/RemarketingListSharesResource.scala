package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonKey
import typingsSlinky.gapiClientDfareporting.AnonRemarketingListId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingListSharesResource extends js.Object {
  /** Gets one remarketing list share by remarketing list ID. */
  def get(request: AnonRemarketingListId): Request_[RemarketingListShare] = js.native
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: AnonRemarketingListId): Request_[RemarketingListShare] = js.native
  /** Updates an existing remarketing list share. */
  def update(request: AnonKey): Request_[RemarketingListShare] = js.native
}

object RemarketingListSharesResource {
  @scala.inline
  def apply(
    get: AnonRemarketingListId => Request_[RemarketingListShare],
    patch: AnonRemarketingListId => Request_[RemarketingListShare],
    update: AnonKey => Request_[RemarketingListShare]
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
    def withGet(value: AnonRemarketingListId => Request_[RemarketingListShare]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonRemarketingListId => Request_[RemarketingListShare]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[RemarketingListShare]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

