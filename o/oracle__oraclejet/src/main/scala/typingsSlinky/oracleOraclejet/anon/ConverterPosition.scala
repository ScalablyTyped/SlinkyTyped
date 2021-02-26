package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.billion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.insideIndicatorEdge
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.million
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.number
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outsideIndicatorEdge
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outsidePlotArea
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.percent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.withLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterPosition extends StObject {
  
  var converter: js.UndefOr[typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.native
  
  var position: js.UndefOr[
    center | insideIndicatorEdge | outsideIndicatorEdge | outsidePlotArea | withLabel | auto
  ] = js.native
  
  var rendered: js.UndefOr[on | off | auto] = js.native
  
  var scaling: js.UndefOr[none | thousand | million | billion | trillion | quadrillion | auto] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textType: js.UndefOr[percent | number] = js.native
}
object ConverterPosition {
  
  @scala.inline
  def apply(): ConverterPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterPosition]
  }
  
  @scala.inline
  implicit class ConverterPositionMutableBuilder[Self <: ConverterPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    @scala.inline
    def setPosition(value: center | insideIndicatorEdge | outsideIndicatorEdge | outsidePlotArea | withLabel | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRendered(value: on | off | auto): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    @scala.inline
    def setScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextType(value: percent | number): Self = StObject.set(x, "textType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTypeUndefined: Self = StObject.set(x, "textType", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
