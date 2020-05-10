package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeliveryStreamsOutput extends js.Object {
  /**
    * The names of the delivery streams.
    */
  var DeliveryStreamNames: DeliveryStreamNameList = js.native
  /**
    * Indicates whether there are more delivery streams available to list.
    */
  var HasMoreDeliveryStreams: BooleanObject = js.native
}

object ListDeliveryStreamsOutput {
  @scala.inline
  def apply(DeliveryStreamNames: DeliveryStreamNameList, HasMoreDeliveryStreams: BooleanObject): ListDeliveryStreamsOutput = {
    val __obj = js.Dynamic.literal(DeliveryStreamNames = DeliveryStreamNames.asInstanceOf[js.Any], HasMoreDeliveryStreams = HasMoreDeliveryStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeliveryStreamsOutput]
  }
  @scala.inline
  implicit class ListDeliveryStreamsOutputOps[Self <: ListDeliveryStreamsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStreamNames(value: DeliveryStreamNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMoreDeliveryStreams(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasMoreDeliveryStreams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

