package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ASTValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ExecutableDefinitions", JSImport.Namespace)
@js.native
object executableDefinitionsMod extends js.Object {
  def ExecutableDefinitions(context: ASTValidationContext): ASTVisitor = js.native
  def nonExecutableDefinitionMessage(defName: String): String = js.native
}

