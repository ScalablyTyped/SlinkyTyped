package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationReferenceDataSourceResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application is updated.
    */
  var ApplicationVersionId: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * Describes reference data sources configured for the application. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescriptions] = js.native
}

object AddApplicationReferenceDataSourceResponse {
  @scala.inline
  def apply(): AddApplicationReferenceDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationReferenceDataSourceResponse]
  }
  @scala.inline
  implicit class AddApplicationReferenceDataSourceResponseOps[Self <: AddApplicationReferenceDataSourceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationARN")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationVersionId(value: ApplicationVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceDataSourceDescriptions(value: ReferenceDataSourceDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceDataSourceDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceDataSourceDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceDataSourceDescriptions")(js.undefined)
        ret
    }
  }
  
}

