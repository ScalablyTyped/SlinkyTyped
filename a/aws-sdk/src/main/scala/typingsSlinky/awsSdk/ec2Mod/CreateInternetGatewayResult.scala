package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInternetGatewayResult extends js.Object {
  /**
    * Information about the internet gateway.
    */
  var InternetGateway: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InternetGateway] = js.native
}

object CreateInternetGatewayResult {
  @scala.inline
  def apply(): CreateInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInternetGatewayResult]
  }
  @scala.inline
  implicit class CreateInternetGatewayResultOps[Self <: CreateInternetGatewayResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInternetGateway(value: InternetGateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternetGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternetGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternetGateway")(js.undefined)
        ret
    }
  }
  
}

