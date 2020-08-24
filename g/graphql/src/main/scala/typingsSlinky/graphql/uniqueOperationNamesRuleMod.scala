package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ASTValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueOperationNamesRule", JSImport.Namespace)
@js.native
object uniqueOperationNamesRuleMod extends js.Object {
  def UniqueOperationNamesRule(context: ASTValidationContext): ASTVisitor = js.native
}

