package typingsSlinky.devextreme

import typingsSlinky.devextreme.mod._Global_.JQueryCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApplyValidationResults extends js.Object {
  var applyValidationResults: js.UndefOr[js.Function] = js.native
  var bypass: js.UndefOr[js.Function] = js.native
  var focus: js.UndefOr[js.Function] = js.native
  var getValue: js.UndefOr[js.Function] = js.native
  var reset: js.UndefOr[js.Function] = js.native
  var validationRequestsCallbacks: js.UndefOr[js.Array[js.Function] | JQueryCallback] = js.native
}

object AnonApplyValidationResults {
  @scala.inline
  def apply(): AnonApplyValidationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonApplyValidationResults]
  }
  @scala.inline
  implicit class AnonApplyValidationResultsOps[Self <: AnonApplyValidationResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyValidationResults(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyValidationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyValidationResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyValidationResults")(js.undefined)
        ret
    }
    @scala.inline
    def withBypass(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypass")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRequestsCallbacks(value: js.Array[js.Function] | JQueryCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRequestsCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRequestsCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRequestsCallbacks")(js.undefined)
        ret
    }
  }
  
}

