package typingsSlinky.dineroJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExchangeRatesApiOptions extends js.Object {
  var endpoint: String | js.Promise[StringDictionary[_]] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var propertyPath: js.UndefOr[String] = js.native
  var roundingMode: js.UndefOr[RoundingMode] = js.native
}

object ExchangeRatesApiOptions {
  @scala.inline
  def apply(endpoint: String | js.Promise[StringDictionary[_]]): ExchangeRatesApiOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeRatesApiOptions]
  }
  @scala.inline
  implicit class ExchangeRatesApiOptionsOps[Self <: ExchangeRatesApiOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String | js.Promise[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundingMode(value: RoundingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingMode")(js.undefined)
        ret
    }
  }
  
}

