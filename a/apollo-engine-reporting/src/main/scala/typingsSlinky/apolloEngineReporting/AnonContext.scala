package typingsSlinky.apolloEngineReporting

import typingsSlinky.apolloEngineReporting.apolloEngineReportingStrings.metrics
import typingsSlinky.apolloEngineReporting.apolloEngineReportingStrings.queryHash
import typingsSlinky.apolloServerEnv.mod.Request
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.apolloServerTypes.mod.WithRequired
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext[TContext] extends js.Object {
  var context: TContext = js.native
  var extensions: js.UndefOr[Record[String, _]] = js.native
  var parsedQuery: js.UndefOr[DocumentNode] = js.native
  var queryString: js.UndefOr[String] = js.native
  var request: Request = js.native
  var requestContext: WithRequired[GraphQLRequestContext[TContext], metrics | queryHash] = js.native
  var variables: js.UndefOr[Record[String, _]] = js.native
}

object AnonContext {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: Request,
    requestContext: WithRequired[GraphQLRequestContext[TContext], metrics | queryHash]
  ): AnonContext[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext[TContext]]
  }
  @scala.inline
  implicit class AnonContextOps[Self[tcontext] <: AnonContext[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
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
    def withRequest(value: Request): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestContext(value: WithRequired[GraphQLRequestContext[TContext], metrics | queryHash]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: Record[String, _]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withParsedQuery(value: DocumentNode): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsedQuery: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryString(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryString: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: Record[String, _]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

