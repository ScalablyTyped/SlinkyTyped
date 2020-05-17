package typingsSlinky.gapiDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hidden extends js.Object {
  var hidden: Boolean = js.native
  var modified: Boolean = js.native
  var restricted: Boolean = js.native
  var starred: Boolean = js.native
  var trashed: Boolean = js.native
  var viewed: Boolean = js.native
}

object Hidden {
  @scala.inline
  def apply(
    hidden: Boolean,
    modified: Boolean,
    restricted: Boolean,
    starred: Boolean,
    trashed: Boolean,
    viewed: Boolean
  ): Hidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], restricted = restricted.asInstanceOf[js.Any], starred = starred.asInstanceOf[js.Any], trashed = trashed.asInstanceOf[js.Any], viewed = viewed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hidden]
  }
  @scala.inline
  implicit class HiddenOps[Self <: Hidden] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrashed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

