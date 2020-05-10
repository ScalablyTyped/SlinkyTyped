package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeForecastRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast.
    */
  var ForecastArn: Arn = js.native
}

object DescribeForecastRequest {
  @scala.inline
  def apply(ForecastArn: Arn): DescribeForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastArn = ForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeForecastRequest]
  }
  @scala.inline
  implicit class DescribeForecastRequestOps[Self <: DescribeForecastRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForecastArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

