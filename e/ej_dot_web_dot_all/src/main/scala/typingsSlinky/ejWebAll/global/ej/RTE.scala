package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.RTE")
@js.native
class RTE protected ()
  extends typingsSlinky.ejWebAll.ej.RTE {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object RTE {
  
  @JSGlobal("ej.RTE")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.RTE.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.RTE.ToolbarOverflowMode")
  @js.native
  object ToolbarOverflowMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.RTE.ToolbarOverflowMode with Double] = js.native
    
    /* 1 */ val Inline: typingsSlinky.ejWebAll.ej.RTE.ToolbarOverflowMode.Inline with Double = js.native
    
    /* 0 */ val Popup: typingsSlinky.ejWebAll.ej.RTE.ToolbarOverflowMode.Popup with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.RTE.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.RTE = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.RTE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
