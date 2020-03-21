package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ScalarLeafs", JSImport.Namespace)
@js.native
object scalarLeafsMod extends js.Object {
  def ScalarLeafs(context: ValidationContext): ASTVisitor = js.native
  def noSubselectionAllowedMessage(fieldName: String, `type`: String): String = js.native
  def requiredSubselectionMessage(fieldName: String, `type`: String): String = js.native
}

