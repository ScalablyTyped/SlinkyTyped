package typingsSlinky.rmcCalendar.confirmPanelMod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmPanel
  extends Component[ConfirmPanelPropsType, js.Object, js.Any] {
  def formatDate(date: js.Date): String = js.native
  def onConfirm(): Unit = js.native
}

