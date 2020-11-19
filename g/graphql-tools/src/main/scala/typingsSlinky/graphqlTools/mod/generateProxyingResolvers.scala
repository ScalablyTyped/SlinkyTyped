package typingsSlinky.graphqlTools.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-tools", "generateProxyingResolvers")
@js.native
object generateProxyingResolvers extends js.Object {
  
  def apply(subschemaOrSubschemaConfig: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): Record[String, Record[String, GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.native
  def apply(subschemaOrSubschemaConfig: SubschemaConfig, transforms: js.Array[Transform[Record[String, _]]]): Record[String, Record[String, GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.native
}
