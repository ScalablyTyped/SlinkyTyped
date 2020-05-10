package typingsSlinky.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSLoginEventArguement extends js.Object {
  var authResponse: js.UndefOr[HelloJSAuthResponse] = js.native
  var error: js.UndefOr[js.Error] = js.native
  var network: String = js.native
}

object HelloJSLoginEventArguement {
  @scala.inline
  def apply(network: String): HelloJSLoginEventArguement = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSLoginEventArguement]
  }
  @scala.inline
  implicit class HelloJSLoginEventArguementOps[Self <: HelloJSLoginEventArguement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthResponse(value: HelloJSAuthResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

