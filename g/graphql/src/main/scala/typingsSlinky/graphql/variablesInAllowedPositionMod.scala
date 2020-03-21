package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/VariablesInAllowedPosition", JSImport.Namespace)
@js.native
object variablesInAllowedPositionMod extends js.Object {
  def VariablesInAllowedPosition(context: ValidationContext): ASTVisitor = js.native
  def badVarPosMessage(varName: String, varType: String, expectedType: String): String = js.native
}

