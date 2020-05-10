package typingsSlinky.apolloGraphql.buildSchemaFromSDLMod

import typingsSlinky.apolloGraphql.resolverMapMod.GraphQLResolverMap
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLSchemaModule extends js.Object {
  var resolvers: js.UndefOr[GraphQLResolverMap[_]] = js.native
  var typeDefs: DocumentNode = js.native
}

object GraphQLSchemaModule {
  @scala.inline
  def apply(typeDefs: DocumentNode): GraphQLSchemaModule = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaModule]
  }
  @scala.inline
  implicit class GraphQLSchemaModuleOps[Self <: GraphQLSchemaModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeDefs(value: DocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvers(value: GraphQLResolverMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(js.undefined)
        ret
    }
  }
  
}

