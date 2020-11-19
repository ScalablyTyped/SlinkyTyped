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
