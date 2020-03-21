package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ASTValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/LoneAnonymousOperation", JSImport.Namespace)
@js.native
object loneAnonymousOperationMod extends js.Object {
  def LoneAnonymousOperation(context: ASTValidationContext): ASTVisitor = js.native
  def anonOperationNotAloneMessage(): String = js.native
}

