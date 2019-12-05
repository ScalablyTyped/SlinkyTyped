package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUnusedFragments", JSImport.Namespace)
@js.native
object validationRulesNoUnusedFragmentsMod extends js.Object {
  def NoUnusedFragments(context: ValidationContext): ASTVisitor = js.native
  def unusedFragMessage(fragName: String): String = js.native
}

