package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Tab")
@js.native
class Tab protected ()
  extends typingsSlinky.ejWebAll.ej.Tab {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Tab.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Tab.Model) = this()
}
/* static members */
@JSGlobal("ej.Tab")
@js.native
object Tab extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.Tab = js.native
  
  @js.native
  object HeightAdjustMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tab.HeightAdjustMode with Double] = js.native
    
    /* 2 */ val Auto: typingsSlinky.ejWebAll.ej.Tab.HeightAdjustMode.Auto with Double = js.native
    
    /* 1 */ val Content: typingsSlinky.ejWebAll.ej.Tab.HeightAdjustMode.Content with Double = js.native
    
    /* 3 */ val Fill: typingsSlinky.ejWebAll.ej.Tab.HeightAdjustMode.Fill with Double = js.native
    
    /* 0 */ val None: typingsSlinky.ejWebAll.ej.Tab.HeightAdjustMode.None with Double = js.native
  }
  
  @js.native
  object Position extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tab.Position with Double] = js.native
    
    /* 1 */ val Bottom: typingsSlinky.ejWebAll.ej.Tab.Position.Bottom with Double = js.native
    
    /* 2 */ val Left: typingsSlinky.ejWebAll.ej.Tab.Position.Left with Double = js.native
    
    /* 3 */ val Right: typingsSlinky.ejWebAll.ej.Tab.Position.Right with Double = js.native
    
    /* 0 */ val Top: typingsSlinky.ejWebAll.ej.Tab.Position.Top with Double = js.native
  }
}
