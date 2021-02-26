package typingsSlinky.reactSpinners

import typingsSlinky.reactSpinners.anon.RequiredLoaderHeightWidth
import typingsSlinky.reactSpinners.anon.RequiredLoaderHeightWidthColor
import typingsSlinky.reactSpinners.anon.RequiredLoaderSizeMarginP
import typingsSlinky.reactSpinners.anon.RequiredLoaderSizeProps
import typingsSlinky.reactSpinners.colorsMod.RgbaFunction
import typingsSlinky.reactSpinners.interfacesMod.LengthObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("react-spinners/helpers", "calculateRgba")
  @js.native
  val calculateRgba: RgbaFunction = js.native
  
  @JSImport("react-spinners/helpers", "cssValue")
  @js.native
  def cssValue(value: String): String = js.native
  @JSImport("react-spinners/helpers", "cssValue")
  @js.native
  def cssValue(value: Double): String = js.native
  
  @JSImport("react-spinners/helpers", "heightWidthDefaults")
  @js.native
  def heightWidthDefaults(height: Double, width: Double): RequiredLoaderHeightWidth = js.native
  
  @JSImport("react-spinners/helpers", "heightWidthRadiusDefaults")
  @js.native
  def heightWidthRadiusDefaults(height: Double, width: Double): RequiredLoaderHeightWidthColor = js.native
  @JSImport("react-spinners/helpers", "heightWidthRadiusDefaults")
  @js.native
  def heightWidthRadiusDefaults(height: Double, width: Double, radius: Double): RequiredLoaderHeightWidthColor = js.native
  
  @JSImport("react-spinners/helpers", "parseLengthAndUnit")
  @js.native
  def parseLengthAndUnit(size: String): LengthObject = js.native
  @JSImport("react-spinners/helpers", "parseLengthAndUnit")
  @js.native
  def parseLengthAndUnit(size: Double): LengthObject = js.native
  
  @JSImport("react-spinners/helpers", "sizeDefaults")
  @js.native
  def sizeDefaults(sizeValue: Double): RequiredLoaderSizeProps = js.native
  
  @JSImport("react-spinners/helpers", "sizeMarginDefaults")
  @js.native
  def sizeMarginDefaults(sizeValue: Double): RequiredLoaderSizeMarginP = js.native
}
