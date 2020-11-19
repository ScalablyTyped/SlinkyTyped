package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/validation/rules/KnownDirectivesRule", JSImport.Namespace)
@js.native
object knownDirectivesRuleMod extends js.Object {
  
  def KnownDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: ValidationContext): ASTVisitor = js.native
}
