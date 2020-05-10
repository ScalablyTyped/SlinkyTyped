package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsOutput extends js.Object {
  /**
    * The ARN of the destination Kinesis data stream to write to.
    */
  var ResourceARN: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ResourceARN = js.native
}

object KinesisStreamsOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN): KinesisStreamsOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsOutput]
  }
  @scala.inline
  implicit class KinesisStreamsOutputOps[Self <: KinesisStreamsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

