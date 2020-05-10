package typingsSlinky.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncProvider extends js.Object {
  var host: js.UndefOr[String] = js.native
  var isMetaMask: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  def sendAsync(request: js.Any, callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]): Unit = js.native
}

object AsyncProvider {
  @scala.inline
  def apply(sendAsync: (js.Any, js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]) => Unit): AsyncProvider = {
    val __obj = js.Dynamic.literal(sendAsync = js.Any.fromFunction2(sendAsync))
    __obj.asInstanceOf[AsyncProvider]
  }
  @scala.inline
  implicit class AsyncProviderOps[Self <: AsyncProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSendAsync(value: (js.Any, js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMetaMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMetaMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMetaMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMetaMask")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

