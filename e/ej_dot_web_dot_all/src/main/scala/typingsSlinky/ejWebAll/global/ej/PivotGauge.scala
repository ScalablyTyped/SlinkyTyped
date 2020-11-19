package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotGauge")
@js.native
class PivotGauge protected ()
  extends typingsSlinky.ejWebAll.ej.PivotGauge {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.PivotGauge.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.PivotGauge.Model) = this()
}
/* static members */
@JSGlobal("ej.PivotGauge")
@js.native
object PivotGauge extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.PivotGauge = js.native
  
  @js.native
  object NumberFormat extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotGauge.NumberFormat with Double] = js.native
    
    /* 1 */ val Currency: typingsSlinky.ejWebAll.ej.PivotGauge.NumberFormat.Currency with Double = js.native
    
    /* 0 */ val Default: typingsSlinky.ejWebAll.ej.PivotGauge.NumberFormat.Default with Double = js.native
    
    /* 3 */ val Fraction: typingsSlinky.ejWebAll.ej.PivotGauge.NumberFormat.Fraction with Double = js.native
    
    /* 6 */ val Notation: typingsSlinky.ejWebAll.ej.PivotGauge.NumberFormat.Notation with Double = js.native
    
    /* 2 */ val Percentage: typingsSlinky.ejWebAll.ej.PivotGauge.NumberFormat.Percentage with Double = js.native
    
    /* 4 */ val Scientific: typingsSlinky.ejWebAll.ej.PivotGauge.NumberFormat.Scientific with Double = js.native
    
    /* 5 */ val Text: typingsSlinky.ejWebAll.ej.PivotGauge.NumberFormat.Text with Double = js.native
  }
}
