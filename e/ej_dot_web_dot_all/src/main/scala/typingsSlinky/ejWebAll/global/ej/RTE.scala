package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.RTE")
@js.native
class RTE protected ()
  extends typingsSlinky.ejWebAll.ej.RTE {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.RTE.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.RTE.Model) = this()
}
/* static members */
@JSGlobal("ej.RTE")
@js.native
object RTE extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.RTE = js.native
  
  @js.native
  object ToolbarOverflowMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.RTE.ToolbarOverflowMode with Double] = js.native
    
    /* 1 */ val Inline: typingsSlinky.ejWebAll.ej.RTE.ToolbarOverflowMode.Inline with Double = js.native
    
    /* 0 */ val Popup: typingsSlinky.ejWebAll.ej.RTE.ToolbarOverflowMode.Popup with Double = js.native
  }
}
