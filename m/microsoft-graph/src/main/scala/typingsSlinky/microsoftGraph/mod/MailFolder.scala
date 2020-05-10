package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailFolder extends Entity {
  // The number of immediate child mailFolders in the current mailFolder.
  var childFolderCount: js.UndefOr[Double] = js.native
  // The collection of child folders in the mailFolder.
  var childFolders: js.UndefOr[js.Array[MailFolder]] = js.native
  // The mailFolder's display name.
  var displayName: js.UndefOr[String] = js.native
  // The collection of rules that apply to the user's Inbox folder.
  var messageRules: js.UndefOr[js.Array[MessageRule]] = js.native
  // The collection of messages in the mailFolder.
  var messages: js.UndefOr[js.Array[Message]] = js.native
  // The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  // The unique identifier for the mailFolder's parent mailFolder.
  var parentFolderId: js.UndefOr[String] = js.native
  // The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
  // The number of items in the mailFolder.
  var totalItemCount: js.UndefOr[Double] = js.native
  // The number of items in the mailFolder marked as unread.
  var unreadItemCount: js.UndefOr[Double] = js.native
}

object MailFolder {
  @scala.inline
  def apply(): MailFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailFolder]
  }
  @scala.inline
  implicit class MailFolderOps[Self <: MailFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildFolderCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childFolderCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildFolderCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childFolderCount")(js.undefined)
        ret
    }
    @scala.inline
    def withChildFolders(value: js.Array[MailFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageRules(value: js.Array[MessageRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageRules")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueExtendedProperties(value: js.Array[MultiValueLegacyExtendedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueExtendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueExtendedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withParentFolderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFolderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentFolderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFolderId")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleValueExtendedProperties(value: js.Array[SingleValueLegacyExtendedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValueExtendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleValueExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValueExtendedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnreadItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreadItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnreadItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreadItemCount")(js.undefined)
        ret
    }
  }
  
}

