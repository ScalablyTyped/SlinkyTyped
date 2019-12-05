package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueArgumentNames", JSImport.Namespace)
@js.native
object validationRulesUniqueArgumentNamesMod extends js.Object {
  def UniqueArgumentNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateArgMessage(argName: String): String = js.native
}

