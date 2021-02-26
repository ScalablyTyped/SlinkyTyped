package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotPager")
@js.native
class PivotPager protected ()
  extends typingsSlinky.ejWebAll.ej.PivotPager {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object PivotPager {
  
  @JSGlobal("ej.PivotPager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.PivotPager.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.PivotPager.Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotPager.Mode with Double] = js.native
    
    /* 0 */ val Both: typingsSlinky.ejWebAll.ej.PivotPager.Mode.Both with Double = js.native
    
    /* 1 */ val Categorical: typingsSlinky.ejWebAll.ej.PivotPager.Mode.Categorical with Double = js.native
    
    /* 2 */ val Series: typingsSlinky.ejWebAll.ej.PivotPager.Mode.Series with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotPager.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.PivotPager = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.PivotPager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
