package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/validation/rules/KnownTypeNamesRule", JSImport.Namespace)
@js.native
object knownTypeNamesRuleMod extends js.Object {
  
  def KnownTypeNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownTypeNamesRule(context: ValidationContext): ASTVisitor = js.native
}
