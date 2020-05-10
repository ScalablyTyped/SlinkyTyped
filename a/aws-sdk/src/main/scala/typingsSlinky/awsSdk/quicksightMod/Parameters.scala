package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  /**
    * DateTime parameters.
    */
  var DateTimeParameters: js.UndefOr[DateTimeParameterList] = js.native
  /**
    * Decimal parameters.
    */
  var DecimalParameters: js.UndefOr[DecimalParameterList] = js.native
  /**
    * Integer parameters.
    */
  var IntegerParameters: js.UndefOr[IntegerParameterList] = js.native
  /**
    * String parameters.
    */
  var StringParameters: js.UndefOr[StringParameterList] = js.native
}

object Parameters {
  @scala.inline
  def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTimeParameters(value: DateTimeParameterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTimeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTimeParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalParameters(value: DecimalParameterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecimalParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecimalParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerParameters(value: IntegerParameterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStringParameters(value: StringParameterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringParameters")(js.undefined)
        ret
    }
  }
  
}

