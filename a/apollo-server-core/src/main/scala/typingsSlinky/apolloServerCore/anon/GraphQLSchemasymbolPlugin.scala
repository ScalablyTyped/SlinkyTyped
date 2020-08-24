package typingsSlinky.apolloServerCore.anon

import typingsSlinky.graphql.anon.GraphQLSchemaConfigtypesA
import typingsSlinky.graphql.anon.ReadonlyGraphQLSchemaConf
import typingsSlinky.graphql.astMod.SchemaDefinitionNode
import typingsSlinky.graphql.astMod.SchemaExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.directivesMod.GraphQLDirective
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.schemaMod.InterfaceImplementations
import typingsSlinky.graphql.schemaMod.TypeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type.GraphQLSchema & {[symbolPluginsEnabled] : boolean | undefined} */
@js.native
trait GraphQLSchemasymbolPlugin extends js.Object {
  var astNode: Maybe[SchemaDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]] = js.native
  var extensions: Maybe[js.Object] = js.native
  def getDirective(name: String): Maybe[GraphQLDirective] = js.native
  def getDirectives(): js.Array[GraphQLDirective] = js.native
  def getImplementations(interfaceType: GraphQLInterfaceType): InterfaceImplementations = js.native
  def getMutationType(): Maybe[GraphQLObjectType[_, _]] = js.native
  def getPossibleTypes(abstractType: GraphQLAbstractType): js.Array[GraphQLObjectType[_, _]] = js.native
  def getQueryType(): Maybe[GraphQLObjectType[_, _]] = js.native
  def getSubscriptionType(): Maybe[GraphQLObjectType[_, _]] = js.native
  def getType(name: String): Maybe[GraphQLNamedType] = js.native
  def getTypeMap(): TypeMap = js.native
  // @deprecated: use isSubType instead - will be removed in v16.
  def isPossibleType(abstractType: GraphQLAbstractType, possibleType: GraphQLObjectType[_, _]): Boolean = js.native
  def isSubType(abstractType: GraphQLAbstractType, maybeSubType: GraphQLNamedType): Boolean = js.native
  def toConfig(): GraphQLSchemaConfigtypesA = js.native
}

