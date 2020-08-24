package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueTypeNamesRule", JSImport.Namespace)
@js.native
object uniqueTypeNamesRuleMod extends js.Object {
  def UniqueTypeNamesRule(context: SDLValidationContext): ASTVisitor = js.native
}

