package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerInstance extends js.Object {
  /**
    * The URL of the broker's ActiveMQ Web Console.
    */
  var ConsoleURL: js.UndefOr[string] = js.native
  /**
    * The broker's wire-level protocol endpoints.
    */
  var Endpoints: js.UndefOr[listOfString] = js.native
  /**
    * The IP address of the Elastic Network Interface (ENI) attached to the broker.
    */
  var IpAddress: js.UndefOr[string] = js.native
}

object BrokerInstance {
  @scala.inline
  def apply(): BrokerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerInstance]
  }
  @scala.inline
  implicit class BrokerInstanceOps[Self <: BrokerInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsoleURL(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsoleURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsoleURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsoleURL")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(js.undefined)
        ret
    }
  }
  
}

