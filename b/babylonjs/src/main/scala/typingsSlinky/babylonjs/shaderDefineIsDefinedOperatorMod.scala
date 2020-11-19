package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.shaderDefineExpressionMod.ShaderDefineExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/Processors/Expressions/Operators/shaderDefineIsDefinedOperator", JSImport.Namespace)
@js.native
object shaderDefineIsDefinedOperatorMod extends js.Object {
  
  @js.native
  class ShaderDefineIsDefinedOperator protected () extends ShaderDefineExpression {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
    
    var define: String = js.native
    
    var not: Boolean = js.native
  }
}
