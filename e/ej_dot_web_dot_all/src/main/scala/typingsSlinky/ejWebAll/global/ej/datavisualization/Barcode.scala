package typingsSlinky.ejWebAll.global.ej.datavisualization

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import typingsSlinky.ejWebAll.ej.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.Barcode")
@js.native
class Barcode protected ()
  extends typingsSlinky.ejWebAll.ej.datavisualization.Barcode {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: Model) = this()
  def this(element: JQuery, options: Model) = this()
}
object Barcode {
  
  @JSGlobal("ej.datavisualization.Barcode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.datavisualization.Barcode.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.Barcode.SymbologyType")
  @js.native
  object SymbologyType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType with Double] = js.native
    
    /* 5 */ val Codabar: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Codabar with Double = js.native
    
    /* 4 */ val Code11: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code11 with Double = js.native
    
    /* 9 */ val Code128A: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code128A with Double = js.native
    
    /* 10 */ val Code128B: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code128B with Double = js.native
    
    /* 11 */ val Code128C: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code128C with Double = js.native
    
    /* 6 */ val Code32: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code32 with Double = js.native
    
    /* 2 */ val Code39: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code39 with Double = js.native
    
    /* 3 */ val Code39Extended: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code39Extended with Double = js.native
    
    /* 7 */ val Code93: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code93 with Double = js.native
    
    /* 8 */ val Code93Extended: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code93Extended with Double = js.native
    
    /* 1 */ val DataMatrix: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.DataMatrix with Double = js.native
    
    /* 0 */ val QRBarcode: typingsSlinky.ejWebAll.ej.datavisualization.Barcode.SymbologyType.QRBarcode with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Barcode.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.datavisualization.Barcode = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.datavisualization.Barcode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
