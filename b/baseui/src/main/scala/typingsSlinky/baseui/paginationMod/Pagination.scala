package typingsSlinky.baseui.paginationMod

import slinky.core.SyntheticEvent
import typingsSlinky.baseui.AnonValue
import typingsSlinky.dateFns.Locale
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/pagination", "Pagination")
@js.native
class Pagination ()
  extends Component[PaginationProps, js.Object, js.Any] {
  def constructAriaWayfinderLabel(locale: Locale, prefix: String): String = js.native
  def getMenuOptions(numPages: Double): js.Array[js.Any] = js.native
  def onMenuItemSelect(data: AnonValue): Unit = js.native
  def onNextClick(event: SyntheticEvent[Event_, _]): Unit = js.native
  def onPrevClick(event: SyntheticEvent[Event_, _]): Unit = js.native
}

