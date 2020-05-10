package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shared extends js.Object {
  // The identity of the owner of the shared item. Read-only.
  var owner: js.UndefOr[IdentitySet] = js.native
  // Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
  var scope: js.UndefOr[String] = js.native
  // The identity of the user who shared the item. Read-only.
  var sharedBy: js.UndefOr[IdentitySet] = js.native
  // The UTC date and time when the item was shared. Read-only.
  var sharedDateTime: js.UndefOr[String] = js.native
}

object Shared {
  @scala.inline
  def apply(): Shared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shared]
  }
  @scala.inline
  implicit class SharedOps[Self <: Shared] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedBy(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedDateTime")(js.undefined)
        ret
    }
  }
  
}

