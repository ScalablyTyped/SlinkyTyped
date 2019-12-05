package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/VariablesInAllowedPosition", JSImport.Namespace)
@js.native
object validationRulesVariablesInAllowedPositionMod extends js.Object {
  def VariablesInAllowedPosition(context: ValidationContext): ASTVisitor = js.native
  def badVarPosMessage(varName: String, varType: String, expectedType: String): String = js.native
}

