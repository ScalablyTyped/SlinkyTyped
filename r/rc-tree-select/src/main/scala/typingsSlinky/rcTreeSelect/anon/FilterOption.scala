package typingsSlinky.rcTreeSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOption extends js.Object {
  var filterOption: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any) = js.native
  var optionFilterProp: String = js.native
}

object FilterOption {
  @scala.inline
  def apply(
    filterOption: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any),
    optionFilterProp: String
  ): FilterOption = {
    val __obj = js.Dynamic.literal(filterOption = filterOption.asInstanceOf[js.Any], optionFilterProp = optionFilterProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOption]
  }
  @scala.inline
  implicit class FilterOptionOps[Self <: FilterOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterOption(
      value: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionFilterProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionFilterProp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

