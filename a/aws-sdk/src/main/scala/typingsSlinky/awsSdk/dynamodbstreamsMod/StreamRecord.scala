package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamRecord extends js.Object {
  /**
    * The approximate date and time when the stream record was created, in UNIX epoch time format.
    */
  var ApproximateCreationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The primary key attribute(s) for the DynamoDB item that was modified.
    */
  var Keys: js.UndefOr[AttributeMap] = js.native
  /**
    * The item in the DynamoDB table as it appeared after it was modified.
    */
  var NewImage: js.UndefOr[AttributeMap] = js.native
  /**
    * The item in the DynamoDB table as it appeared before it was modified.
    */
  var OldImage: js.UndefOr[AttributeMap] = js.native
  /**
    * The sequence number of the stream record.
    */
  var SequenceNumber: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.SequenceNumber] = js.native
  /**
    * The size of the stream record, in bytes.
    */
  var SizeBytes: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The type of data from the modified DynamoDB item that was captured in this stream record:    KEYS_ONLY - only the key attributes of the modified item.    NEW_IMAGE - the entire item, as it appeared after it was modified.    OLD_IMAGE - the entire item, as it appeared before it was modified.    NEW_AND_OLD_IMAGES - both the new and the old item images of the item.  
    */
  var StreamViewType: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.StreamViewType] = js.native
}

object StreamRecord {
  @scala.inline
  def apply(): StreamRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamRecord]
  }
  @scala.inline
  implicit class StreamRecordOps[Self <: StreamRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximateCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateCreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproximateCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateCreationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: AttributeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keys")(js.undefined)
        ret
    }
    @scala.inline
    def withNewImage(value: AttributeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewImage")(js.undefined)
        ret
    }
    @scala.inline
    def withOldImage(value: AttributeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldImage")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceNumber(value: SequenceNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeBytes(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeBytes")(js.undefined)
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

