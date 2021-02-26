package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ComboBox")
@js.native
class ComboBox protected ()
  extends typingsSlinky.ejWebAll.ej.ComboBox {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object ComboBox {
  
  @JSGlobal("ej.ComboBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.ComboBox.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.ComboBox.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ComboBox.SortOrder with Double] = js.native
    
    /* 1 */ val Ascending: typingsSlinky.ejWebAll.ej.ComboBox.SortOrder.Ascending with Double = js.native
    
    /* 2 */ val Descending: typingsSlinky.ejWebAll.ej.ComboBox.SortOrder.Descending with Double = js.native
    
    /* 0 */ val None: typingsSlinky.ejWebAll.ej.ComboBox.SortOrder.None with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.ComboBox.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.ComboBox = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.ComboBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
