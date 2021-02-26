package typingsSlinky.rmcCalendar

import typingsSlinky.react.mod.PureComponent
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutPanelMod {
  
  @JSImport("rmc-calendar/lib/calendar/ShortcutPanel", JSImport.Default)
  @js.native
  class default () extends ShortcutPanel
  
  @js.native
  trait PropsType extends StObject {
    
    var locale: Locale = js.native
    
    def onSelect(): Unit = js.native
    def onSelect(startDate: js.UndefOr[scala.Nothing], endDate: js.Date): Unit = js.native
    def onSelect(startDate: js.Date): Unit = js.native
    def onSelect(startDate: js.Date, endDate: js.Date): Unit = js.native
  }
  
  @js.native
  trait ShortcutPanel
    extends PureComponent[PropsType, js.Object, js.Any] {
    
    def onClick(`type`: String): Unit = js.native
  }
}
