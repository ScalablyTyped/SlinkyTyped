package typingsSlinky.graphql.definitionMod

import typingsSlinky.graphql.anon.GraphQLInputObjectTypeCon
import typingsSlinky.graphql.anon.ReadonlyGraphQLInputObjec
import typingsSlinky.graphql.astMod.InputObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/type/definition", "GraphQLInputObjectType")
@js.native
class GraphQLInputObjectType protected ()
  extends _GraphQLInputType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLType {
  def this(config: ReadonlyGraphQLInputObjec) = this()
  
  var astNode: Maybe[InputObjectTypeDefinitionNode] = js.native
  
  var description: Maybe[String] = js.native
  
  var extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]] = js.native
  
  var extensions: Maybe[js.Object] = js.native
  
  def getFields(): GraphQLInputFieldMap = js.native
  
  def inspect(): String = js.native
  
  var name: String = js.native
  
  def toConfig(): GraphQLInputObjectTypeCon = js.native
  
  def toJSON(): String = js.native
}
