package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ListBox")
@js.native
class ListBox protected ()
  extends typingsSlinky.ejWebAll.ej.ListBox {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object ListBox {
  
  @JSGlobal("ej.ListBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.ListBox.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.ListBox.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ListBox.SortOrder with Double] = js.native
    
    /* 1 */ val Ascending: typingsSlinky.ejWebAll.ej.ListBox.SortOrder.Ascending with Double = js.native
    
    /* 2 */ val Descending: typingsSlinky.ejWebAll.ej.ListBox.SortOrder.Descending with Double = js.native
    
    /* 0 */ val None: typingsSlinky.ejWebAll.ej.ListBox.SortOrder.None with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.ListBox.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.ListBox = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.ListBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
