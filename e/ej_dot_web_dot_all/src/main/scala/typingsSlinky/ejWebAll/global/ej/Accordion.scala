package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Accordion")
@js.native
class Accordion protected ()
  extends typingsSlinky.ejWebAll.ej.Accordion {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object Accordion {
  
  @JSGlobal("ej.Accordion")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Accordion.HeightAdjustMode")
  @js.native
  object HeightAdjustMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Accordion.HeightAdjustMode with Double] = js.native
    
    /* 1 */ val Auto: typingsSlinky.ejWebAll.ej.Accordion.HeightAdjustMode.Auto with Double = js.native
    
    /* 0 */ val Content: typingsSlinky.ejWebAll.ej.Accordion.HeightAdjustMode.Content with Double = js.native
    
    /* 2 */ val Fill: typingsSlinky.ejWebAll.ej.Accordion.HeightAdjustMode.Fill with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Accordion.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.Accordion.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.Accordion = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.Accordion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
