package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSubnetworksSetPrivateIpGoogleAccessRequest extends js.Object {
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.native
}

object SchemaSubnetworksSetPrivateIpGoogleAccessRequest {
  @scala.inline
  def apply(): SchemaSubnetworksSetPrivateIpGoogleAccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworksSetPrivateIpGoogleAccessRequest]
  }
  @scala.inline
  implicit class SchemaSubnetworksSetPrivateIpGoogleAccessRequestOps[Self <: SchemaSubnetworksSetPrivateIpGoogleAccessRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivateIpGoogleAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpGoogleAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpGoogleAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpGoogleAccess")(js.undefined)
        ret
    }
  }
  
}

