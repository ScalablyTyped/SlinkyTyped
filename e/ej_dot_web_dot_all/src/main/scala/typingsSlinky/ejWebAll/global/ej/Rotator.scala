package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Rotator")
@js.native
class Rotator protected ()
  extends typingsSlinky.ejWebAll.ej.Rotator {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Rotator.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Rotator.Model) = this()
}
/* static members */
@JSGlobal("ej.Rotator")
@js.native
object Rotator extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.Rotator = js.native
  
  @js.native
  object PagerPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Rotator.PagerPosition with Double] = js.native
    
    /* 0 */ val BottomLeft: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.BottomLeft with Double = js.native
    
    /* 1 */ val BottomRight: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.BottomRight with Double = js.native
    
    /* 2 */ val Outside: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.Outside with Double = js.native
    
    /* 3 */ val TopCenter: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.TopCenter with Double = js.native
    
    /* 4 */ val TopLeft: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.TopLeft with Double = js.native
    
    /* 5 */ val TopRight: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.TopRight with Double = js.native
  }
}
