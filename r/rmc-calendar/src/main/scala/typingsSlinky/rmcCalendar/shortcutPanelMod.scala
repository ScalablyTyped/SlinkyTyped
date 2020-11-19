package typingsSlinky.rmcCalendar

import typingsSlinky.react.mod.Component
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-calendar/lib/calendar/ShortcutPanel", JSImport.Namespace)
@js.native
object shortcutPanelMod extends js.Object {
  
  @js.native
  trait PropsType extends js.Object {
    
    var locale: Locale = js.native
    
    def onSelect(): Unit = js.native
    def onSelect(startDate: js.UndefOr[scala.Nothing], endDate: js.Date): Unit = js.native
    def onSelect(startDate: js.Date): Unit = js.native
    def onSelect(startDate: js.Date, endDate: js.Date): Unit = js.native
  }
  
  @js.native
  trait ShortcutPanel
    extends Component[PropsType, js.Object, js.Any] {
    
    def onClick(`type`: String): Unit = js.native
  }
  
  @js.native
  class default () extends ShortcutPanel
}
