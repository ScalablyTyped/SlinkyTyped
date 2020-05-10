package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileLabels extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.native
  var modified: js.UndefOr[Boolean] = js.native
  var restricted: js.UndefOr[Boolean] = js.native
  var starred: js.UndefOr[Boolean] = js.native
  var trashed: js.UndefOr[Boolean] = js.native
  var viewed: js.UndefOr[Boolean] = js.native
}

object FileLabels {
  @scala.inline
  def apply(): FileLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileLabels]
  }
  @scala.inline
  implicit class FileLabelsOps[Self <: FileLabels] (val x: Self) extends AnyVal {
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
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(js.undefined)
        ret
    }
    @scala.inline
    def withRestricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestricted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(js.undefined)
        ret
    }
    @scala.inline
    def withStarred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(js.undefined)
        ret
    }
    @scala.inline
    def withTrashed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrashed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashed")(js.undefined)
        ret
    }
    @scala.inline
    def withViewed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewed")(js.undefined)
        ret
    }
  }
  
}

