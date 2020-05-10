package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeliveryStreamsInput extends js.Object {
  /**
    * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.   This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
    */
  var DeliveryStreamType: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.DeliveryStreamType] = js.native
  /**
    * The list of delivery streams returned by this call to ListDeliveryStreams will start with the delivery stream whose name comes alphabetically immediately after the name you specify in ExclusiveStartDeliveryStreamName.
    */
  var ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.native
  /**
    * The maximum number of delivery streams to list. The default value is 10.
    */
  var Limit: js.UndefOr[ListDeliveryStreamsInputLimit] = js.native
}

object ListDeliveryStreamsInput {
  @scala.inline
  def apply(): ListDeliveryStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeliveryStreamsInput]
  }
  @scala.inline
  implicit class ListDeliveryStreamsInputOps[Self <: ListDeliveryStreamsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStreamType(value: DeliveryStreamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryStreamType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamType")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveStartDeliveryStreamName(value: DeliveryStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartDeliveryStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveStartDeliveryStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartDeliveryStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: ListDeliveryStreamsInputLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
  }
  
}

