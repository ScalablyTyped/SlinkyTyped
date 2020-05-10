package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactFolder extends Entity {
  // The collection of child folders in the folder. Navigation property. Read-only. Nullable.
  var childFolders: js.UndefOr[js.Array[ContactFolder]] = js.native
  // The contacts in the folder. Navigation property. Read-only. Nullable.
  var contacts: js.UndefOr[js.Array[Contact]] = js.native
  // The folder's display name.
  var displayName: js.UndefOr[String] = js.native
  // The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  // The ID of the folder's parent folder.
  var parentFolderId: js.UndefOr[String] = js.native
  // The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
}

object ContactFolder {
  @scala.inline
  def apply(): ContactFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFolder]
  }
  @scala.inline
  implicit class ContactFolderOps[Self <: ContactFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildFolders(value: js.Array[ContactFolder]): Self = {
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
    def withContacts(value: js.Array[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(js.undefined)
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
  }
  
}

