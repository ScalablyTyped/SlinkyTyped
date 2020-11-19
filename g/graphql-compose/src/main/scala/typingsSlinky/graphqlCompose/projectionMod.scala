package typingsSlinky.graphqlCompose

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.FragmentDefinitionNode
import typingsSlinky.graphql.astMod.InlineFragmentNode
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/utils/projection", JSImport.Namespace)
@js.native
object projectionMod extends js.Object {
  
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
