package typingsSlinky.apolloServerCore.runHttpQueryMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloServerHttpResponse extends js.Object {
  var headers: js.UndefOr[Record[String, String]] = js.native
}

object ApolloServerHttpResponse {
  @scala.inline
  def apply(): ApolloServerHttpResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApolloServerHttpResponse]
  }
  @scala.inline
  implicit class ApolloServerHttpResponseOps[Self <: ApolloServerHttpResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
  }
  
}

