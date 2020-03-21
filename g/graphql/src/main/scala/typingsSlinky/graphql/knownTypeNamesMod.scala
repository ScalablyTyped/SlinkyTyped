package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownTypeNames", JSImport.Namespace)
@js.native
object knownTypeNamesMod extends js.Object {
  def KnownTypeNames(context: ValidationContext): ASTVisitor = js.native
  def unknownTypeMessage(typeName: String, suggestedTypes: js.Array[String]): String = js.native
}

