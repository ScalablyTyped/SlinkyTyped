package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  /**
    * Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
    */
  var CommentMetadata: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.CommentMetadata] = js.native
  /**
    * The user who performed the action.
    */
  var Initiator: js.UndefOr[UserMetadata] = js.native
  /**
    * Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the subfolders and documents within the parent folder (the indirect activity).
    */
  var IsIndirectActivity: js.UndefOr[BooleanType] = js.native
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.native
  /**
    * The original parent of the resource. This is an optional field and is filled for move activities.
    */
  var OriginalParent: js.UndefOr[ResourceMetadata] = js.native
  /**
    * The list of users or groups impacted by this action. This is an optional field and is filled for the following sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED, FOLDER_UNSHARED.
    */
  var Participants: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.Participants] = js.native
  /**
    * The metadata of the resource involved in the user action.
    */
  var ResourceMetadata: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.ResourceMetadata] = js.native
  /**
    * The timestamp when the action was performed.
    */
  var TimeStamp: js.UndefOr[js.Date] = js.native
  /**
    * The activity type.
    */
  var Type: js.UndefOr[ActivityType] = js.native
}

object Activity {
  @scala.inline
  def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentMetadata(value: CommentMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommentMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommentMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withInitiator(value: UserMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiator")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIndirectActivity(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsIndirectActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIndirectActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsIndirectActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationId")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalParent(value: ResourceMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalParent")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipants(value: Participants): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Participants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Participants")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceMetadata(value: ResourceMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ActivityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

