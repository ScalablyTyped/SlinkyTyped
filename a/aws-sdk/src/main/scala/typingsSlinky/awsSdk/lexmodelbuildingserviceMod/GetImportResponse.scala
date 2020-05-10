package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImportResponse extends js.Object {
  /**
    * A timestamp for the date and time that the import job was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.native
  /**
    * A string that describes why an import job failed to complete.
    */
  var failureReason: js.UndefOr[StringList] = js.native
  /**
    * The identifier for the specific import job.
    */
  var importId: js.UndefOr[String] = js.native
  /**
    * The status of the import job. If the status is FAILED, you can get the reason for the failure from the failureReason field.
    */
  var importStatus: js.UndefOr[ImportStatus] = js.native
  /**
    * The action taken when there was a conflict between an existing resource and a resource in the import file.
    */
  var mergeStrategy: js.UndefOr[MergeStrategy] = js.native
  /**
    * The name given to the import job.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The type of resource imported.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object GetImportResponse {
  @scala.inline
  def apply(): GetImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImportResponse]
  }
  @scala.inline
  implicit class GetImportResponseOps[Self <: GetImportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withImportId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importId")(js.undefined)
        ret
    }
    @scala.inline
    def withImportStatus(value: ImportStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeStrategy(value: MergeStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
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
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
  }
  
}

