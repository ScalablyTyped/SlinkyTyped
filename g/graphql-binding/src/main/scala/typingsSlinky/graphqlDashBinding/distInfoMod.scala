package typingsSlinky.graphqlDashBinding

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLObjectType
import typingsSlinky.graphql.graphqlMod.GraphQLScalarType
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.typeDefinitionMod.GraphQLOutputType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
import typingsSlinky.graphqlDashBinding.distTypesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/info", JSImport.Namespace)
@js.native
object distInfoMod extends js.Object {
  def addPath(prev: js.Any, key: js.Any): Anon_Key = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: String): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: DocumentNode): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: GraphQLResolveInfo): GraphQLResolveInfo = js.native
  def buildInfoForAllScalars(rootFieldName: String, schema: GraphQLSchema, operation: Operation): GraphQLResolveInfo = js.native
  def buildInfoFromFragment(rootFieldName: String, schema: GraphQLSchema, operation: Operation, query: String): GraphQLResolveInfo = js.native
  def getDeepType(`type`: GraphQLOutputType): (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLScalarType = js.native
  def makeSubInfo(info: GraphQLResolveInfo, path: String): GraphQLResolveInfo | Null = js.native
  def makeSubInfo(info: GraphQLResolveInfo, path: String, fragment: String): GraphQLResolveInfo | Null = js.native
}

