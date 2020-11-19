package typingsSlinky.graphql.definitionMod

import typingsSlinky.graphql.anon.GraphQLUnionTypeConfigany
import typingsSlinky.graphql.anon.ReadonlyGraphQLUnionTypeC
import typingsSlinky.graphql.astMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.astMod.UnionTypeExtensionNode
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/type/definition", "GraphQLUnionType")
@js.native
class GraphQLUnionType protected ()
  extends GraphQLAbstractType
     with _GraphQLCompositeType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLOutputType
     with _GraphQLType {
  def this(config: ReadonlyGraphQLUnionTypeC) = this()
  
  var astNode: Maybe[UnionTypeDefinitionNode] = js.native
  
  var description: Maybe[String] = js.native
  
  var extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]] = js.native
  
  var extensions: Maybe[js.Object] = js.native
  
  def getTypes(): js.Array[GraphQLObjectType[_, _]] = js.native
  
  def inspect(): String = js.native
  
  var name: String = js.native
  
  var resolveType: Maybe[GraphQLTypeResolver[_, _]] = js.native
  
  def toConfig(): GraphQLUnionTypeConfigany = js.native
  
  def toJSON(): String = js.native
}
