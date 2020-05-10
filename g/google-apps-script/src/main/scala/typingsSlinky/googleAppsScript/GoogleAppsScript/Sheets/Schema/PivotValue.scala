package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotValue extends js.Object {
  var calculatedDisplayType: js.UndefOr[String] = js.native
  var formula: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var sourceColumnOffset: js.UndefOr[Double] = js.native
  var summarizeFunction: js.UndefOr[String] = js.native
}

object PivotValue {
  @scala.inline
  def apply(): PivotValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotValue]
  }
  @scala.inline
  implicit class PivotValueOps[Self <: PivotValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculatedDisplayType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedDisplayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculatedDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedDisplayType")(js.undefined)
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceColumnOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumnOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceColumnOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumnOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSummarizeFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarizeFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummarizeFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarizeFunction")(js.undefined)
        ret
    }
  }
  
}

