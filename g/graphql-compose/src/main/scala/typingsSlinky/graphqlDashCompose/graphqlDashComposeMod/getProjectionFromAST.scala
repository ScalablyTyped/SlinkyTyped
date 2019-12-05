package typingsSlinky.graphqlDashCompose.graphqlDashComposeMod

import typingsSlinky.graphql.languageAstMod.FieldNode
import typingsSlinky.graphql.languageAstMod.FragmentDefinitionNode
import typingsSlinky.graphql.languageAstMod.InlineFragmentNode
import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
import typingsSlinky.graphqlDashCompose.libUtilsProjectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "getProjectionFromAST")
@js.native
object getProjectionFromAST extends js.Object {
  def apply(info: GraphQLResolveInfo): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: FieldNode): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: FragmentDefinitionNode): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: InlineFragmentNode): ProjectionType = js.native
}

