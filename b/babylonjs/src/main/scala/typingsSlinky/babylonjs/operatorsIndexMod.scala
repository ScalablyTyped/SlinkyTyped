package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsIndexMod {
  
  @JSImport("babylonjs/Engines/Processors/Expressions/Operators/index", "ShaderDefineAndOperator")
  @js.native
  class ShaderDefineAndOperator ()
    extends typingsSlinky.babylonjs.shaderDefineAndOperatorMod.ShaderDefineAndOperator
  
  @JSImport("babylonjs/Engines/Processors/Expressions/Operators/index", "ShaderDefineArithmeticOperator")
  @js.native
  class ShaderDefineArithmeticOperator protected ()
    extends typingsSlinky.babylonjs.shaderDefineArithmeticOperatorMod.ShaderDefineArithmeticOperator {
    def this(define: String, operand: String, testValue: String) = this()
  }
  
  @JSImport("babylonjs/Engines/Processors/Expressions/Operators/index", "ShaderDefineIsDefinedOperator")
  @js.native
  class ShaderDefineIsDefinedOperator protected ()
    extends typingsSlinky.babylonjs.shaderDefineIsDefinedOperatorMod.ShaderDefineIsDefinedOperator {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
  }
  
  @JSImport("babylonjs/Engines/Processors/Expressions/Operators/index", "ShaderDefineOrOperator")
  @js.native
  class ShaderDefineOrOperator ()
    extends typingsSlinky.babylonjs.shaderDefineOrOperatorMod.ShaderDefineOrOperator
}
