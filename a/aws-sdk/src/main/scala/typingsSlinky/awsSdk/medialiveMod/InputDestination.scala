package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDestination extends js.Object {
  /**
    * The system-generated static IP address of endpoint.
  It remains fixed for the lifetime of the input.
    */
  var Ip: js.UndefOr[string] = js.native
  /**
    * The port number for the input.
    */
  var Port: js.UndefOr[string] = js.native
  /**
    * This represents the endpoint that the customer stream will be
  pushed to.
    */
  var Url: js.UndefOr[string] = js.native
  var Vpc: js.UndefOr[InputDestinationVpc] = js.native
}

object InputDestination {
  @scala.inline
  def apply(): InputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDestination]
  }
  @scala.inline
  implicit class InputDestinationOps[Self <: InputDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIp(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ip")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
    @scala.inline
    def withVpc(value: InputDestinationVpc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpc")(js.undefined)
        ret
    }
  }
  
}

