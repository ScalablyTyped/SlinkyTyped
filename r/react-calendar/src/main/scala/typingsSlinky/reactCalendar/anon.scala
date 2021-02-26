package typingsSlinky.reactCalendar

import typingsSlinky.reactCalendar.mod.Detail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined react-calendar.react-calendar.CalendarTileProperties & {  activeStartDate :std.Date} */
  @js.native
  trait CalendarTilePropertiesact extends StObject {
    
    var activeStartDate: js.Date = js.native
    
    var date: js.Date = js.native
    
    var view: Detail = js.native
  }
  object CalendarTilePropertiesact {
    
    @scala.inline
    def apply(activeStartDate: js.Date, date: js.Date, view: Detail): CalendarTilePropertiesact = {
      val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarTilePropertiesact]
    }
    
    @scala.inline
    implicit class CalendarTilePropertiesactMutableBuilder[Self <: CalendarTilePropertiesact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: Detail): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Date extends StObject {
    
    var date: js.Date = js.native
    
    var label: String = js.native
    
    var view: Detail = js.native
  }
  object Date {
    
    @scala.inline
    def apply(date: js.Date, label: String, view: Detail): Date = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: Detail): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
