package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.IMockServer
import typingsSlinky.graphqlTools.interfacesMod.IMocks
import typingsSlinky.graphqlTools.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "mockServer")
@js.native
object mockServer extends js.Object {
  def apply(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def apply(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def apply(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def apply(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
}

