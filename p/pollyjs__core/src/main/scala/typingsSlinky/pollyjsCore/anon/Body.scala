package typingsSlinky.pollyjsCore.anon

import typingsSlinky.pollyjsCore.mod.Headers
import typingsSlinky.pollyjsCore.mod.MatchBy
import typingsSlinky.pollyjsCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  var body: js.UndefOr[Boolean | (MatchBy[_, _])] = js.native
  var headers: js.UndefOr[Boolean | Exclude | (MatchBy[Headers, Headers])] = js.native
  var method: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  var order: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[Boolean | (MatchBy[String, String]) | Hash] = js.native
}

object Body {
  @scala.inline
  def apply(): Body = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyFunction2(value: (_, /* req */ Request) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBody(value: Boolean | (MatchBy[_, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersFunction2(value: (Headers, /* req */ Request) => Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHeaders(value: Boolean | Exclude | (MatchBy[Headers, Headers])): Self = {
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
    @scala.inline
    def withMethodFunction2(value: (String, /* req */ Request) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMethod(value: Boolean | (MatchBy[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlFunction2(value: (String, /* req */ Request) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUrl(value: Boolean | (MatchBy[String, String]) | Hash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

