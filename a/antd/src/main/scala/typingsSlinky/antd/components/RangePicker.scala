package typingsSlinky.antd.components

import typingsSlinky.antd.antdStrings.date
import typingsSlinky.antd.antdStrings.time
import typingsSlinky.moment.mod.Moment
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RangePicker {
  object RangePickerBaseProps {
    @JSImport("antd/lib/date-picker", "default.RangePicker")
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerBaseProps[Moment]): SharedBuilder_RangePickerProps1198066462 = new SharedBuilder_RangePickerProps1198066462(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(picker: Exclude[PickerMode, date | time]): SharedBuilder_RangePickerProps1198066462 = {
        val __props = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
        new SharedBuilder_RangePickerProps1198066462(js.Array(this.component, __props.asInstanceOf[typingsSlinky.antd.generatePickerMod.RangePickerBaseProps[Moment]]))
    }
  }
  
  object RangePickerDateProps {
    @JSImport("antd/lib/date-picker", "default.RangePicker")
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerDateProps[Moment]): SharedBuilder_RangePickerProps1198066462 = new SharedBuilder_RangePickerProps1198066462(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: RangePickerDateProps.type): SharedBuilder_RangePickerProps1198066462 = new SharedBuilder_RangePickerProps1198066462(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object RangePickerTimeProps {
    @JSImport("antd/lib/date-picker", "default.RangePicker")
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerTimeProps[Moment]): SharedBuilder_RangePickerProps1198066462 = new SharedBuilder_RangePickerProps1198066462(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(picker: time): SharedBuilder_RangePickerProps1198066462 = {
        val __props = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
        new SharedBuilder_RangePickerProps1198066462(js.Array(this.component, __props.asInstanceOf[typingsSlinky.antd.generatePickerMod.RangePickerTimeProps[Moment]]))
    }
  }
  
}

