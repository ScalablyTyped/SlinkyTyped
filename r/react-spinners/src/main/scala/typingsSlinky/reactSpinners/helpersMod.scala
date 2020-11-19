package typingsSlinky.reactSpinners

import typingsSlinky.reactSpinners.anon.RequiredLoaderHeightWidth
import typingsSlinky.reactSpinners.anon.RequiredLoaderHeightWidthColor
import typingsSlinky.reactSpinners.anon.RequiredLoaderSizeMarginP
import typingsSlinky.reactSpinners.anon.RequiredLoaderSizeProps
import typingsSlinky.reactSpinners.colorsMod.RgbaFunction
import typingsSlinky.reactSpinners.interfacesMod.LengthObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  val calculateRgba: RgbaFunction = js.native
  
  def cssValue(value: String): String = js.native
  def cssValue(value: Double): String = js.native
  
  def heightWidthDefaults(height: Double, width: Double): RequiredLoaderHeightWidth = js.native
  
  def heightWidthRadiusDefaults(height: Double, width: Double): RequiredLoaderHeightWidthColor = js.native
  def heightWidthRadiusDefaults(height: Double, width: Double, radius: Double): RequiredLoaderHeightWidthColor = js.native
  
  def parseLengthAndUnit(size: String): LengthObject = js.native
  def parseLengthAndUnit(size: Double): LengthObject = js.native
  
  def sizeDefaults(sizeValue: Double): RequiredLoaderSizeProps = js.native
  
  def sizeMarginDefaults(sizeValue: Double): RequiredLoaderSizeMarginP = js.native
}
