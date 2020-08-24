package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownArgumentNamesRule", JSImport.Namespace)
@js.native
object knownArgumentNamesRuleMod extends js.Object {
  def KnownArgumentNamesOnDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownArgumentNamesOnDirectivesRule(context: ValidationContext): ASTVisitor = js.native
  def KnownArgumentNamesRule(context: ValidationContext): ASTVisitor = js.native
}

