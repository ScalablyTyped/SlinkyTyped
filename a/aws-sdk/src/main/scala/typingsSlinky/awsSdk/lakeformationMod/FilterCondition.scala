package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterCondition extends js.Object {
  /**
    * The comparison operator used in the filter condition.
    */
  var ComparisonOperator: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.ComparisonOperator] = js.native
  /**
    * The field to filter in the filter condition.
    */
  var Field: js.UndefOr[FieldNameString] = js.native
  /**
    * A string with values used in evaluating the filter condition.
    */
  var StringValueList: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.StringValueList] = js.native
}

object FilterCondition {
  @scala.inline
  def apply(): FilterCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCondition]
  }
  @scala.inline
  implicit class FilterConditionOps[Self <: FilterCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonOperator(value: ComparisonOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: FieldNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValueList(value: StringValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValueList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValueList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValueList")(js.undefined)
        ret
    }
  }
  
}

