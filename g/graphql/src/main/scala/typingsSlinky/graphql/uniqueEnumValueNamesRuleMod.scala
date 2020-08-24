package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueEnumValueNamesRule", JSImport.Namespace)
@js.native
object uniqueEnumValueNamesRuleMod extends js.Object {
  def UniqueEnumValueNamesRule(context: SDLValidationContext): ASTVisitor = js.native
}

