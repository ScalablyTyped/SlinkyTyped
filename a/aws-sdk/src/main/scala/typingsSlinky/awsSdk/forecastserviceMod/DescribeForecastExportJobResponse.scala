package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeForecastExportJobResponse extends js.Object {
  /**
    * When the forecast export job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
    */
  var Destination: js.UndefOr[DataDestination] = js.native
  /**
    * The Amazon Resource Name (ARN) of the exported forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the forecast export job.
    */
  var ForecastExportJobArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the forecast export job.
    */
  var ForecastExportJobName: js.UndefOr[Name] = js.native
  /**
    * When the last successful export job finished.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Message] = js.native
  /**
    * The status of the forecast export job. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the forecast export job must be ACTIVE before you can access the forecast in your S3 bucket. 
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Status] = js.native
}

object DescribeForecastExportJobResponse {
  @scala.inline
  def apply(): DescribeForecastExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeForecastExportJobResponse]
  }
  @scala.inline
  implicit class DescribeForecastExportJobResponseOps[Self <: DescribeForecastExportJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: DataDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(js.undefined)
        ret
    }
    @scala.inline
    def withForecastArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastArn")(js.undefined)
        ret
    }
    @scala.inline
    def withForecastExportJobArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastExportJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastExportJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastExportJobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withForecastExportJobName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastExportJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastExportJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastExportJobName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModificationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModificationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModificationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
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

