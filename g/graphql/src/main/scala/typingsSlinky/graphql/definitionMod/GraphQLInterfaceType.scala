package typingsSlinky.graphql.definitionMod

import typingsSlinky.graphql.anon.GraphQLInterfaceTypeConfi
import typingsSlinky.graphql.anon.ReadonlyGraphQLInterfaceT
import typingsSlinky.graphql.astMod.InterfaceTypeDefinitionNode
import typingsSlinky.graphql.astMod.InterfaceTypeExtensionNode
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/type/definition", "GraphQLInterfaceType")
@js.native
class GraphQLInterfaceType protected ()
  extends GraphQLAbstractType
     with _GraphQLCompositeType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLOutputType
     with _GraphQLType {
  def this(config: ReadonlyGraphQLInterfaceT) = this()
  
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.native
  
  var description: Maybe[String] = js.native
  
  var extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]] = js.native
  
  var extensions: Maybe[js.Object] = js.native
  
  def getFields(): GraphQLFieldMap[_, _] = js.native
  
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
  
  def inspect(): String = js.native
  
  var name: String = js.native
  
  var resolveType: Maybe[GraphQLTypeResolver[_, _]] = js.native
  
  def toConfig(): GraphQLInterfaceTypeConfi = js.native
  
  def toJSON(): String = js.native
}
