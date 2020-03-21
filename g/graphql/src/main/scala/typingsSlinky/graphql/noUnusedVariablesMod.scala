package typingsSlinky.graphql

import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUnusedVariables", JSImport.Namespace)
@js.native
object noUnusedVariablesMod extends js.Object {
  def NoUnusedVariables(context: ValidationContext): ASTVisitor = js.native
  def unusedVariableMessage(varName: String, opName: Maybe[String]): String = js.native
}

