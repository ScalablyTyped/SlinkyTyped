package typingsSlinky.apolloServerCore.runHttpQueryMod

import typingsSlinky.apolloServerCore.anon.PickRequesturlmethodheade
import typingsSlinky.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloServerEnv.typescriptUtilityTypesMod.ValueOrPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpQueryRequest extends js.Object {
  var method: String = js.native
  var options: (GraphQLServerOptions[Record[String, _], _]) | (js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]]) = js.native
  var query: (Record[String, _]) | (js.Array[Record[String, _]]) = js.native
  var request: PickRequesturlmethodheade = js.native
}

object HttpQueryRequest {
  @scala.inline
  def apply(
    method: String,
    options: (GraphQLServerOptions[Record[String, _], _]) | (js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]]),
    query: (Record[String, _]) | (js.Array[Record[String, _]]),
    request: PickRequesturlmethodheade
  ): HttpQueryRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpQueryRequest]
  }
  @scala.inline
  implicit class HttpQueryRequestOps[Self <: HttpQueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsFunction1(value: /* repeated */ js.Any => ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(
      value: (GraphQLServerOptions[Record[String, _], _]) | (js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: (Record[String, _]) | (js.Array[Record[String, _]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: PickRequesturlmethodheade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

