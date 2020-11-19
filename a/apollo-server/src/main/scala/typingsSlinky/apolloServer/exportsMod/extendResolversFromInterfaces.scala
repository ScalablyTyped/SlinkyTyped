package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "extendResolversFromInterfaces")
@js.native
object extendResolversFromInterfaces extends js.Object {
  
  def apply(schema: GraphQLSchema, resolvers: IResolvers[_, _, Record[String, _], _]): IResolvers[_, _, Record[String, _], _] = js.native
}
