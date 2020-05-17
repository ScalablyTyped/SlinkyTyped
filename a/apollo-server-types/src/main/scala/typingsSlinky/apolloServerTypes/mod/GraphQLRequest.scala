package typingsSlinky.apolloServerTypes.mod

import typingsSlinky.apolloServerTypes.anon.PickRequesturlmethodheade
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLRequest extends js.Object {
  var extensions: js.UndefOr[Record[String, _]] = js.native
  var http: js.UndefOr[PickRequesturlmethodheade] = js.native
  var operationName: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
  var variables: js.UndefOr[VariableValues] = js.native
}

object GraphQLRequest {
  @scala.inline
  def apply(): GraphQLRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLRequest]
  }
  @scala.inline
  implicit class GraphQLRequestOps[Self <: GraphQLRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp(value: PickRequesturlmethodheade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: VariableValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

