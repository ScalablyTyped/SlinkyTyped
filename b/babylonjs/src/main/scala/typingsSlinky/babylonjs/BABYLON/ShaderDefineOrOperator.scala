package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderDefineOrOperator extends ShaderDefineExpression {
  
  var leftOperand: ShaderDefineExpression = js.native
  
  var rightOperand: ShaderDefineExpression = js.native
}
object ShaderDefineOrOperator {
  
  @scala.inline
  def apply(
    isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    leftOperand: ShaderDefineExpression,
    rightOperand: ShaderDefineExpression
  ): ShaderDefineOrOperator = {
    val __obj = js.Dynamic.literal(isTrue = js.Any.fromFunction1(isTrue), leftOperand = leftOperand.asInstanceOf[js.Any], rightOperand = rightOperand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefineOrOperator]
  }
  
  @scala.inline
  implicit class ShaderDefineOrOperatorMutableBuilder[Self <: ShaderDefineOrOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftOperand(value: ShaderDefineExpression): Self = StObject.set(x, "leftOperand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightOperand(value: ShaderDefineExpression): Self = StObject.set(x, "rightOperand", value.asInstanceOf[js.Any])
  }
}
