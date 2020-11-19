package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ComboBox")
@js.native
class ComboBox protected ()
  extends typingsSlinky.ejWebAll.ej.ComboBox {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.ComboBox.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.ComboBox.Model) = this()
}
/* static members */
@JSGlobal("ej.ComboBox")
@js.native
object ComboBox extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.ComboBox = js.native
  
  @js.native
  object SortOrder extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ComboBox.SortOrder with Double] = js.native
    
    /* 1 */ val Ascending: typingsSlinky.ejWebAll.ej.ComboBox.SortOrder.Ascending with Double = js.native
    
    /* 2 */ val Descending: typingsSlinky.ejWebAll.ej.ComboBox.SortOrder.Descending with Double = js.native
    
    /* 0 */ val None: typingsSlinky.ejWebAll.ej.ComboBox.SortOrder.None with Double = js.native
  }
}
