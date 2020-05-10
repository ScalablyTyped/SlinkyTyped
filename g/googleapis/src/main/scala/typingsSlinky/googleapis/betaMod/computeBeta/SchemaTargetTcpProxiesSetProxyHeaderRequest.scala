package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetTcpProxiesSetProxyHeaderRequest extends js.Object {
  /**
    * The new type of proxy header to append before sending data to the
    * backend. NONE or PROXY_V1 are allowed.
    */
  var proxyHeader: js.UndefOr[String] = js.native
}

object SchemaTargetTcpProxiesSetProxyHeaderRequest {
  @scala.inline
  def apply(): SchemaTargetTcpProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetTcpProxiesSetProxyHeaderRequest]
  }
  @scala.inline
  implicit class SchemaTargetTcpProxiesSetProxyHeaderRequestOps[Self <: SchemaTargetTcpProxiesSetProxyHeaderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProxyHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyHeader")(js.undefined)
        ret
    }
  }
  
}

