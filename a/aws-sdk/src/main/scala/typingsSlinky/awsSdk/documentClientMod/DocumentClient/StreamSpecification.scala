package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamSpecification extends js.Object {
  /**
    * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
    */
  var StreamEnabled: typingsSlinky.awsSdk.documentClientMod.DocumentClient.StreamEnabled = js.native
  /**
    *  When an item in the table is modified, StreamViewType determines what information is written to the stream for this table. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.  
    */
  var StreamViewType: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.StreamViewType] = js.native
}

object StreamSpecification {
  @scala.inline
  def apply(StreamEnabled: StreamEnabled): StreamSpecification = {
    val __obj = js.Dynamic.literal(StreamEnabled = StreamEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSpecification]
  }
  @scala.inline
  implicit class StreamSpecificationOps[Self <: StreamSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamEnabled(value: StreamEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamViewType(value: StreamViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamViewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamViewType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamViewType")(js.undefined)
        ret
    }
  }
  
}

