package typingsSlinky.apolloEngineReporting.anon

import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestContext[TContext] extends js.Object {
  var requestContext: GraphQLRequestContext[TContext] = js.native
}

object RequestContext {
  @scala.inline
  def apply[TContext](requestContext: GraphQLRequestContext[TContext]): RequestContext[TContext] = {
    val __obj = js.Dynamic.literal(requestContext = requestContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestContext[TContext]]
  }
  @scala.inline
  implicit class RequestContextOps[Self[tcontext] <: RequestContext[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withRequestContext(value: GraphQLRequestContext[TContext]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

