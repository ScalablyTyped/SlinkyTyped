package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTransitGatewayMulticastGroupSourcesResult extends js.Object {
  /**
    * Information about the transit gateway multicast group sources.
    */
  var RegisteredMulticastGroupSources: js.UndefOr[TransitGatewayMulticastRegisteredGroupSources] = js.native
}

object RegisterTransitGatewayMulticastGroupSourcesResult {
  @scala.inline
  def apply(): RegisterTransitGatewayMulticastGroupSourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTransitGatewayMulticastGroupSourcesResult]
  }
  @scala.inline
  implicit class RegisterTransitGatewayMulticastGroupSourcesResultOps[Self <: RegisterTransitGatewayMulticastGroupSourcesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisteredMulticastGroupSources(value: TransitGatewayMulticastRegisteredGroupSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredMulticastGroupSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredMulticastGroupSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredMulticastGroupSources")(js.undefined)
        ret
    }
  }
  
}

