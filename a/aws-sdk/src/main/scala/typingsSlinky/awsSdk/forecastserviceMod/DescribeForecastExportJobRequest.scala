package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeForecastExportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast export job.
    */
  var ForecastExportJobArn: Arn = js.native
}

object DescribeForecastExportJobRequest {
  @scala.inline
  def apply(ForecastExportJobArn: Arn): DescribeForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(ForecastExportJobArn = ForecastExportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeForecastExportJobRequest]
  }
  @scala.inline
  implicit class DescribeForecastExportJobRequestOps[Self <: DescribeForecastExportJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForecastExportJobArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastExportJobArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

