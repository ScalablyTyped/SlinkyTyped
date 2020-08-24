package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.AsyncExecutor
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "introspectSchema")
@js.native
object introspectSchema extends js.Object {
  def apply(executor: AsyncExecutor): js.Promise[GraphQLSchema] = js.native
  def apply(executor: AsyncExecutor, context: Record[String, _]): js.Promise[GraphQLSchema] = js.native
}

