package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRuleActions extends js.Object {
  // A list of categories to be assigned to a message.
  var assignCategories: js.UndefOr[js.Array[String]] = js.native
  // The ID of a folder that a message is to be copied to.
  var copyToFolder: js.UndefOr[String] = js.native
  // Indicates whether a message should be moved to the Deleted Items folder.
  var delete: js.UndefOr[Boolean] = js.native
  // The email addresses of the recipients to which a message should be forwarded as an attachment.
  var forwardAsAttachmentTo: js.UndefOr[js.Array[Recipient]] = js.native
  // The email addresses of the recipients to which a message should be forwarded.
  var forwardTo: js.UndefOr[js.Array[Recipient]] = js.native
  // Indicates whether a message should be marked as read.
  var markAsRead: js.UndefOr[Boolean] = js.native
  // Sets the importance of the message, which can be: low, normal, high.
  var markImportance: js.UndefOr[Importance] = js.native
  // The ID of the folder that a message will be moved to.
  var moveToFolder: js.UndefOr[String] = js.native
  // Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder.
  var permanentDelete: js.UndefOr[Boolean] = js.native
  // The email addresses to which a message should be redirected.
  var redirectTo: js.UndefOr[js.Array[Recipient]] = js.native
  // Indicates whether subsequent rules should be evaluated.
  var stopProcessingRules: js.UndefOr[Boolean] = js.native
}

object MessageRuleActions {
  @scala.inline
  def apply(): MessageRuleActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRuleActions]
  }
  @scala.inline
  implicit class MessageRuleActionsOps[Self <: MessageRuleActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyToFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyToFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyToFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyToFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardAsAttachmentTo(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardAsAttachmentTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardAsAttachmentTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardAsAttachmentTo")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardTo(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardTo")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkAsRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkAsRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsRead")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkImportance(value: Importance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markImportance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkImportance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markImportance")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveToFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveToFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withPermanentDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanentDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermanentDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanentDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectTo(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.undefined)
        ret
    }
    @scala.inline
    def withStopProcessingRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopProcessingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopProcessingRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopProcessingRules")(js.undefined)
        ret
    }
  }
  
}

