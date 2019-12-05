package typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod

import typingsSlinky.apolloDashServerDashTypes.Anon_ApiKeyHash
import typingsSlinky.apolloDashServerDashTypes.Anon_Cache
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServiceContext extends js.Object {
  var engine: Anon_ApiKeyHash
  var persistedQueries: js.UndefOr[Anon_Cache] = js.undefined
  var schema: GraphQLSchema
  var schemaHash: String
}

object GraphQLServiceContext {
  @scala.inline
  def apply(
    engine: Anon_ApiKeyHash,
    schema: GraphQLSchema,
    schemaHash: String,
    persistedQueries: Anon_Cache = null
  ): GraphQLServiceContext = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaHash = schemaHash.asInstanceOf[js.Any])
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLServiceContext]
  }
}

