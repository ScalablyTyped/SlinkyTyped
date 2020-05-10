package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ConditionalColorScaleCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `colorScaleConditionalFormat.toJSON()`. */
@js.native
trait ColorScaleConditionalFormatData extends js.Object {
  /**
    *
    * The criteria of the color scale. Midpoint is optional when using a two point color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[ConditionalColorScaleCriteria] = js.native
  /**
    *
    * If true the color scale will have three points (minimum, midpoint, maximum), otherwise it will have two (minimum, maximum).
    *
    * [Api set: ExcelApi 1.6]
    */
  var threeColorScale: js.UndefOr[Boolean] = js.native
}

object ColorScaleConditionalFormatData {
  @scala.inline
  def apply(): ColorScaleConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorScaleConditionalFormatData]
  }
  @scala.inline
  implicit class ColorScaleConditionalFormatDataOps[Self <: ColorScaleConditionalFormatData] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withThreeColorScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeColorScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreeColorScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeColorScale")(js.undefined)
        ret
    }
  }
  
}

