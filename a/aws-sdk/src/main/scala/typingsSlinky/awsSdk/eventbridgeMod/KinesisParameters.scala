package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisParameters extends js.Object {
  /**
    * The JSON path to be extracted from the event and used as the partition key. For more information, see Amazon Kinesis Streams Key Concepts in the Amazon Kinesis Streams Developer Guide.
    */
  var PartitionKeyPath: TargetPartitionKeyPath = js.native
}

object KinesisParameters {
  @scala.inline
  def apply(PartitionKeyPath: TargetPartitionKeyPath): KinesisParameters = {
    val __obj = js.Dynamic.literal(PartitionKeyPath = PartitionKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisParameters]
  }
  @scala.inline
  implicit class KinesisParametersOps[Self <: KinesisParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartitionKeyPath(value: TargetPartitionKeyPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionKeyPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

