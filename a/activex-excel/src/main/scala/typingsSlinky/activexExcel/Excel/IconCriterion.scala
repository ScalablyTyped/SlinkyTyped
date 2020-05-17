package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconCriterion extends js.Object {
  @JSName("Excel.IconCriterion_typekey")
  var ExcelDotIconCriterion_typekey: IconCriterion = js.native
  var Icon: XlIcon = js.native
  val Index: Double = js.native
  var Operator: Double = js.native
  var Type: XlConditionValueTypes = js.native
  var Value: Double | String = js.native
}

object IconCriterion {
  @scala.inline
  def apply(
    ExcelDotIconCriterion_typekey: IconCriterion,
    Icon: XlIcon,
    Index: Double,
    Operator: Double,
    Type: XlConditionValueTypes,
    Value: Double | String
  ): IconCriterion = {
    val __obj = js.Dynamic.literal(Icon = Icon.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.IconCriterion_typekey")(ExcelDotIconCriterion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconCriterion]
  }
  @scala.inline
  implicit class IconCriterionOps[Self <: IconCriterion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcelDotIconCriterion_typekey(value: IconCriterion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.IconCriterion_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: XlIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: XlConditionValueTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

