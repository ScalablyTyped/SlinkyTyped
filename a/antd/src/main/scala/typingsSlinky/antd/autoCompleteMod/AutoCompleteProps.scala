package typingsSlinky.antd.autoCompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/select.InternalSelectProps<string>, 'inputIcon' | 'loading' | 'mode' | 'optionLabelProp' | 'labelInValue'> ]: antd.antd/lib/select.InternalSelectProps<string>[P]} */ trait AutoCompleteProps extends js.Object {
  var dataSource: js.UndefOr[js.Array[DataSourceItemType]] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSource(value: js.Array[DataSourceItemType]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
  }
  
}

