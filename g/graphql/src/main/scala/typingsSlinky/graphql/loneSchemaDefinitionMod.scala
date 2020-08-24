package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/LoneSchemaDefinition", JSImport.Namespace)
@js.native
object loneSchemaDefinitionMod extends js.Object {
  def LoneSchemaDefinition(context: SDLValidationContext): ASTVisitor = js.native
}

