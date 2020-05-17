package typingsSlinky.graphql.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.anon.GraphQLSchemaConfigtypesA
import typingsSlinky.graphql.astMod.SchemaDefinitionNode
import typingsSlinky.graphql.astMod.SchemaExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.directivesMod.GraphQLDirective
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/schema", "GraphQLSchema")
@js.native
class GraphQLSchema protected () extends js.Object {
  def this(config: GraphQLSchemaConfig) = this()
  var astNode: Maybe[SchemaDefinitionNode] = js.native
  var extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  def getDirective(name: String): Maybe[GraphQLDirective] = js.native
  def getDirectives(): js.Array[GraphQLDirective] = js.native
  def getMutationType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getPossibleTypes(abstractType: GraphQLAbstractType): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getQueryType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getSubscriptionType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getType(name: String): Maybe[GraphQLNamedType] = js.native
  def getTypeMap(): TypeMap = js.native
  def isPossibleType(abstractType: GraphQLAbstractType, possibleType: GraphQLObjectType[_, _, StringDictionary[_]]): Boolean = js.native
  def toConfig(): GraphQLSchemaConfigtypesA = js.native
}

