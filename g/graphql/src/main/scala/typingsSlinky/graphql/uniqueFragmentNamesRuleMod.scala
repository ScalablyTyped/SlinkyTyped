package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ASTValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueFragmentNamesRule", JSImport.Namespace)
@js.native
object uniqueFragmentNamesRuleMod extends js.Object {
  def UniqueFragmentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
}

