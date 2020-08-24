package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueDirectiveNamesRule", JSImport.Namespace)
@js.native
object uniqueDirectiveNamesRuleMod extends js.Object {
  def UniqueDirectiveNamesRule(context: SDLValidationContext): ASTVisitor = js.native
}

