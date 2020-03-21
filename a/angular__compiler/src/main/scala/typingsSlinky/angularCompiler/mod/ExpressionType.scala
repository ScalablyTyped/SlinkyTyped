package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ExpressionType")
@js.native
class ExpressionType protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.ExpressionType {
  def this(value: typingsSlinky.angularCompiler.outputAstMod.Expression) = this()
  def this(value: typingsSlinky.angularCompiler.outputAstMod.Expression, modifiers: js.Array[TypeModifier]) = this()
  def this(
    value: typingsSlinky.angularCompiler.outputAstMod.Expression,
    modifiers: js.Array[TypeModifier],
    typeParams: js.Array[typingsSlinky.angularCompiler.outputAstMod.Type]
  ) = this()
  def this(
    value: typingsSlinky.angularCompiler.outputAstMod.Expression,
    modifiers: Null,
    typeParams: js.Array[typingsSlinky.angularCompiler.outputAstMod.Type]
  ) = this()
}

