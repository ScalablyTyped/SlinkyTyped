package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "addErrorLoggingToSchema")
@js.native
object addErrorLoggingToSchema extends js.Object {
  def apply(schema: GraphQLSchema, logger: ILogger): Unit = js.native
}

