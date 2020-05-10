package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsOutputUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream where you want to write the output.
    */
  var ResourceARNUpdate: ResourceARN = js.native
}

object KinesisStreamsOutputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisStreamsOutputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsOutputUpdate]
  }
  @scala.inline
  implicit class KinesisStreamsOutputUpdateOps[Self <: KinesisStreamsOutputUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceARNUpdate(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARNUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

