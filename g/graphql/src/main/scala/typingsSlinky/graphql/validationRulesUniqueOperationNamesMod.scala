package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueOperationNames", JSImport.Namespace)
@js.native
object validationRulesUniqueOperationNamesMod extends js.Object {
  def UniqueOperationNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateOperationNameMessage(operationName: String): String = js.native
}

