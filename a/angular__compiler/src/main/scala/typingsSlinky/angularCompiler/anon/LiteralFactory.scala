package typingsSlinky.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiteralFactory extends StObject {
  
  var literalFactory: typingsSlinky.angularCompiler.outputAstMod.Expression = js.native
  
  var literalFactoryArguments: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression] = js.native
}
object LiteralFactory {
  
  @scala.inline
  def apply(
    literalFactory: typingsSlinky.angularCompiler.outputAstMod.Expression,
    literalFactoryArguments: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression]
  ): LiteralFactory = {
    val __obj = js.Dynamic.literal(literalFactory = literalFactory.asInstanceOf[js.Any], literalFactoryArguments = literalFactoryArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralFactory]
  }
  
  @scala.inline
  implicit class LiteralFactoryMutableBuilder[Self <: LiteralFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLiteralFactory(value: typingsSlinky.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "literalFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteralFactoryArguments(value: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression]): Self = StObject.set(x, "literalFactoryArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteralFactoryArgumentsVarargs(value: typingsSlinky.angularCompiler.outputAstMod.Expression*): Self = StObject.set(x, "literalFactoryArguments", js.Array(value :_*))
  }
}
