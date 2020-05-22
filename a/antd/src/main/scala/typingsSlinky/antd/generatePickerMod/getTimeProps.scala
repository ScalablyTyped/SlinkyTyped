package typingsSlinky.antd.generatePickerMod

import typingsSlinky.antd.anon.Format
import typingsSlinky.antd.anon.ShowTime
import typingsSlinky.rcPicker.timePanelMod.SharedTimeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker/generatePicker", "getTimeProps")
@js.native
object getTimeProps extends js.Object {
  def apply[DateType](props: Format with SharedTimeProps[DateType]): SharedTimeProps[DateType] | ShowTime[DateType] = js.native
}

