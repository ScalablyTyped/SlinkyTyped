package typingsSlinky.graphqlExtensions

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext[TContext] extends js.Object {
  var context: TContext = js.native
  var operationName: js.UndefOr[String] = js.native
  var parsedQuery: js.UndefOr[DocumentNode] = js.native
  var persistedQueryHit: js.UndefOr[Boolean] = js.native
  var persistedQueryRegister: js.UndefOr[Boolean] = js.native
  var queryString: js.UndefOr[String] = js.native
  var request: PickRequesturlmethodheade = js.native
  var requestContext: GraphQLRequestContext[TContext] = js.native
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object AnonContext {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: PickRequesturlmethodheade,
    requestContext: GraphQLRequestContext[TContext]
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
    def withRequest(value: PickRequesturlmethodheade): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestContext(value: GraphQLRequestContext[TContext]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationName(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationName: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(js.undefined)
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
    def withPersistedQueryHit(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueryHit: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHit")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueryRegister(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryRegister")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueryRegister: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryRegister")(js.undefined)
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
    def withVariables(value: StringDictionary[js.Any]): Self[TContext] = {
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

