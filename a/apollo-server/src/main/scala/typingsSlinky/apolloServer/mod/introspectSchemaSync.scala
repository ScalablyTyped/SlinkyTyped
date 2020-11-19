package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.SyncExecutor
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "introspectSchemaSync")
@js.native
object introspectSchemaSync extends js.Object {
  
  def apply(executor: SyncExecutor): GraphQLSchema = js.native
  def apply(executor: SyncExecutor, context: Record[String, _]): GraphQLSchema = js.native
}
