package typingsSlinky.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterClientAuthentication extends js.Object {
  /**
    * Configuration block for specifying TLS client authentication. See below.
    */
  var tls: js.UndefOr[ClusterClientAuthenticationTls] = js.native
}

object ClusterClientAuthentication {
  @scala.inline
  def apply(): ClusterClientAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterClientAuthentication]
  }
  @scala.inline
  implicit class ClusterClientAuthenticationOps[Self <: ClusterClientAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTls(value: ClusterClientAuthenticationTls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
  }
  
}

