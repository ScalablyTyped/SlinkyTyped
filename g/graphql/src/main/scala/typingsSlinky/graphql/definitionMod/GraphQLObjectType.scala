package typingsSlinky.graphql.definitionMod

import typingsSlinky.graphql.anon.ExtensionASTNodes
import typingsSlinky.graphql.astMod.ObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.ObjectTypeExtensionNode
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/type/definition", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext] protected () extends js.Object {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext]) = this()
  
  var astNode: Maybe[ObjectTypeDefinitionNode] = js.native
  
  var description: Maybe[String] = js.native
  
  var extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]] = js.native
  
  var extensions: Maybe[GraphQLObjectTypeExtensions[TSource, TContext]] = js.native
  
  def getFields(): GraphQLFieldMap[_, TContext] = js.native
  
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
  
  def inspect(): String = js.native
  
  var isTypeOf: Maybe[GraphQLIsTypeOfFn[TSource, TContext]] = js.native
  
  var name: String = js.native
  
  def toConfig(): (GraphQLObjectTypeConfig[_, _]) with (ExtensionASTNodes[TSource, TContext]) = js.native
  
  def toJSON(): String = js.native
}
