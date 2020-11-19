package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsMock.typesMod.IMockServer
import typingsSlinky.graphqlToolsMock.typesMod.IMocks
import typingsSlinky.graphqlToolsUtils.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "mockServer")
@js.native
object mockServer extends js.Object {
  
  def apply(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def apply(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def apply(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def apply(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
}
