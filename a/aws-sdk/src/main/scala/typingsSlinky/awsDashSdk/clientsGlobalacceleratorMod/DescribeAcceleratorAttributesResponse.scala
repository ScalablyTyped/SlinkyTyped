package typingsSlinky.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAcceleratorAttributesResponse extends js.Object {
  /**
    * The attributes of the accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[typingsSlinky.awsDashSdk.clientsGlobalacceleratorMod.AcceleratorAttributes] = js.native
}

object DescribeAcceleratorAttributesResponse {
  @scala.inline
  def apply(AcceleratorAttributes: AcceleratorAttributes = null): DescribeAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (AcceleratorAttributes != null) __obj.updateDynamic("AcceleratorAttributes")(AcceleratorAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorAttributesResponse]
  }
}

