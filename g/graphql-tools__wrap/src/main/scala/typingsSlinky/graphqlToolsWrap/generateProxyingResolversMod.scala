package typingsSlinky.graphqlToolsWrap

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.ICreateProxyingResolverOptions
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/generateProxyingResolvers", JSImport.Namespace)
@js.native
object generateProxyingResolversMod extends js.Object {
  def defaultCreateProxyingResolver(hasSchemaOperationTransformsTransformedSchema: ICreateProxyingResolverOptions): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def generateProxyingResolvers(subschemaOrSubschemaConfig: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): Record[String, Record[String, GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.native
  def generateProxyingResolvers(subschemaOrSubschemaConfig: SubschemaConfig, transforms: js.Array[Transform[Record[String, _]]]): Record[String, Record[String, GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.native
}

