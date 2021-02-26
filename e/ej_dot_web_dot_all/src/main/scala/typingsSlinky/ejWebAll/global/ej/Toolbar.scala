package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Toolbar")
@js.native
class Toolbar protected ()
  extends typingsSlinky.ejWebAll.ej.Toolbar {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object Toolbar {
  
  @JSGlobal("ej.Toolbar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Toolbar.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Toolbar.ResponsiveType")
  @js.native
  object ResponsiveType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Toolbar.ResponsiveType with Double] = js.native
    
    /* 1 */ val Inline: typingsSlinky.ejWebAll.ej.Toolbar.ResponsiveType.Inline with Double = js.native
    
    /* 0 */ val Popup: typingsSlinky.ejWebAll.ej.Toolbar.ResponsiveType.Popup with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Toolbar.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.Toolbar = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.Toolbar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
