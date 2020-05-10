package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSetResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.native
  /**
    * The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
    */
  var IngestionArn: js.UndefOr[Arn] = js.native
  /**
    * The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
    */
  var IngestionId: js.UndefOr[ResourceId] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object CreateDataSetResponse {
  @scala.inline
  def apply(): CreateDataSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataSetResponse]
  }
  @scala.inline
  implicit class CreateDataSetResponseOps[Self <: CreateDataSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withIngestionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIngestionId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestionId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

