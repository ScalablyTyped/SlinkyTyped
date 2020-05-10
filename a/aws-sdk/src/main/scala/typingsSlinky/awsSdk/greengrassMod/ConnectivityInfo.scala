package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectivityInfo extends js.Object {
  /**
    * The endpoint for the Greengrass core. Can be an IP address or DNS.
    */
  var HostAddress: js.UndefOr[string] = js.native
  /**
    * The ID of the connectivity information.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Metadata for this endpoint.
    */
  var Metadata: js.UndefOr[string] = js.native
  /**
    * The port of the Greengrass core. Usually 8883.
    */
  var PortNumber: js.UndefOr[integer] = js.native
}

object ConnectivityInfo {
  @scala.inline
  def apply(): ConnectivityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectivityInfo]
  }
  @scala.inline
  implicit class ConnectivityInfoOps[Self <: ConnectivityInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostAddress(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPortNumber(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortNumber")(js.undefined)
        ret
    }
  }
  
}

