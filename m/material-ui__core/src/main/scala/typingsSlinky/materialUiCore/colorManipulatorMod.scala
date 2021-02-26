package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorManipulatorMod {
  
  @JSImport("@material-ui/core/styles/colorManipulator", "convertHexToRGB")
  @js.native
  def convertHexToRGB(hex: String): String = js.native
  
  @JSImport("@material-ui/core/styles/colorManipulator", "darken")
  @js.native
  def darken(color: String): String = js.native
  @JSImport("@material-ui/core/styles/colorManipulator", "darken")
  @js.native
  def darken(color: String, coefficient: Double): String = js.native
  
  @JSImport("@material-ui/core/styles/colorManipulator", "decomposeColor")
  @js.native
  def decomposeColor(color: String): ColorObject = js.native
  
  @JSImport("@material-ui/core/styles/colorManipulator", "emphasize")
  @js.native
  def emphasize(color: String): String = js.native
  @JSImport("@material-ui/core/styles/colorManipulator", "emphasize")
  @js.native
  def emphasize(color: String, coefficient: Double): String = js.native
  
  @JSImport("@material-ui/core/styles/colorManipulator", "fade")
  @js.native
  def fade(color: String, value: Double): String = js.native
  
  @JSImport("@material-ui/core/styles/colorManipulator", "getContrastRatio")
  @js.native
  def getContrastRatio(foreground: String, background: String): Double = js.native
  
  @JSImport("@material-ui/core/styles/colorManipulator", "getLuminance")
  @js.native
  def getLuminance(color: String): Double = js.native
  
  @JSImport("@material-ui/core/styles/colorManipulator", "lighten")
  @js.native
  def lighten(color: String): String = js.native
  @JSImport("@material-ui/core/styles/colorManipulator", "lighten")
  @js.native
  def lighten(color: String, coefficient: Double): String = js.native
  
  @JSImport("@material-ui/core/styles/colorManipulator", "recomposeColor")
  @js.native
  def recomposeColor(color: ColorObject): String = js.native
  
  @JSImport("@material-ui/core/styles/colorManipulator", "rgbToHex")
  @js.native
  def rgbToHex(color: String): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiCore.materialUiCoreStrings.rgb
    - typingsSlinky.materialUiCore.materialUiCoreStrings.rgba
    - typingsSlinky.materialUiCore.materialUiCoreStrings.hsl
    - typingsSlinky.materialUiCore.materialUiCoreStrings.hsla
  */
  trait ColorFormat extends StObject
  object ColorFormat {
    
    @scala.inline
    def hsl: typingsSlinky.materialUiCore.materialUiCoreStrings.hsl = "hsl".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.hsl]
    
    @scala.inline
    def hsla: typingsSlinky.materialUiCore.materialUiCoreStrings.hsla = "hsla".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.hsla]
    
    @scala.inline
    def rgb: typingsSlinky.materialUiCore.materialUiCoreStrings.rgb = "rgb".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.rgb]
    
    @scala.inline
    def rgba: typingsSlinky.materialUiCore.materialUiCoreStrings.rgba = "rgba".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.rgba]
  }
  
  @js.native
  trait ColorObject extends StObject {
    
    var `type`: ColorFormat = js.native
    
    var values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]) = js.native
  }
  object ColorObject {
    
    @scala.inline
    def apply(
      `type`: ColorFormat,
      values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ): ColorObject = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorObject]
    }
    
    @scala.inline
    implicit class ColorObjectMutableBuilder[Self <: ColorObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ColorFormat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
