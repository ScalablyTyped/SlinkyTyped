package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyEndpointResponse extends js.Object {
  /**
    * The modified endpoint.
    */
  var Endpoint: js.UndefOr[typingsSlinky.awsSdk.dmsMod.Endpoint] = js.native
}

object ModifyEndpointResponse {
  @scala.inline
  def apply(): ModifyEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEndpointResponse]
  }
  @scala.inline
  implicit class ModifyEndpointResponseOps[Self <: ModifyEndpointResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
  }
  
}

