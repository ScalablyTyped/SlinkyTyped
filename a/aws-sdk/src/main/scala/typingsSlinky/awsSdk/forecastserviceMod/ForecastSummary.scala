package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForecastSummary extends js.Object {
  /**
    * When the forecast creation task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group that provided the data used to train the predictor.
    */
  var DatasetGroupArn: js.UndefOr[String] = js.native
  /**
    * The ARN of the forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the forecast.
    */
  var ForecastName: js.UndefOr[Name] = js.native
  /**
    * Initially, the same as CreationTime (status is CREATE_PENDING). Updated when inference (creating the forecast) starts (status changed to CREATE_IN_PROGRESS), and when inference is complete (status changed to ACTIVE) or fails (status changed to CREATE_FAILED).
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The ARN of the predictor used to generate the forecast.
    */
  var PredictorArn: js.UndefOr[String] = js.native
  /**
    * The status of the forecast. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the forecast must be ACTIVE before you can query or export the forecast. 
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Status] = js.native
}

object ForecastSummary {
  @scala.inline
  def apply(): ForecastSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastSummary]
  }
  @scala.inline
  implicit class ForecastSummaryOps[Self <: ForecastSummary] (val x: Self) extends AnyVal {
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
    def withDatasetGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetGroupArn")(js.undefined)
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
    def withForecastName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastName")(js.undefined)
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
    def withMessage(value: ErrorMessage): Self = {
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
    def withPredictorArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorArn")(js.undefined)
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

