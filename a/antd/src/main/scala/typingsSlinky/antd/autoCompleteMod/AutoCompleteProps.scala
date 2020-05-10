package typingsSlinky.antd.autoCompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/select.InternalSelectProps<string>, 'inputIcon' | 'loading' | 'mode' | 'optionLabelProp' | 'labelInValue'> ]: antd.antd/lib/select.InternalSelectProps<string>[P]} */ @js.native
trait AutoCompleteProps extends js.Object {
  var dataSource: js.UndefOr[js.Array[DataSourceItemType]] = js.native
}

object AutoCompleteProps {
  @scala.inline
  def apply(): AutoCompleteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteProps]
  }
  @scala.inline
  implicit class AutoCompletePropsOps[Self <: AutoCompleteProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Array[DataSourceItemType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
  }
  
}

