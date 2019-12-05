package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUndefinedVariables", JSImport.Namespace)
@js.native
object validationRulesNoUndefinedVariablesMod extends js.Object {
  def NoUndefinedVariables(context: ValidationContext): ASTVisitor = js.native
  def undefinedVarMessage(varName: String, opName: Maybe[String]): String = js.native
}

