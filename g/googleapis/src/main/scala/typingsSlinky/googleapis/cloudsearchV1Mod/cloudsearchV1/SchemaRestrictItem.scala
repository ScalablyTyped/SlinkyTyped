package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information relevant only to a restrict entry. NextId: 12
  */
@js.native
trait SchemaRestrictItem extends js.Object {
  /**
    * LINT.ThenChange(//depot/google3/java/com/google/apps/search/quality/itemsuggest/utils/SubtypeRerankingUtils.java)
    */
  var driveFollowUpRestrict: js.UndefOr[SchemaDriveFollowUpRestrict] = js.native
  var driveLocationRestrict: js.UndefOr[SchemaDriveLocationRestrict] = js.native
  /**
    * LINT.IfChange Drive Types.
    */
  var driveMimeTypeRestrict: js.UndefOr[SchemaDriveMimeTypeRestrict] = js.native
  var driveTimeSpanRestrict: js.UndefOr[SchemaDriveTimeSpanRestrict] = js.native
  var gmailActionRestrict: js.UndefOr[SchemaGmailActionRestrict] = js.native
  var gmailAttachmentRestrict: js.UndefOr[SchemaGmailAttachmentRestrict] = js.native
  /**
    * Gmail Types.
    */
  var gmailFolderRestrict: js.UndefOr[SchemaGmailFolderRestrict] = js.native
  var gmailIntelligentRestrict: js.UndefOr[SchemaGmailIntelligentRestrict] = js.native
  var gmailTimeRestrict: js.UndefOr[SchemaGmailTimeRestrict] = js.native
  /**
    * The search restrict (e.g. &quot;after:2017-09-11
    * before:2017-09-12&quot;).
    */
  var searchOperator: js.UndefOr[String] = js.native
}

object SchemaRestrictItem {
  @scala.inline
  def apply(): SchemaRestrictItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestrictItem]
  }
  @scala.inline
  implicit class SchemaRestrictItemOps[Self <: SchemaRestrictItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveFollowUpRestrict(value: SchemaDriveFollowUpRestrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveFollowUpRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveFollowUpRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveFollowUpRestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveLocationRestrict(value: SchemaDriveLocationRestrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveLocationRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveLocationRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveLocationRestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveMimeTypeRestrict(value: SchemaDriveMimeTypeRestrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveMimeTypeRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveMimeTypeRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveMimeTypeRestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveTimeSpanRestrict(value: SchemaDriveTimeSpanRestrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveTimeSpanRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveTimeSpanRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveTimeSpanRestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withGmailActionRestrict(value: SchemaGmailActionRestrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailActionRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmailActionRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailActionRestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withGmailAttachmentRestrict(value: SchemaGmailAttachmentRestrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailAttachmentRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmailAttachmentRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailAttachmentRestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withGmailFolderRestrict(value: SchemaGmailFolderRestrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailFolderRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmailFolderRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailFolderRestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withGmailIntelligentRestrict(value: SchemaGmailIntelligentRestrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailIntelligentRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmailIntelligentRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailIntelligentRestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withGmailTimeRestrict(value: SchemaGmailTimeRestrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailTimeRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmailTimeRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailTimeRestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOperator")(js.undefined)
        ret
    }
  }
  
}

