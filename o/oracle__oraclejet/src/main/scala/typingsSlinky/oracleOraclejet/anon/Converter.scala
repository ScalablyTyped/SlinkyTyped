package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.PieCenterContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.billion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.million
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trillion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Converter extends StObject {
  
  var converter: js.Object = js.native
  
  var label: String = js.native
  
  var labelStyle: js.Object = js.native
  
  def renderer(context: PieCenterContext): Insert | PreventDefault = js.native
  
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto = js.native
}
object Converter {
  
  @scala.inline
  def apply(
    converter: js.Object,
    label: String,
    labelStyle: js.Object,
    renderer: PieCenterContext => Insert | PreventDefault,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto
  ): Converter = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer), scaling = scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Converter]
  }
  
  @scala.inline
  implicit class ConverterMutableBuilder[Self <: Converter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: js.Object): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: PieCenterContext => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
  }
}
