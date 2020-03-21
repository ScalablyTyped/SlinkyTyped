package typingsSlinky.graphql

import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUndefinedVariables", JSImport.Namespace)
@js.native
object noUndefinedVariablesMod extends js.Object {
  def NoUndefinedVariables(context: ValidationContext): ASTVisitor = js.native
  def undefinedVarMessage(varName: String, opName: Maybe[String]): String = js.native
}

