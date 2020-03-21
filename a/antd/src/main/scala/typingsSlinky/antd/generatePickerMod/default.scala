package typingsSlinky.antd.generatePickerMod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.AnonMonthPicker
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker/generatePicker", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[DateType](generateConfig: GenerateConfig[DateType]): ReactComponentClass[PickerProps[DateType]] with AnonMonthPicker[DateType] = js.native
}

