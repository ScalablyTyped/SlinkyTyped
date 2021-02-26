package typingsSlinky.reactBigCalendar.mod

import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-big-calendar", "Week")
@js.native
class Week protected ()
  extends Component[WeekProps, js.Object, js.Any] {
  def this(props: WeekProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: WeekProps, context: js.Any) = this()
}
/* static members */
object Week {
  
  @JSImport("react-big-calendar", "Week.navigate")
  @js.native
  def navigate(date: js.Date, action: NavigateAction): js.Date = js.native
  
  @JSImport("react-big-calendar", "Week.range")
  @js.native
  def range(date: js.Date): js.Array[js.Date] = js.native
  
  @JSImport("react-big-calendar", "Week.title")
  @js.native
  def title(date: js.Date): String = js.native
}
