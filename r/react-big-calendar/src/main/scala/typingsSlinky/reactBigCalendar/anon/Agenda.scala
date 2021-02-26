package typingsSlinky.reactBigCalendar.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactBigCalendar.mod.ViewStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Agenda extends StObject {
  
  var agenda: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.native
  
  var day: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.native
  
  var month: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.native
  
  var week: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.native
  
  var work_week: js.UndefOr[Boolean | (ReactComponentClass[_] with ViewStatic)] = js.native
}
object Agenda {
  
  @scala.inline
  def apply(): Agenda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Agenda]
  }
  
  @scala.inline
  implicit class AgendaMutableBuilder[Self <: Agenda] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgenda(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = StObject.set(x, "agenda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgendaUndefined: Self = StObject.set(x, "agenda", js.undefined)
    
    @scala.inline
    def setDay(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setMonth(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setWeek(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
    
    @scala.inline
    def setWork_week(value: Boolean | (ReactComponentClass[_] with ViewStatic)): Self = StObject.set(x, "work_week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWork_weekUndefined: Self = StObject.set(x, "work_week", js.undefined)
  }
}
