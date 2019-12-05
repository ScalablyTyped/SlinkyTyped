package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueInputFieldNames", JSImport.Namespace)
@js.native
object validationRulesUniqueInputFieldNamesMod extends js.Object {
  def UniqueInputFieldNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateInputFieldMessage(fieldName: String): String = js.native
}

