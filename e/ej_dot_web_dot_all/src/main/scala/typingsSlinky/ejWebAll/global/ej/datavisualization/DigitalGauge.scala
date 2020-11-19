package typingsSlinky.ejWebAll.global.ej.datavisualization

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import typingsSlinky.ejWebAll.ej.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.DigitalGauge")
@js.native
class DigitalGauge protected ()
  extends typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
/* static members */
@JSGlobal("ej.datavisualization.DigitalGauge")
@js.native
object DigitalGauge extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge = js.native
  
  @js.native
  object CharacterType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType with Double
      ] = js.native
    
    /* 3 */ val EightCrossEightDotMatrix: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightDotMatrix with Double = js.native
    
    /* 4 */ val EightCrossEightSquareMatrix: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightSquareMatrix with Double = js.native
    
    /* 1 */ val FourteenSegment: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.FourteenSegment with Double = js.native
    
    /* 0 */ val SevenSegment: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.SevenSegment with Double = js.native
    
    /* 2 */ val SixteenSegment: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.CharacterType.SixteenSegment with Double = js.native
  }
  
  @js.native
  object ExportingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.ExportingMode with Double
      ] = js.native
    
    /* 1 */ val ClientSide: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.ExportingMode.ClientSide with Double = js.native
    
    /* 0 */ val ServerSide: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.ExportingMode.ServerSide with Double = js.native
  }
  
  @js.native
  object ExportingType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.ExportingType with Double
      ] = js.native
    
    /* 1 */ val JPG: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.ExportingType.JPG with Double = js.native
    
    /* 0 */ val PNG: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.ExportingType.PNG with Double = js.native
  }
  
  @js.native
  object FontStyle extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle with Double] = js.native
    
    /* 1 */ val Bold: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Bold with Double = js.native
    
    /* 2 */ val Italic: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Italic with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Normal with Double = js.native
    
    /* 4 */ val Strikeout: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Strikeout with Double = js.native
    
    /* 3 */ val Underline: typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge.FontStyle.Underline with Double = js.native
  }
}
