package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointWeightsAndCapacitiesInput extends js.Object {
  /**
    * An object that provides new capacity and weight values for a variant.
    */
  var DesiredWeightsAndCapacities: DesiredWeightAndCapacityList = js.native
  /**
    * The name of an existing Amazon SageMaker endpoint.
    */
  var EndpointName: typingsSlinky.awsSdk.sagemakerMod.EndpointName = js.native
}

object UpdateEndpointWeightsAndCapacitiesInput {
  @scala.inline
  def apply(DesiredWeightsAndCapacities: DesiredWeightAndCapacityList, EndpointName: EndpointName): UpdateEndpointWeightsAndCapacitiesInput = {
    val __obj = js.Dynamic.literal(DesiredWeightsAndCapacities = DesiredWeightsAndCapacities.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesInput]
  }
  @scala.inline
  implicit class UpdateEndpointWeightsAndCapacitiesInputOps[Self <: UpdateEndpointWeightsAndCapacitiesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredWeightsAndCapacities(value: DesiredWeightAndCapacityList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredWeightsAndCapacities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointName(value: EndpointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

