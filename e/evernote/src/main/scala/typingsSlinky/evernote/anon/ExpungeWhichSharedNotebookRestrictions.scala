package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.SharedNotebookInstanceRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpungeWhichSharedNotebookRestrictions extends js.Object {
  var expungeWhichSharedNotebookRestrictions: js.UndefOr[SharedNotebookInstanceRestrictions] = js.native
  var noCreateNotes: js.UndefOr[Boolean] = js.native
  var noCreateSharedNotebooks: js.UndefOr[Boolean] = js.native
  var noCreateTags: js.UndefOr[Boolean] = js.native
  var noEmailNotes: js.UndefOr[Boolean] = js.native
  var noExpungeNotebook: js.UndefOr[Boolean] = js.native
  var noExpungeNotes: js.UndefOr[Boolean] = js.native
  var noExpungeTags: js.UndefOr[Boolean] = js.native
  var noPublishToBusinessLibrary: js.UndefOr[Boolean] = js.native
  var noPublishToPublic: js.UndefOr[Boolean] = js.native
  var noReadNotes: js.UndefOr[Boolean] = js.native
  var noRenameNotebook: js.UndefOr[Boolean] = js.native
  var noSendMessageToRecipients: js.UndefOr[Boolean] = js.native
  var noSetDefaultNotebook: js.UndefOr[Boolean] = js.native
  var noSetNotebookStack: js.UndefOr[Boolean] = js.native
  var noSetParentTag: js.UndefOr[Boolean] = js.native
  var noShareNotes: js.UndefOr[Boolean] = js.native
  var noShareNotesWithBusiness: js.UndefOr[Boolean] = js.native
  var noUpdateNotebook: js.UndefOr[Boolean] = js.native
  var noUpdateNotes: js.UndefOr[Boolean] = js.native
  var noUpdateTags: js.UndefOr[Boolean] = js.native
  var updateWhichSharedNotebookRestrictions: js.UndefOr[SharedNotebookInstanceRestrictions] = js.native
}

object ExpungeWhichSharedNotebookRestrictions {
  @scala.inline
  def apply(): ExpungeWhichSharedNotebookRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpungeWhichSharedNotebookRestrictions]
  }
  @scala.inline
  implicit class ExpungeWhichSharedNotebookRestrictionsOps[Self <: ExpungeWhichSharedNotebookRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpungeWhichSharedNotebookRestrictions(value: SharedNotebookInstanceRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungeWhichSharedNotebookRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpungeWhichSharedNotebookRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungeWhichSharedNotebookRestrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCreateNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCreateNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCreateNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCreateNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCreateSharedNotebooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCreateSharedNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCreateSharedNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCreateSharedNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCreateTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCreateTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCreateTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCreateTags")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEmailNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmailNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEmailNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmailNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withNoExpungeNotebook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExpungeNotebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoExpungeNotebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExpungeNotebook")(js.undefined)
        ret
    }
    @scala.inline
    def withNoExpungeNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExpungeNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoExpungeNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExpungeNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withNoExpungeTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExpungeTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoExpungeTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExpungeTags")(js.undefined)
        ret
    }
    @scala.inline
    def withNoPublishToBusinessLibrary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPublishToBusinessLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoPublishToBusinessLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPublishToBusinessLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withNoPublishToPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPublishToPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoPublishToPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPublishToPublic")(js.undefined)
        ret
    }
    @scala.inline
    def withNoReadNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noReadNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoReadNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noReadNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRenameNotebook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRenameNotebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRenameNotebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRenameNotebook")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSendMessageToRecipients(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSendMessageToRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSendMessageToRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSendMessageToRecipients")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSetDefaultNotebook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetDefaultNotebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSetDefaultNotebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetDefaultNotebook")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSetNotebookStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetNotebookStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSetNotebookStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetNotebookStack")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSetParentTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetParentTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSetParentTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetParentTag")(js.undefined)
        ret
    }
    @scala.inline
    def withNoShareNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noShareNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoShareNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noShareNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withNoShareNotesWithBusiness(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noShareNotesWithBusiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoShareNotesWithBusiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noShareNotesWithBusiness")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUpdateNotebook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateNotebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUpdateNotebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateNotebook")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUpdateNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUpdateNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUpdateTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUpdateTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateTags")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateWhichSharedNotebookRestrictions(value: SharedNotebookInstanceRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWhichSharedNotebookRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateWhichSharedNotebookRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWhichSharedNotebookRestrictions")(js.undefined)
        ret
    }
  }
  
}

