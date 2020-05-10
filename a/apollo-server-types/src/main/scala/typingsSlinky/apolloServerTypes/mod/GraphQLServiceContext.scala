package typingsSlinky.apolloServerTypes.mod

import typingsSlinky.apolloServerTypes.AnonApiKeyHash
import typingsSlinky.apolloServerTypes.AnonCache
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLServiceContext extends js.Object {
  var engine: AnonApiKeyHash = js.native
  var persistedQueries: js.UndefOr[AnonCache] = js.native
  var schema: GraphQLSchema = js.native
  var schemaHash: String = js.native
}

object GraphQLServiceContext {
  @scala.inline
  def apply(engine: AnonApiKeyHash, schema: GraphQLSchema, schemaHash: String): GraphQLServiceContext = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaHash = schemaHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLServiceContext]
  }
  @scala.inline
  implicit class GraphQLServiceContextOps[Self <: GraphQLServiceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngine(value: AnonApiKeyHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistedQueries(value: AnonCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueries")(js.undefined)
        ret
    }
  }
  
}

