package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFindingsRequest extends js.Object {
  /**
    * A collection of attributes that specify which findings you want to update.
    */
  var Filters: AwsSecurityFindingFilters = js.native
  /**
    * The updated note for the finding.
    */
  var Note: js.UndefOr[NoteUpdate] = js.native
  /**
    * The updated record state for the finding.
    */
  var RecordState: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.RecordState] = js.native
}

object UpdateFindingsRequest {
  @scala.inline
  def apply(Filters: AwsSecurityFindingFilters): UpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsRequest]
  }
  @scala.inline
  implicit class UpdateFindingsRequestOps[Self <: UpdateFindingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: AwsSecurityFindingFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: NoteUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Note")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordState(value: RecordState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordState")(js.undefined)
        ret
    }
  }
  
}

