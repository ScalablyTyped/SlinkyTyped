package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueFieldDefinitionNames", JSImport.Namespace)
@js.native
object uniqueFieldDefinitionNamesMod extends js.Object {
  def UniqueFieldDefinitionNames(context: SDLValidationContext): ASTVisitor = js.native
}

