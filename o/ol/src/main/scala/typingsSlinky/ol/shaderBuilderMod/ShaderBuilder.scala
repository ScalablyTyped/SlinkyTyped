package typingsSlinky.ol.shaderBuilderMod

import typingsSlinky.ol.olStrings.float
import typingsSlinky.ol.olStrings.vec2
import typingsSlinky.ol.olStrings.vec3
import typingsSlinky.ol.olStrings.vec4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/webgl/ShaderBuilder", "ShaderBuilder")
@js.native
class ShaderBuilder () extends js.Object {
  
  def addAttribute(name: String): ShaderBuilder = js.native
  
  def addUniform(name: String): ShaderBuilder = js.native
  
  @JSName("addVarying")
  def addVarying_float(name: String, `type`: float, expression: String): ShaderBuilder = js.native
  @JSName("addVarying")
  def addVarying_vec2(name: String, `type`: vec2, expression: String): ShaderBuilder = js.native
  @JSName("addVarying")
  def addVarying_vec3(name: String, `type`: vec3, expression: String): ShaderBuilder = js.native
  @JSName("addVarying")
  def addVarying_vec4(name: String, `type`: vec4, expression: String): ShaderBuilder = js.native
  
  def getColorExpression(): String = js.native
  
  def getFragmentDiscardExpression(): String = js.native
  
  def getOffsetExpression(): String = js.native
  
  def getSizeExpression(): String = js.native
  
  def getSymbolFragmentShader(): String = js.native
  def getSymbolFragmentShader(forHitDetection: Boolean): String = js.native
  
  def getSymbolVertexShader(): String = js.native
  def getSymbolVertexShader(forHitDetection: Boolean): String = js.native
  
  def getTextureCoordinateExpression(): String = js.native
  
  def setColorExpression(expression: String): ShaderBuilder = js.native
  
  def setFragmentDiscardExpression(expression: String): ShaderBuilder = js.native
  
  def setRotationExpression(expression: String): ShaderBuilder = js.native
  
  def setSizeExpression(expression: String): ShaderBuilder = js.native
  
  def setSymbolOffsetExpression(expression: String): ShaderBuilder = js.native
  
  def setSymbolRotateWithView(rotateWithView: Boolean): ShaderBuilder = js.native
  
  def setTextureCoordinateExpression(expression: String): ShaderBuilder = js.native
}
