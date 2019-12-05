package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/LoneAnonymousOperation", JSImport.Namespace)
@js.native
object validationRulesLoneAnonymousOperationMod extends js.Object {
  def LoneAnonymousOperation(context: ASTValidationContext): ASTVisitor = js.native
  def anonOperationNotAloneMessage(): String = js.native
}

