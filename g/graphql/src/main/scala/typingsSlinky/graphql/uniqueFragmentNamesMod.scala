package typingsSlinky.graphql

import typingsSlinky.graphql.validationContextMod.ASTValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueFragmentNames", JSImport.Namespace)
@js.native
object uniqueFragmentNamesMod extends js.Object {
  def UniqueFragmentNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateFragmentNameMessage(fragName: String): String = js.native
}

