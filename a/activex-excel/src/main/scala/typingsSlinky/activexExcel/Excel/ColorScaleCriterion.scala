package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorScaleCriterion extends js.Object {
  @JSName("Excel.ColorScaleCriterion_typekey")
  var ExcelDotColorScaleCriterion_typekey: ColorScaleCriterion = js.native
  val FormatColor: typingsSlinky.activexExcel.Excel.FormatColor = js.native
  val Index: Double = js.native
  var Type: XlConditionValueTypes = js.native
  var Value: js.Any = js.native
}

object ColorScaleCriterion {
  @scala.inline
  def apply(
    ExcelDotColorScaleCriterion_typekey: ColorScaleCriterion,
    FormatColor: FormatColor,
    Index: Double,
    Type: XlConditionValueTypes,
    Value: js.Any
  ): ColorScaleCriterion = {
    val __obj = js.Dynamic.literal(FormatColor = FormatColor.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ColorScaleCriterion_typekey")(ExcelDotColorScaleCriterion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScaleCriterion]
  }
  @scala.inline
  implicit class ColorScaleCriterionOps[Self <: ColorScaleCriterion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcelDotColorScaleCriterion_typekey(value: ColorScaleCriterion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.ColorScaleCriterion_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatColor(value: FormatColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormatColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: XlConditionValueTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

