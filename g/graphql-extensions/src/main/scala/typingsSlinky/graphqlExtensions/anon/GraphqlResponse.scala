package typingsSlinky.graphqlExtensions.anon

import typingsSlinky.apolloServerTypes.mod.GraphQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphqlResponse[TContext] extends js.Object {
  var context: TContext = js.native
  var graphqlResponse: GraphQLResponse = js.native
}

object GraphqlResponse {
  @scala.inline
  def apply[TContext](context: TContext, graphqlResponse: GraphQLResponse): GraphqlResponse[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], graphqlResponse = graphqlResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphqlResponse[TContext]]
  }
  @scala.inline
  implicit class GraphqlResponseOps[Self[tcontext] <: GraphqlResponse[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withContext(value: TContext): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphqlResponse(value: GraphQLResponse): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphqlResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

