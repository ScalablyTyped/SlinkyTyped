package typingsSlinky.pulumiAws.inputMod.mq

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerInstance extends js.Object {
  var consoleUrl: js.UndefOr[Input[String]] = js.native
  var endpoints: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var ipAddress: js.UndefOr[Input[String]] = js.native
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
    def withConsoleUrl(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsoleUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
  }
  
}

