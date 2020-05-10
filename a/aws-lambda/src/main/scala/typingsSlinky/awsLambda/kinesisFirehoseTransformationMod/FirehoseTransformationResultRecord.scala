package typingsSlinky.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseTransformationResultRecord extends js.Object {
  /** Encode in Base64 */
  var data: String = js.native
  var recordId: String = js.native
  var result: FirehoseRecordTransformationStatus = js.native
}

object FirehoseTransformationResultRecord {
  @scala.inline
  def apply(data: String, recordId: String, result: FirehoseRecordTransformationStatus): FirehoseTransformationResultRecord = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseTransformationResultRecord]
  }
  @scala.inline
  implicit class FirehoseTransformationResultRecordOps[Self <: FirehoseTransformationResultRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: FirehoseRecordTransformationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

