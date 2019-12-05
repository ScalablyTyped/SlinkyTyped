package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueVariableNames", JSImport.Namespace)
@js.native
object validationRulesUniqueVariableNamesMod extends js.Object {
  def UniqueVariableNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateVariableMessage(variableName: String): String = js.native
}

