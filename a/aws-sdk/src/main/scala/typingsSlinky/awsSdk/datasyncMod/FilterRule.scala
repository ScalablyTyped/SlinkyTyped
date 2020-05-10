package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterRule extends js.Object {
  /**
    * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
    */
  var FilterType: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.FilterType] = js.native
  /**
    * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|" (that is, a pipe), for example: /folder1|/folder2   
    */
  var Value: js.UndefOr[FilterValue] = js.native
}

object FilterRule {
  @scala.inline
  def apply(): FilterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterRule]
  }
  @scala.inline
  implicit class FilterRuleOps[Self <: FilterRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterType(value: FilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterType")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: FilterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

