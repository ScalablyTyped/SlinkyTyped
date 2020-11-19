package typingsSlinky.graphqlBinding

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLScalarType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlBinding.anon.Key
import typingsSlinky.graphqlBinding.distTypesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-binding/dist/info", JSImport.Namespace)
@js.native
object infoMod extends js.Object {
  
  def addPath(prev: js.Any, key: js.Any): Key = js.native
  
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: String): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: DocumentNode): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: GraphQLResolveInfo): GraphQLResolveInfo = js.native
  
  def buildInfoForAllScalars(rootFieldName: String, schema: GraphQLSchema, operation: Operation): GraphQLResolveInfo = js.native
  
  def buildInfoFromFragment(rootFieldName: String, schema: GraphQLSchema, operation: Operation, query: String): GraphQLResolveInfo = js.native
  
  def getDeepType(`type`: GraphQLOutputType): (GraphQLObjectType[_, _]) | GraphQLScalarType = js.native
  
  def makeSubInfo(info: GraphQLResolveInfo, path: String): GraphQLResolveInfo | Null = js.native
  def makeSubInfo(info: GraphQLResolveInfo, path: String, fragment: String): GraphQLResolveInfo | Null = js.native
}
