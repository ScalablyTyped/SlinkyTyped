package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeliveryStreamOutput extends js.Object {
  /**
    * Information about the delivery stream.
    */
  var DeliveryStreamDescription: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamDescription = js.native
}

object DescribeDeliveryStreamOutput {
  @scala.inline
  def apply(DeliveryStreamDescription: DeliveryStreamDescription): DescribeDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal(DeliveryStreamDescription = DeliveryStreamDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeliveryStreamOutput]
  }
  @scala.inline
  implicit class DescribeDeliveryStreamOutputOps[Self <: DescribeDeliveryStreamOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStreamDescription(value: DeliveryStreamDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamDescription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

