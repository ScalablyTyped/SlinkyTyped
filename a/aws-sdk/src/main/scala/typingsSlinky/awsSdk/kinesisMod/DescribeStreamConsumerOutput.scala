package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamConsumerOutput extends js.Object {
  /**
    * An object that represents the details of the consumer.
    */
  var ConsumerDescription: typingsSlinky.awsSdk.kinesisMod.ConsumerDescription = js.native
}

object DescribeStreamConsumerOutput {
  @scala.inline
  def apply(ConsumerDescription: ConsumerDescription): DescribeStreamConsumerOutput = {
    val __obj = js.Dynamic.literal(ConsumerDescription = ConsumerDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamConsumerOutput]
  }
  @scala.inline
  implicit class DescribeStreamConsumerOutputOps[Self <: DescribeStreamConsumerOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerDescription(value: ConsumerDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerDescription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

