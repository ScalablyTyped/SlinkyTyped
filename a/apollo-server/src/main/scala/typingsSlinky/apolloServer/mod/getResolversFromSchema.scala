package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "getResolversFromSchema")
@js.native
object getResolversFromSchema extends js.Object {
  
  def apply(schema: GraphQLSchema): IResolvers[_, _, Record[String, _], _] = js.native
}
