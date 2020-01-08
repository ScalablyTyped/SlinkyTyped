package typingsSlinky.graphqlDashCompose

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.languageAstMod.FieldNode
import typingsSlinky.graphql.languageAstMod.FragmentDefinitionNode
import typingsSlinky.graphql.languageAstMod.InlineFragmentNode
import typingsSlinky.graphql.typeDefinitionMod.GraphQLOutputType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/projection", JSImport.Namespace)
@js.native
object libUtilsProjectionMod extends js.Object {
  def extendByFieldProjection(returnType: GraphQLOutputType, projection: ProjectionType): ProjectionType = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo): StringDictionary[Boolean] = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo, fieldNodes: FieldNode): StringDictionary[Boolean] = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo, fieldNodes: FragmentDefinitionNode): StringDictionary[Boolean] = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo, fieldNodes: InlineFragmentNode): StringDictionary[Boolean] = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo): ProjectionType = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo, fieldNode: FieldNode): ProjectionType = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo, fieldNode: FragmentDefinitionNode): ProjectionType = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo, fieldNode: InlineFragmentNode): ProjectionType = js.native
  type ProjectionNode = StringDictionary[js.Any]
  type ProjectionType = StringDictionary[js.Any]
}

