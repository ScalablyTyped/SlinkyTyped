package typingsSlinky.apolloGraphql.schemaMod

import typingsSlinky.apolloGraphql.resolverMapMod.GraphQLResolverMap
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema", "addResolversToSchema")
@js.native
object addResolversToSchema extends js.Object {
  def apply(schema: GraphQLSchema, resolvers: GraphQLResolverMap[_]): Unit = js.native
}

