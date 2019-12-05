package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueFragmentNames", JSImport.Namespace)
@js.native
object validationRulesUniqueFragmentNamesMod extends js.Object {
  def UniqueFragmentNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateFragmentNameMessage(fragName: String): String = js.native
}

