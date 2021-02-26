package typingsSlinky.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnaryOperator extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "UnaryOperator")
@js.native
object UnaryOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnaryOperator with Double] = js.native
  
  @js.native
  sealed trait Minus extends UnaryOperator
  /* 0 */ val Minus: typingsSlinky.angularCompiler.outputAstMod.UnaryOperator.Minus with Double = js.native
  
  @js.native
  sealed trait Plus extends UnaryOperator
  /* 1 */ val Plus: typingsSlinky.angularCompiler.outputAstMod.UnaryOperator.Plus with Double = js.native
}
