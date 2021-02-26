package typingsSlinky.primereact

import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullCalendarMod {
  
  @JSImport("primereact/components/fullcalendar/FullCalendar", "FullCalendar")
  @js.native
  class FullCalendar protected ()
    extends Component[FullCalendarProps, js.Any, js.Any] {
    def this(props: FullCalendarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FullCalendarProps, context: js.Any) = this()
  }
  
  @js.native
  trait FullCalendarProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var events: js.UndefOr[js.Array[_]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[js.Object] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object FullCalendarProps {
    
    @scala.inline
    def apply(): FullCalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullCalendarProps]
    }
    
    @scala.inline
    implicit class FullCalendarPropsMutableBuilder[Self <: FullCalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Array[_]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: js.Any*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
