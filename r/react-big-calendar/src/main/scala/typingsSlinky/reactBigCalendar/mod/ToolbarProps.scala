package typingsSlinky.reactBigCalendar.mod

import slinky.core.TagMod
import typingsSlinky.reactBigCalendar.AnonMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var date: js.Date = js.native
  var label: String = js.native
  var localizer: AnonMessages = js.native
  var view: View = js.native
  var views: ViewsProps = js.native
  def onNavigate(navigate: NavigateAction): Unit = js.native
  def onNavigate(navigate: NavigateAction, date: js.Date): Unit = js.native
  def onView(view: View): Unit = js.native
}

