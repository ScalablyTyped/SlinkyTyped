package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContactName extends js.Object {
  var contactName: js.UndefOr[String] = js.native
  var guid: js.UndefOr[Guid] = js.native
  var hasSharedNotebook: js.UndefOr[Boolean] = js.native
  var joinedUserCount: js.UndefOr[Double] = js.native
  var notebookDisplayName: js.UndefOr[String] = js.native
}

object AnonContactName {
  @scala.inline
  def apply(): AnonContactName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonContactName]
  }
  @scala.inline
  implicit class AnonContactNameOps[Self <: AnonContactName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactName")(js.undefined)
        ret
    }
    @scala.inline
    def withGuid(value: Guid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSharedNotebook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSharedNotebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSharedNotebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSharedNotebook")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinedUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinedUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinedUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinedUserCount")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookDisplayName")(js.undefined)
        ret
    }
  }
  
}

