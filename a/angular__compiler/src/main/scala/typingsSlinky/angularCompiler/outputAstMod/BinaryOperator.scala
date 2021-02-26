package typingsSlinky.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinaryOperator extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "BinaryOperator")
@js.native
object BinaryOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryOperator with Double] = js.native
  
  @js.native
  sealed trait And extends BinaryOperator
  /* 9 */ val And: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.And with Double = js.native
  
  @js.native
  sealed trait Bigger extends BinaryOperator
  /* 14 */ val Bigger: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.Bigger with Double = js.native
  
  @js.native
  sealed trait BiggerEquals extends BinaryOperator
  /* 15 */ val BiggerEquals: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.BiggerEquals with Double = js.native
  
  @js.native
  sealed trait BitwiseAnd extends BinaryOperator
  /* 11 */ val BitwiseAnd: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.BitwiseAnd with Double = js.native
  
  @js.native
  sealed trait Divide extends BinaryOperator
  /* 6 */ val Divide: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.Divide with Double = js.native
  
  @js.native
  sealed trait Equals extends BinaryOperator
  /* 0 */ val Equals: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.Equals with Double = js.native
  
  @js.native
  sealed trait Identical extends BinaryOperator
  /* 2 */ val Identical: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.Identical with Double = js.native
  
  @js.native
  sealed trait Lower extends BinaryOperator
  /* 12 */ val Lower: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.Lower with Double = js.native
  
  @js.native
  sealed trait LowerEquals extends BinaryOperator
  /* 13 */ val LowerEquals: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.LowerEquals with Double = js.native
  
  @js.native
  sealed trait Minus extends BinaryOperator
  /* 4 */ val Minus: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.Minus with Double = js.native
  
  @js.native
  sealed trait Modulo extends BinaryOperator
  /* 8 */ val Modulo: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.Modulo with Double = js.native
  
  @js.native
  sealed trait Multiply extends BinaryOperator
  /* 7 */ val Multiply: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.Multiply with Double = js.native
  
  @js.native
  sealed trait NotEquals extends BinaryOperator
  /* 1 */ val NotEquals: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.NotEquals with Double = js.native
  
  @js.native
  sealed trait NotIdentical extends BinaryOperator
  /* 3 */ val NotIdentical: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.NotIdentical with Double = js.native
  
  @js.native
  sealed trait Or extends BinaryOperator
  /* 10 */ val Or: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.Or with Double = js.native
  
  @js.native
  sealed trait Plus extends BinaryOperator
  /* 5 */ val Plus: typingsSlinky.angularCompiler.outputAstMod.BinaryOperator.Plus with Double = js.native
}
