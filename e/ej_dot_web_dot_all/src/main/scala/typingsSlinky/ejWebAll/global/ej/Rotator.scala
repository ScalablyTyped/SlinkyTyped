package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Rotator")
@js.native
class Rotator protected ()
  extends typingsSlinky.ejWebAll.ej.Rotator {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object Rotator {
  
  @JSGlobal("ej.Rotator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Rotator.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Rotator.PagerPosition")
  @js.native
  object PagerPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Rotator.PagerPosition with Double] = js.native
    
    /* 0 */ val BottomLeft: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.BottomLeft with Double = js.native
    
    /* 1 */ val BottomRight: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.BottomRight with Double = js.native
    
    /* 2 */ val Outside: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.Outside with Double = js.native
    
    /* 3 */ val TopCenter: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.TopCenter with Double = js.native
    
    /* 4 */ val TopLeft: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.TopLeft with Double = js.native
    
    /* 5 */ val TopRight: typingsSlinky.ejWebAll.ej.Rotator.PagerPosition.TopRight with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Rotator.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.Rotator = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.Rotator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
