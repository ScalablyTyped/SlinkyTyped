package typingsSlinky.rmcCalendar

import typingsSlinky.react.mod.PureComponent
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weekPanelMod {
  
  @JSImport("rmc-calendar/lib/date/WeekPanel", JSImport.Default)
  @js.native
  class default protected () extends WeekPanel {
    def this(props: PropsType) = this()
  }
  
  @js.native
  trait PropsType extends StObject {
    
    var locale: Locale = js.native
  }
  object PropsType {
    
    @scala.inline
    def apply(locale: Locale): PropsType = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WeekPanel
    extends PureComponent[PropsType, js.Object, js.Any]
}
