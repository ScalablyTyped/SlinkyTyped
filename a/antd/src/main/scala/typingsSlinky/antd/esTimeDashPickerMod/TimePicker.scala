package typingsSlinky.antd.esTimeDashPickerMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.Anon_Open
import typingsSlinky.antd.Anon_Placeholder
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePicker
  extends Component[TimePickerProps, js.Any, js.Any] {
  var timePickerRef: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getAllowClear(): js.UndefOr[Boolean] = js.native
  def getDefaultFormat(): String = js.native
  def getDefaultLocale(): Anon_Placeholder = js.native
  def handleChange(value: Moment): Unit = js.native
  def handleOpenClose(hasOpen: Anon_Open): Unit = js.native
  def renderClearIcon(prefixCls: String): ReactElement = js.native
  def renderInputIcon(prefixCls: String): ReactElement = js.native
  def renderTimePicker(locale: TimePickerLocale): ReactElement = js.native
  def saveTimePicker(timePickerRef: js.Any): Unit = js.native
}

