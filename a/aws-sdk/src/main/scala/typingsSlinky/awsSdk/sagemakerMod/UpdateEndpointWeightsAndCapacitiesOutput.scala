package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointWeightsAndCapacitiesOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated endpoint.
    */
  var EndpointArn: typingsSlinky.awsSdk.sagemakerMod.EndpointArn = js.native
}

object UpdateEndpointWeightsAndCapacitiesOutput {
  @scala.inline
  def apply(EndpointArn: EndpointArn): UpdateEndpointWeightsAndCapacitiesOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesOutput]
  }
  @scala.inline
  implicit class UpdateEndpointWeightsAndCapacitiesOutputOps[Self <: UpdateEndpointWeightsAndCapacitiesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointArn(value: EndpointArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

