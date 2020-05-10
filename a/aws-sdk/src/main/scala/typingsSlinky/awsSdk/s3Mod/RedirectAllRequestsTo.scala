package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectAllRequestsTo extends js.Object {
  /**
    * Name of the host where requests are redirected.
    */
  var HostName: typingsSlinky.awsSdk.s3Mod.HostName = js.native
  /**
    * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var Protocol: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Protocol] = js.native
}

object RedirectAllRequestsTo {
  @scala.inline
  def apply(HostName: HostName): RedirectAllRequestsTo = {
    val __obj = js.Dynamic.literal(HostName = HostName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectAllRequestsTo]
  }
  @scala.inline
  implicit class RedirectAllRequestsToOps[Self <: RedirectAllRequestsTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostName(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: Protocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
  }
  
}

