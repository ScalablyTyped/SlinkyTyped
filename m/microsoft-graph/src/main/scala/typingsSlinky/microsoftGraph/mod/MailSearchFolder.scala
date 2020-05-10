package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailSearchFolder extends MailFolder {
  // The OData query to filter the messages.
  var filterQuery: js.UndefOr[String] = js.native
  /**
    * Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be
    * done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a
    * shallow search of only each of the folders explicitly specified in sourceFolderIds.
    */
  var includeNestedFolders: js.UndefOr[Boolean] = js.native
  // Indicates whether a search folder is editable using REST APIs.
  var isSupported: js.UndefOr[Boolean] = js.native
  // The mailbox folders that should be mined.
  var sourceFolderIds: js.UndefOr[js.Array[String]] = js.native
}

object MailSearchFolder {
  @scala.inline
  def apply(): MailSearchFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailSearchFolder]
  }
  @scala.inline
  implicit class MailSearchFolderOps[Self <: MailSearchFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNestedFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNestedFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNestedFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNestedFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFolderIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFolderIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFolderIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFolderIds")(js.undefined)
        ret
    }
  }
  
}

