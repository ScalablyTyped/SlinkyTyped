package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `iterativeCalculation.toJSON()`. */
@js.native
trait IterativeCalculationData extends js.Object {
  /**
    *
    * True if Excel will use iteration to resolve circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the maximum amount of change between each iteration as Excel resolves circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxChange: js.UndefOr[Double] = js.native
  /**
    *
    * Returns or sets the maximum number of iterations that Excel can use to resolve a circular reference.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxIteration: js.UndefOr[Double] = js.native
}

object IterativeCalculationData {
  @scala.inline
  def apply(): IterativeCalculationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterativeCalculationData]
  }
  @scala.inline
  implicit class IterativeCalculationDataOps[Self <: IterativeCalculationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChange")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIteration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIteration")(js.undefined)
        ret
    }
  }
  
}

