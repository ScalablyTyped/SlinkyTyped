package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceDescription extends js.Object {
  /**
    * The KinesisStreamSourceDescription value for the source Kinesis data stream.
    */
  var KinesisStreamSourceDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.KinesisStreamSourceDescription] = js.native
}

object SourceDescription {
  @scala.inline
  def apply(): SourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceDescription]
  }
  @scala.inline
  implicit class SourceDescriptionOps[Self <: SourceDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKinesisStreamSourceDescription(value: KinesisStreamSourceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamSourceDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStreamSourceDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamSourceDescription")(js.undefined)
        ret
    }
  }
  
}

