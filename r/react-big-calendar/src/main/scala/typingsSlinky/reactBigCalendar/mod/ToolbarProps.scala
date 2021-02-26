package typingsSlinky.reactBigCalendar.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var date: js.Date = js.native
  
  var label: String = js.native
  
  var localizer: typingsSlinky.reactBigCalendar.anon.Messages = js.native
  
  def onNavigate(navigate: NavigateAction): Unit = js.native
  def onNavigate(navigate: NavigateAction, date: js.Date): Unit = js.native
  
  def onView(view: View): Unit = js.native
  
  var view: View = js.native
  
  var views: ViewsProps[TEvent, TResource] = js.native
}
