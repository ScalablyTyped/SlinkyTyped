package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.RemarketingListShare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingListSharesCollection extends js.Object {
  // Gets one remarketing list share by remarketing list ID.
  def get(profileId: String, remarketingListId: String): RemarketingListShare = js.native
  // Updates an existing remarketing list share. This method supports patch semantics.
  def patch(resource: RemarketingListShare, profileId: String, remarketingListId: String): RemarketingListShare = js.native
  // Updates an existing remarketing list share.
  def update(resource: RemarketingListShare, profileId: String): RemarketingListShare = js.native
}

object RemarketingListSharesCollection {
  @scala.inline
  def apply(
    get: (String, String) => RemarketingListShare,
    patch: (RemarketingListShare, String, String) => RemarketingListShare,
    update: (RemarketingListShare, String) => RemarketingListShare
  ): RemarketingListSharesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), patch = js.Any.fromFunction3(patch), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[RemarketingListSharesCollection]
  }
  @scala.inline
  implicit class RemarketingListSharesCollectionOps[Self <: RemarketingListSharesCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, String) => RemarketingListShare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPatch(value: (RemarketingListShare, String, String) => RemarketingListShare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (RemarketingListShare, String) => RemarketingListShare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

