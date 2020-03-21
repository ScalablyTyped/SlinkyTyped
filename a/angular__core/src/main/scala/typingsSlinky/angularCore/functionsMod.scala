package typingsSlinky.angularCore

import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.ParenthesizedExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/utils/typescript/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  def isFunctionLikeDeclaration(node: Node): /* is typescript.typescript.FunctionLikeDeclaration */ Boolean = js.native
  def unwrapExpression(node: Expression): Expression = js.native
  def unwrapExpression(node: ParenthesizedExpression): Expression = js.native
}

