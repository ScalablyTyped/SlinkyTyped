package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsMock.typesMod.IMockOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "addMocksToSchema")
@js.native
object addMocksToSchema extends js.Object {
  def apply(hasSchemaMocksPreserveResolvers: IMockOptions): GraphQLSchema = js.native
}

