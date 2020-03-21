package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueTypeNames", JSImport.Namespace)
@js.native
object uniqueTypeNamesMod extends js.Object {
  def UniqueTypeNames(context: SDLValidationContext): ASTVisitor = js.native
  def duplicateTypeNameMessage(typeName: String): String = js.native
  def existedTypeNameMessage(typeName: String): String = js.native
}

