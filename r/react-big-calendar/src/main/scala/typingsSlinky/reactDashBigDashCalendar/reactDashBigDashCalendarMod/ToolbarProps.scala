package typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import slinky.core.TagMod
import typingsSlinky.reactDashBigDashCalendar.Anon_Messages
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var date: js.Date = js.native
  var label: String = js.native
  var localizer: Anon_Messages = js.native
  var view: View = js.native
  var views: ViewsProps = js.native
  def onNavigate(navigate: NavigateAction): Unit = js.native
  def onNavigate(navigate: NavigateAction, date: Date): Unit = js.native
  def onView(view: View): Unit = js.native
}

