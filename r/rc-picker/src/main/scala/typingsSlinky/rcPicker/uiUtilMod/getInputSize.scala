package typingsSlinky.rcPicker.uiUtilMod

import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.CustomFormat
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/utils/uiUtil", "getInputSize")
@js.native
object getInputSize extends js.Object {
  
  def apply[DateType](picker: js.UndefOr[scala.Nothing], format: String, generateConfig: GenerateConfig[DateType]): Double = js.native
  def apply[DateType](
    picker: js.UndefOr[scala.Nothing],
    format: CustomFormat[DateType],
    generateConfig: GenerateConfig[DateType]
  ): Double = js.native
  def apply[DateType](picker: PickerMode, format: String, generateConfig: GenerateConfig[DateType]): Double = js.native
  def apply[DateType](picker: PickerMode, format: CustomFormat[DateType], generateConfig: GenerateConfig[DateType]): Double = js.native
}
