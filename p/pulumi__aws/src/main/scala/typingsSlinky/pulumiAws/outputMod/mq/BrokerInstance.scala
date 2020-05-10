package typingsSlinky.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerInstance extends js.Object {
  var consoleUrl: String = js.native
  var endpoints: js.Array[String] = js.native
  var ipAddress: String = js.native
}

object BrokerInstance {
  @scala.inline
  def apply(consoleUrl: String, endpoints: js.Array[String], ipAddress: String): BrokerInstance = {
    val __obj = js.Dynamic.literal(consoleUrl = consoleUrl.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerInstance]
  }
  @scala.inline
  implicit class BrokerInstanceOps[Self <: BrokerInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsoleUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

