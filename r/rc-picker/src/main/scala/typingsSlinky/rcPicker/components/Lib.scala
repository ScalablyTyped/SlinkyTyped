package typingsSlinky.rcPicker.components

import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.rcPicker.mod.default
import typingsSlinky.rcPicker.rcPickerStrings.date
import typingsSlinky.rcPicker.rcPickerStrings.time
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  object PickerBaseProps {
    @JSImport("rc-picker/lib", JSImport.Default)
    @js.native
    object component extends js.Object
    
    def withProps[DateType](p: typingsSlinky.rcPicker.pickerMod.PickerBaseProps[DateType]): SharedBuilder_PickerProps1272396767[default[DateType], DateType] = new SharedBuilder_PickerProps1272396767[default[DateType], DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): SharedBuilder_PickerProps1272396767[default[DateType], DateType] = {
        val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
        new SharedBuilder_PickerProps1272396767[default[DateType], DateType](js.Array(this.component, __props.asInstanceOf[typingsSlinky.rcPicker.pickerMod.PickerBaseProps[DateType]]))
    }
  }
  
  object PickerDateProps {
    @JSImport("rc-picker/lib", JSImport.Default)
    @js.native
    object component extends js.Object
    
    def withProps[DateType](p: typingsSlinky.rcPicker.pickerMod.PickerDateProps[DateType]): SharedBuilder_PickerProps1272396767[default[DateType], DateType] = new SharedBuilder_PickerProps1272396767[default[DateType], DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): SharedBuilder_PickerProps1272396767[default[DateType], DateType] = {
        val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
        new SharedBuilder_PickerProps1272396767[default[DateType], DateType](js.Array(this.component, __props.asInstanceOf[typingsSlinky.rcPicker.pickerMod.PickerDateProps[DateType]]))
    }
  }
  
  object PickerTimeProps {
    @JSImport("rc-picker/lib", JSImport.Default)
    @js.native
    object component extends js.Object
    
    def withProps[DateType](p: typingsSlinky.rcPicker.pickerMod.PickerTimeProps[DateType]): SharedBuilder_PickerProps1272396767[default[DateType], DateType] = new SharedBuilder_PickerProps1272396767[default[DateType], DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: time): SharedBuilder_PickerProps1272396767[default[DateType], DateType] = {
        val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
        new SharedBuilder_PickerProps1272396767[default[DateType], DateType](js.Array(this.component, __props.asInstanceOf[typingsSlinky.rcPicker.pickerMod.PickerTimeProps[DateType]]))
    }
  }
  
}

