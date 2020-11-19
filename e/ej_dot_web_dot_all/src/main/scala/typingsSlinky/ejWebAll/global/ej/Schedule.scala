package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Schedule")
@js.native
class Schedule protected ()
  extends typingsSlinky.ejWebAll.ej.Schedule {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Schedule.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Schedule.Model) = this()
}
/* static members */
@JSGlobal("ej.Schedule")
@js.native
object Schedule extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.Schedule = js.native
  
  @js.native
  object CurrentView extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Schedule.CurrentView with Double] = js.native
    
    /* 4 */ val Agenda: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.Agenda with Double = js.native
    
    /* 5 */ val CustomView: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.CustomView with Double = js.native
    
    /* 0 */ val Day: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.Day with Double = js.native
    
    /* 3 */ val Month: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.Month with Double = js.native
    
    /* 1 */ val Week: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.Week with Double = js.native
    
    /* 2 */ val Workweek: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.Workweek with Double = js.native
  }
  
  @js.native
  object Orientation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Schedule.Orientation with Double] = js.native
    
    /* 1 */ val Horizontal: typingsSlinky.ejWebAll.ej.Schedule.Orientation.Horizontal with Double = js.native
    
    /* 0 */ val Vertical: typingsSlinky.ejWebAll.ej.Schedule.Orientation.Vertical with Double = js.native
  }
  
  @js.native
  object TimeMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Schedule.TimeMode with Double] = js.native
    
    /* 0 */ val Hour12: typingsSlinky.ejWebAll.ej.Schedule.TimeMode.Hour12 with Double = js.native
    
    /* 1 */ val Hour24: typingsSlinky.ejWebAll.ej.Schedule.TimeMode.Hour24 with Double = js.native
  }
}
