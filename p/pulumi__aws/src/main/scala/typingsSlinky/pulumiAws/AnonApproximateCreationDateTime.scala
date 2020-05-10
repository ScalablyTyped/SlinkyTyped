package typingsSlinky.pulumiAws

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApproximateCreationDateTime extends js.Object {
  var ApproximateCreationDateTime: Double = js.native
  var Keys: Record[String, _] = js.native
  var NewImage: js.UndefOr[Record[String, _]] = js.native
  var OldImage: js.UndefOr[Record[String, _]] = js.native
  var SequenceNumber: String = js.native
  var SizeBytes: Double = js.native
  var StreamViewType: String = js.native
}

object AnonApproximateCreationDateTime {
  @scala.inline
  def apply(
    ApproximateCreationDateTime: Double,
    Keys: Record[String, _],
    SequenceNumber: String,
    SizeBytes: Double,
    StreamViewType: String
  ): AnonApproximateCreationDateTime = {
    val __obj = js.Dynamic.literal(ApproximateCreationDateTime = ApproximateCreationDateTime.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], SizeBytes = SizeBytes.asInstanceOf[js.Any], StreamViewType = StreamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApproximateCreationDateTime]
  }
  @scala.inline
  implicit class AnonApproximateCreationDateTimeOps[Self <: AnonApproximateCreationDateTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximateCreationDateTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateCreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamViewType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamViewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewImage(value: Record[String, _]): Self = {
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
    def withOldImage(value: Record[String, _]): Self = {
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
  }
  
}

