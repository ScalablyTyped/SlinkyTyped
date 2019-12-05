package typingsSlinky.graphql.validationValidationContextMod

import typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.languageAstMod.FragmentDefinitionNode
import typingsSlinky.graphql.languageAstMod.FragmentSpreadNode
import typingsSlinky.graphql.languageAstMod.OperationDefinitionNode
import typingsSlinky.graphql.languageAstMod.SelectionSetNode
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "ASTValidationContext")
@js.native
class ASTValidationContext protected () extends js.Object {
  def this(ast: DocumentNode) = this()
  def getDocument(): DocumentNode = js.native
  def getErrors(): js.Array[GraphQLError] = js.native
  def getFragment(name: String): Maybe[FragmentDefinitionNode] = js.native
  def getFragmentSpreads(node: SelectionSetNode): js.Array[FragmentSpreadNode] = js.native
  def getRecursivelyReferencedFragments(operation: OperationDefinitionNode): js.Array[FragmentDefinitionNode] = js.native
  def reportError(error: GraphQLError): js.UndefOr[scala.Nothing] = js.native
}

