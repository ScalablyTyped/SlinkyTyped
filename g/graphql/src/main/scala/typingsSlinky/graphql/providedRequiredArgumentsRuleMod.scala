package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/validation/rules/ProvidedRequiredArgumentsRule", JSImport.Namespace)
@js.native
object providedRequiredArgumentsRuleMod extends js.Object {
  
  def ProvidedRequiredArgumentsOnDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def ProvidedRequiredArgumentsOnDirectivesRule(context: ValidationContext): ASTVisitor = js.native
  
  def ProvidedRequiredArgumentsRule(context: ValidationContext): ASTVisitor = js.native
}
