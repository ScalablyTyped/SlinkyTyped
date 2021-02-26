package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotGrid")
@js.native
class PivotGrid protected ()
  extends typingsSlinky.ejWebAll.ej.PivotGrid {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object PivotGrid {
  
  @JSGlobal("ej.PivotGrid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PivotGrid.Layout")
  @js.native
  object Layout extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotGrid.Layout with Double] = js.native
    
    /* 3 */ val ExcelLikeLayout: typingsSlinky.ejWebAll.ej.PivotGrid.Layout.ExcelLikeLayout with Double = js.native
    
    /* 2 */ val NoSummaries: typingsSlinky.ejWebAll.ej.PivotGrid.Layout.NoSummaries with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.PivotGrid.Layout.Normal with Double = js.native
    
    /* 1 */ val NormalTopSummary: typingsSlinky.ejWebAll.ej.PivotGrid.Layout.NormalTopSummary with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotGrid.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.PivotGrid.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.PivotGrid = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.PivotGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
