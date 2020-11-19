package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Accordion")
@js.native
class Accordion protected ()
  extends typingsSlinky.ejWebAll.ej.Accordion {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Accordion.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Accordion.Model) = this()
}
/* static members */
@JSGlobal("ej.Accordion")
@js.native
object Accordion extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.Accordion = js.native
  
  @js.native
  object HeightAdjustMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Accordion.HeightAdjustMode with Double] = js.native
    
    /* 1 */ val Auto: typingsSlinky.ejWebAll.ej.Accordion.HeightAdjustMode.Auto with Double = js.native
    
    /* 0 */ val Content: typingsSlinky.ejWebAll.ej.Accordion.HeightAdjustMode.Content with Double = js.native
    
    /* 2 */ val Fill: typingsSlinky.ejWebAll.ej.Accordion.HeightAdjustMode.Fill with Double = js.native
  }
}
