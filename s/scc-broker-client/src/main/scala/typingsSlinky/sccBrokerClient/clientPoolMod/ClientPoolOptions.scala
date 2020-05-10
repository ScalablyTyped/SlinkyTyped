package typingsSlinky.sccBrokerClient.clientPoolMod

import typingsSlinky.jsonwebtoken.mod.Secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPoolOptions extends js.Object {
  var authKey: js.UndefOr[Secret] = js.native
  var clientCount: js.UndefOr[Double] = js.native
  var targetURI: String = js.native
}

object ClientPoolOptions {
  @scala.inline
  def apply(targetURI: String): ClientPoolOptions = {
    val __obj = js.Dynamic.literal(targetURI = targetURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPoolOptions]
  }
  @scala.inline
  implicit class ClientPoolOptionsOps[Self <: ClientPoolOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthKey(value: Secret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCount")(js.undefined)
        ret
    }
  }
  
}

