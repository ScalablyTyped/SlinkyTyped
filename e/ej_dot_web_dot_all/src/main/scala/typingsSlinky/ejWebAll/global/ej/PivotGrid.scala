package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotGrid")
@js.native
class PivotGrid protected ()
  extends typingsSlinky.ejWebAll.ej.PivotGrid {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.PivotGrid.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.PivotGrid.Model) = this()
}
/* static members */
@JSGlobal("ej.PivotGrid")
@js.native
object PivotGrid extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.PivotGrid = js.native
  
  @js.native
  object Layout extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotGrid.Layout with Double] = js.native
    
    /* 3 */ val ExcelLikeLayout: typingsSlinky.ejWebAll.ej.PivotGrid.Layout.ExcelLikeLayout with Double = js.native
    
    /* 2 */ val NoSummaries: typingsSlinky.ejWebAll.ej.PivotGrid.Layout.NoSummaries with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.PivotGrid.Layout.Normal with Double = js.native
    
    /* 1 */ val NormalTopSummary: typingsSlinky.ejWebAll.ej.PivotGrid.Layout.NormalTopSummary with Double = js.native
  }
}
