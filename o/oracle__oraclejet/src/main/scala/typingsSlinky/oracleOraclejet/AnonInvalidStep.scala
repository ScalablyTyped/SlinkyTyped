package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInvalidStep extends js.Object {
  var invalidStep: js.UndefOr[String] = js.native
  var maxMin: js.UndefOr[String] = js.native
  var noValue: js.UndefOr[String] = js.native
  var optionNum: js.UndefOr[String] = js.native
  var valueRange: js.UndefOr[String] = js.native
}

object AnonInvalidStep {
  @scala.inline
  def apply(): AnonInvalidStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInvalidStep]
  }
  @scala.inline
  implicit class AnonInvalidStepOps[Self <: AnonInvalidStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidStep")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMin")(js.undefined)
        ret
    }
    @scala.inline
    def withNoValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionNum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionNum")(js.undefined)
        ret
    }
    @scala.inline
    def withValueRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(js.undefined)
        ret
    }
  }
  
}

