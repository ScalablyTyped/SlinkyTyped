package typingsSlinky.baseui.paginationMod

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.baseui.anon.Value
import typingsSlinky.dateFns.Locale
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/pagination", "Pagination")
@js.native
class Pagination ()
  extends Component[PaginationProps, js.Object, js.Any] {
  
  def constructAriaWayfinderLabel(locale: Locale, prefix: String): String = js.native
  
  def getMenuOptions(numPages: Double): js.Array[js.Any] = js.native
  
  def onMenuItemSelect(data: Value): Unit = js.native
  
  def onNextClick(event: SyntheticEvent[Event, _]): Unit = js.native
  
  def onPrevClick(event: SyntheticEvent[Event, _]): Unit = js.native
}
