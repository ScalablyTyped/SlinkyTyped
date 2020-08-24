package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoFragmentCyclesRule", JSImport.Namespace)
@js.native
object noFragmentCyclesRuleMod extends js.Object {
  def NoFragmentCyclesRule(context: ValidationContext): ASTVisitor = js.native
}

