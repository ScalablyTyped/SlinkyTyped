package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ASTValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueVariableNames", JSImport.Namespace)
@js.native
object uniqueVariableNamesMod extends js.Object {
  def UniqueVariableNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateVariableMessage(variableName: String): String = js.native
}

