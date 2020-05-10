package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ConditionalColorScaleCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ColorScaleConditionalFormat object, for use in `colorScaleConditionalFormat.set({ ... })`. */
@js.native
trait ColorScaleConditionalFormatUpdateData extends js.Object {
  /**
    *
    * The criteria of the color scale. Midpoint is optional when using a two point color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[ConditionalColorScaleCriteria] = js.native
}

object ColorScaleConditionalFormatUpdateData {
  @scala.inline
  def apply(): ColorScaleConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorScaleConditionalFormatUpdateData]
  }
  @scala.inline
  implicit class ColorScaleConditionalFormatUpdateDataOps[Self <: ColorScaleConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCriteria(value: ConditionalColorScaleCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(js.undefined)
        ret
    }
  }
  
}

