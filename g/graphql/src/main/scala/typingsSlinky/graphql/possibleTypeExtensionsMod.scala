package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/PossibleTypeExtensions", JSImport.Namespace)
@js.native
object possibleTypeExtensionsMod extends js.Object {
  def PossibleTypeExtensions(context: SDLValidationContext): ASTVisitor = js.native
  def extendingDifferentTypeKindMessage(typeName: String, kind: String): String = js.native
  def extendingUnknownTypeMessage(typeName: String, suggestedTypes: js.Array[String]): String = js.native
}

