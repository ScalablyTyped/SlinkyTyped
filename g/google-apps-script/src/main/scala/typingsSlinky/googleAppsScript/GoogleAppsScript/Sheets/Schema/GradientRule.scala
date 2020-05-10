package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientRule extends js.Object {
  var maxpoint: js.UndefOr[InterpolationPoint] = js.native
  var midpoint: js.UndefOr[InterpolationPoint] = js.native
  var minpoint: js.UndefOr[InterpolationPoint] = js.native
}

object GradientRule {
  @scala.inline
  def apply(): GradientRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientRule]
  }
  @scala.inline
  implicit class GradientRuleOps[Self <: GradientRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxpoint(value: InterpolationPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMidpoint(value: InterpolationPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMinpoint(value: InterpolationPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minpoint")(js.undefined)
        ret
    }
  }
  
}

