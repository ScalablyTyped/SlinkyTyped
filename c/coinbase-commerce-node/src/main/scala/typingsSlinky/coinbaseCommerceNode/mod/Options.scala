package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.anon.Dictkey
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.DELETE
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.GET
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.POST
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var body: String = js.native
  var headers: Dictkey = js.native
  var method: GET | POST | DELETE | PUT = js.native
  var timeout: Double = js.native
  var url: String = js.native
}

object Options {
  @scala.inline
  def apply(body: String, headers: Dictkey, method: GET | POST | DELETE | PUT, timeout: Double, url: String): Options = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: GET | POST | DELETE | PUT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

