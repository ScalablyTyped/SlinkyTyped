package typingsSlinky.pollyjsCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pollyjsCore.mod.MatchBy
import typingsSlinky.pollyjsCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHash extends js.Object {
  var hash: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  var hostname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  var password: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  var pathname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  var port: js.UndefOr[Boolean | (MatchBy[Double, Double])] = js.native
  var protocol: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  var query: js.UndefOr[Boolean | (MatchBy[StringDictionary[_], StringDictionary[_]])] = js.native
  var username: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
}

object AnonHash {
  @scala.inline
  def apply(): AnonHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHash]
  }
  @scala.inline
  implicit class AnonHashOps[Self <: AnonHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashFunction2(value: (String, /* req */ Request) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHash(value: Boolean | (MatchBy[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withHostnameFunction2(value: (String, /* req */ Request) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHostname(value: Boolean | (MatchBy[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordFunction2(value: (String, /* req */ Request) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPassword(value: Boolean | (MatchBy[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPathnameFunction2(value: (String, /* req */ Request) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPathname(value: Boolean | (MatchBy[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(js.undefined)
        ret
    }
    @scala.inline
    def withPortFunction2(value: (Double, /* req */ Request) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPort(value: Boolean | (MatchBy[Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolFunction2(value: (String, /* req */ Request) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProtocol(value: Boolean | (MatchBy[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryFunction2(value: (StringDictionary[_], /* req */ Request) => StringDictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withQuery(value: Boolean | (MatchBy[StringDictionary[_], StringDictionary[_]])): Self = {
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
    def withUsernameFunction2(value: (String, /* req */ Request) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUsername(value: Boolean | (MatchBy[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

