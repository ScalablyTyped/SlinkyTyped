package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.anon.Name
import typingsSlinky.graphqlTools.interfacesMod.IResolvers
import typingsSlinky.graphqlTools.interfacesMod.Operation
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/resolvers", JSImport.Namespace)
@js.native
object resolversMod extends js.Object {
  def generateMappingFromObjectType(`type`: GraphQLObjectType[_, _, StringDictionary[_]], operation: Operation): StringDictionary[Name] = js.native
  def generateProxyingResolvers(targetSchema: GraphQLSchema, transforms: js.Array[Transform], mapping: Mapping): IResolvers[_, _] = js.native
  def generateSimpleMapping(targetSchema: GraphQLSchema): Mapping = js.native
  type Mapping = StringDictionary[StringDictionary[Name]]
}

