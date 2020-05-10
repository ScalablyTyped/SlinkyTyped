package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointResponse extends js.Object {
  /**
    * EndpointArn returned from CreateEndpoint action.
    */
  var EndpointArn: js.UndefOr[String] = js.native
}

object CreateEndpointResponse {
  @scala.inline
  def apply(): CreateEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEndpointResponse]
  }
  @scala.inline
  implicit class CreateEndpointResponseOps[Self <: CreateEndpointResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(js.undefined)
        ret
    }
  }
  
}

