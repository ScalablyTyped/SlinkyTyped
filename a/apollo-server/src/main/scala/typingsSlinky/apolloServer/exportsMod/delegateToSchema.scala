package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.IDelegateToSchemaOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "delegateToSchema")
@js.native
object delegateToSchema extends js.Object {
  
  def apply(options: GraphQLSchema): js.Any = js.native
  def apply(options: IDelegateToSchemaOptions[Record[String, _], Record[String, _]]): js.Any = js.native
}
