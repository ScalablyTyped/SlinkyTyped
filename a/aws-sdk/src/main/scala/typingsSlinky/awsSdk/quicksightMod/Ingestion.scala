package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ingestion extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typingsSlinky.awsSdk.quicksightMod.Arn = js.native
  /**
    * The time that this ingestion started.
    */
  var CreatedTime: js.Date = js.native
  /**
    * Error information for this ingestion.
    */
  var ErrorInfo: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ErrorInfo] = js.native
  /**
    * Ingestion ID.
    */
  var IngestionId: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.IngestionId] = js.native
  /**
    * The size of the data ingested, in bytes.
    */
  var IngestionSizeInBytes: js.UndefOr[long] = js.native
  /**
    * Ingestion status.
    */
  var IngestionStatus: typingsSlinky.awsSdk.quicksightMod.IngestionStatus = js.native
  /**
    * The time that this ingestion took, measured in seconds.
    */
  var IngestionTimeInSeconds: js.UndefOr[long] = js.native
  var QueueInfo: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.QueueInfo] = js.native
  /**
    * Event source for this ingestion.
    */
  var RequestSource: js.UndefOr[IngestionRequestSource] = js.native
  /**
    * Type of this ingestion.
    */
  var RequestType: js.UndefOr[IngestionRequestType] = js.native
  var RowInfo: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.RowInfo] = js.native
}

object Ingestion {
  @scala.inline
  def apply(Arn: Arn, CreatedTime: js.Date, IngestionStatus: IngestionStatus): Ingestion = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], IngestionStatus = IngestionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ingestion]
  }
  @scala.inline
  implicit class IngestionOps[Self <: Ingestion] (val x: Self) extends AnyVal {
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
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIngestionStatus(value: IngestionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorInfo(value: ErrorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withIngestionId(value: IngestionId): Self = {
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
    def withIngestionSizeInBytes(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestionSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestionSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestionSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withIngestionTimeInSeconds(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestionTimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestionTimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestionTimeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueInfo(value: QueueInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestSource(value: IngestionRequestSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestSource")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestType(value: IngestionRequestType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestType")(js.undefined)
        ret
    }
    @scala.inline
    def withRowInfo(value: RowInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowInfo")(js.undefined)
        ret
    }
  }
  
}

