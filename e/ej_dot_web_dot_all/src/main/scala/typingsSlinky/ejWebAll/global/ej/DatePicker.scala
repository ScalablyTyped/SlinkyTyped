package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.DatePicker")
@js.native
class DatePicker protected ()
  extends typingsSlinky.ejWebAll.ej.DatePicker {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object DatePicker {
  
  @JSGlobal("ej.DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.DatePicker.Header")
  @js.native
  object Header extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.DatePicker.Header with Double] = js.native
    
    /* 2 */ val Min: typingsSlinky.ejWebAll.ej.DatePicker.Header.Min with Double = js.native
    
    /* 0 */ val None: typingsSlinky.ejWebAll.ej.DatePicker.Header.None with Double = js.native
    
    /* 1 */ val Short: typingsSlinky.ejWebAll.ej.DatePicker.Header.Short with Double = js.native
  }
  
  @JSGlobal("ej.DatePicker.HighlightSection")
  @js.native
  object HighlightSection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.DatePicker.HighlightSection with Double] = js.native
    
    /* 2 */ val None: typingsSlinky.ejWebAll.ej.DatePicker.HighlightSection.None with Double = js.native
    
    /* 0 */ val Week: typingsSlinky.ejWebAll.ej.DatePicker.HighlightSection.Week with Double = js.native
    
    /* 1 */ val WorkDays: typingsSlinky.ejWebAll.ej.DatePicker.HighlightSection.WorkDays with Double = js.native
  }
  
  @JSGlobal("ej.DatePicker.Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.DatePicker.Level with Double] = js.native
    
    /* 2 */ val Century: typingsSlinky.ejWebAll.ej.DatePicker.Level.Century with Double = js.native
    
    /* 1 */ val Decade: typingsSlinky.ejWebAll.ej.DatePicker.Level.Decade with Double = js.native
    
    /* 0 */ val Year: typingsSlinky.ejWebAll.ej.DatePicker.Level.Year with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.DatePicker.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.DatePicker.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.DatePicker = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.DatePicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
