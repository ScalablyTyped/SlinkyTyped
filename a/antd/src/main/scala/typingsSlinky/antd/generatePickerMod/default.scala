package typingsSlinky.antd.generatePickerMod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.MonthPicker
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/date-picker/generatePicker", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[DateType](generateConfig: GenerateConfig[DateType]): ReactComponentClass[PickerProps[DateType]] with MonthPicker[DateType] = js.native
}
