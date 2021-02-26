package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlphaState extends StObject {
  
  var _alphaBlend: js.Any = js.native
  
  var _blendConstants: js.Any = js.native
  
  var _blendEquationParameters: js.Any = js.native
  
  var _blendFunctionParameters: js.Any = js.native
  
  var _isAlphaBlendDirty: js.Any = js.native
  
  var _isBlendConstantsDirty: js.Any = js.native
  
  var _isBlendEquationParametersDirty: js.Any = js.native
  
  var _isBlendFunctionParametersDirty: js.Any = js.native
  
  def alphaBlend: Boolean = js.native
  def alphaBlend_=(value: Boolean): Unit = js.native
  
  @JSName("apply")
  def apply(gl: WebGLRenderingContext): Unit = js.native
  
  def isDirty: Boolean = js.native
  
  def reset(): Unit = js.native
  
  def setAlphaBlendConstants(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  
  def setAlphaBlendFunctionParameters(value0: Double, value1: Double, value2: Double, value3: Double): Unit = js.native
  
  def setAlphaEquationParameters(rgb: Double, alpha: Double): Unit = js.native
}
