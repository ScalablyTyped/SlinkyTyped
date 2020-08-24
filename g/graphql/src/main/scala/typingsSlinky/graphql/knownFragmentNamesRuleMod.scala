package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownFragmentNamesRule", JSImport.Namespace)
@js.native
object knownFragmentNamesRuleMod extends js.Object {
  def KnownFragmentNamesRule(context: ValidationContext): ASTVisitor = js.native
}

