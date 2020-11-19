package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ListBox")
@js.native
class ListBox protected ()
  extends typingsSlinky.ejWebAll.ej.ListBox {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.ListBox.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.ListBox.Model) = this()
}
/* static members */
@JSGlobal("ej.ListBox")
@js.native
object ListBox extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.ListBox = js.native
  
  @js.native
  object SortOrder extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ListBox.SortOrder with Double] = js.native
    
    /* 1 */ val Ascending: typingsSlinky.ejWebAll.ej.ListBox.SortOrder.Ascending with Double = js.native
    
    /* 2 */ val Descending: typingsSlinky.ejWebAll.ej.ListBox.SortOrder.Descending with Double = js.native
    
    /* 0 */ val None: typingsSlinky.ejWebAll.ej.ListBox.SortOrder.None with Double = js.native
  }
}
