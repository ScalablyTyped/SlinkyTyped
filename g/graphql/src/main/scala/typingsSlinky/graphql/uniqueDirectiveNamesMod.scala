package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueDirectiveNames", JSImport.Namespace)
@js.native
object uniqueDirectiveNamesMod extends js.Object {
  def UniqueDirectiveNames(context: SDLValidationContext): ASTVisitor = js.native
}

