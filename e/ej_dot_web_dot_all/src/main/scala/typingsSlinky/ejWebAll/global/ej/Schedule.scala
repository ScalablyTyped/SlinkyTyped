package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Schedule")
@js.native
class Schedule protected ()
  extends typingsSlinky.ejWebAll.ej.Schedule {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object Schedule {
  
  @JSGlobal("ej.Schedule")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Schedule.CurrentView")
  @js.native
  object CurrentView extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Schedule.CurrentView with Double] = js.native
    
    /* 4 */ val Agenda: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.Agenda with Double = js.native
    
    /* 5 */ val CustomView: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.CustomView with Double = js.native
    
    /* 0 */ val Day: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.Day with Double = js.native
    
    /* 3 */ val Month: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.Month with Double = js.native
    
    /* 1 */ val Week: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.Week with Double = js.native
    
    /* 2 */ val Workweek: typingsSlinky.ejWebAll.ej.Schedule.CurrentView.Workweek with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Schedule.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Schedule.Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Schedule.Orientation with Double] = js.native
    
    /* 1 */ val Horizontal: typingsSlinky.ejWebAll.ej.Schedule.Orientation.Horizontal with Double = js.native
    
    /* 0 */ val Vertical: typingsSlinky.ejWebAll.ej.Schedule.Orientation.Vertical with Double = js.native
  }
  
  @JSGlobal("ej.Schedule.TimeMode")
  @js.native
  object TimeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Schedule.TimeMode with Double] = js.native
    
    /* 0 */ val Hour12: typingsSlinky.ejWebAll.ej.Schedule.TimeMode.Hour12 with Double = js.native
    
    /* 1 */ val Hour24: typingsSlinky.ejWebAll.ej.Schedule.TimeMode.Hour24 with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Schedule.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.Schedule = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.Schedule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
