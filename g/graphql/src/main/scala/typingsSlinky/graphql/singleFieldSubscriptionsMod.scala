package typingsSlinky.graphql

import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.validationContextMod.ASTValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/SingleFieldSubscriptions", JSImport.Namespace)
@js.native
object singleFieldSubscriptionsMod extends js.Object {
  def SingleFieldSubscriptions(context: ASTValidationContext): ASTVisitor = js.native
  def singleFieldOnlyMessage(name: Maybe[String]): String = js.native
}

