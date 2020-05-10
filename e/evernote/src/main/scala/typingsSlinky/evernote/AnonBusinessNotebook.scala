package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.BusinessNotebook
import typingsSlinky.evernote.mod.Types.Guid
import typingsSlinky.evernote.mod.Types.NotebookRecipientSettings
import typingsSlinky.evernote.mod.Types.NotebookRestrictions
import typingsSlinky.evernote.mod.Types.Publishing
import typingsSlinky.evernote.mod.Types.SharedNotebook
import typingsSlinky.evernote.mod.Types.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBusinessNotebook extends js.Object {
  var businessNotebook: js.UndefOr[BusinessNotebook] = js.native
  var contact: js.UndefOr[User] = js.native
  var defaultNotebook: js.UndefOr[Boolean] = js.native
  var guid: js.UndefOr[Guid] = js.native
  var name: js.UndefOr[String] = js.native
  var published: js.UndefOr[Boolean] = js.native
  var publishing: js.UndefOr[Publishing] = js.native
  var recipientSettings: js.UndefOr[NotebookRecipientSettings] = js.native
  var restrictions: js.UndefOr[NotebookRestrictions] = js.native
  var serviceCreated: js.UndefOr[Double] = js.native
  var serviceUpdated: js.UndefOr[Double] = js.native
  var sharedNotebookIds: js.UndefOr[js.Array[Double]] = js.native
  var sharedNotebooks: js.UndefOr[js.Array[SharedNotebook]] = js.native
  var stack: js.UndefOr[String] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
}

object AnonBusinessNotebook {
  @scala.inline
  def apply(): AnonBusinessNotebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBusinessNotebook]
  }
  @scala.inline
  implicit class AnonBusinessNotebookOps[Self <: AnonBusinessNotebook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusinessNotebook(value: BusinessNotebook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessNotebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessNotebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessNotebook")(js.undefined)
        ret
    }
    @scala.inline
    def withContact(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNotebook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNotebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNotebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNotebook")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishing(value: Publishing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishing")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientSettings(value: NotebookRecipientSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictions(value: NotebookRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedNotebookIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedNotebookIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedNotebookIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedNotebookIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedNotebooks(value: js.Array[SharedNotebook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateSequenceNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSequenceNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSequenceNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSequenceNum")(js.undefined)
        ret
    }
  }
  
}

