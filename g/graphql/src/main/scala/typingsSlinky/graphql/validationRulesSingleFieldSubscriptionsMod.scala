package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/SingleFieldSubscriptions", JSImport.Namespace)
@js.native
object validationRulesSingleFieldSubscriptionsMod extends js.Object {
  def SingleFieldSubscriptions(context: ASTValidationContext): ASTVisitor = js.native
  def singleFieldOnlyMessage(name: Maybe[String]): String = js.native
}

