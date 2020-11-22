package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/Processors/Expressions/index", JSImport.Namespace)
@js.native
object expressionsIndexMod extends js.Object {
  
  @js.native
  class ShaderDefineAndOperator ()
    extends typingsSlinky.babylonjs.shaderDefineAndOperatorMod.ShaderDefineAndOperator
  
  @js.native
  class ShaderDefineArithmeticOperator protected ()
    extends typingsSlinky.babylonjs.operatorsIndexMod.ShaderDefineArithmeticOperator {
    def this(define: String, operand: String, testValue: String) = this()
  }
  
  @js.native
  class ShaderDefineExpression ()
    extends typingsSlinky.babylonjs.shaderDefineExpressionMod.ShaderDefineExpression
  /* static members */
  @js.native
  object ShaderDefineExpression extends js.Object {
    
    var _OperatorPriority: js.Any = js.native
    
    var _Stack: js.Any = js.native
    
    def infixToPostfix(infix: String): js.Array[String] = js.native
    
    def postfixToInfix(postfix: js.Array[String]): String = js.native
  }
  
  @js.native
  class ShaderDefineIsDefinedOperator protected ()
    extends typingsSlinky.babylonjs.operatorsIndexMod.ShaderDefineIsDefinedOperator {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
  }
  
  @js.native
  class ShaderDefineOrOperator ()
    extends typingsSlinky.babylonjs.shaderDefineOrOperatorMod.ShaderDefineOrOperator
}
