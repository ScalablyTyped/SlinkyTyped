package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.SDLValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueOperationTypes", JSImport.Namespace)
@js.native
object validationRulesUniqueOperationTypesMod extends js.Object {
  def UniqueOperationTypes(context: SDLValidationContext): ASTVisitor = js.native
  def duplicateOperationTypeMessage(operation: String): String = js.native
  def existedOperationTypeMessage(operation: String): String = js.native
}

