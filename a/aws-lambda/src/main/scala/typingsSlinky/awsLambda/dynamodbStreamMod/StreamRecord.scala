package typingsSlinky.awsLambda.dynamodbStreamMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.awsLambdaStrings.KEYS_ONLY
import typingsSlinky.awsLambda.awsLambdaStrings.NEW_AND_OLD_IMAGES
import typingsSlinky.awsLambda.awsLambdaStrings.NEW_IMAGE
import typingsSlinky.awsLambda.awsLambdaStrings.OLD_IMAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamRecord extends js.Object {
  var ApproximateCreationDateTime: js.UndefOr[Double] = js.native
  var Keys: js.UndefOr[StringDictionary[AttributeValue]] = js.native
  var NewImage: js.UndefOr[StringDictionary[AttributeValue]] = js.native
  var OldImage: js.UndefOr[StringDictionary[AttributeValue]] = js.native
  var SequenceNumber: js.UndefOr[String] = js.native
  var SizeBytes: js.UndefOr[Double] = js.native
  var StreamViewType: js.UndefOr[KEYS_ONLY | NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES] = js.native
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
    def withApproximateCreationDateTime(value: Double): Self = {
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
    def withKeys(value: StringDictionary[AttributeValue]): Self = {
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
    def withNewImage(value: StringDictionary[AttributeValue]): Self = {
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
    def withOldImage(value: StringDictionary[AttributeValue]): Self = {
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
    def withSequenceNumber(value: String): Self = {
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
    def withSizeBytes(value: Double): Self = {
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
    def withStreamViewType(value: KEYS_ONLY | NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES): Self = {
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

