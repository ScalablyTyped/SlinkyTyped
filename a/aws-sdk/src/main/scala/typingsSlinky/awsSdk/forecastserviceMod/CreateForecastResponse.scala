package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateForecastResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.native
}

object CreateForecastResponse {
  @scala.inline
  def apply(): CreateForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateForecastResponse]
  }
  @scala.inline
  implicit class CreateForecastResponseOps[Self <: CreateForecastResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutForecastArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastArn")(js.undefined)
        ret
    }
  }
  
}

