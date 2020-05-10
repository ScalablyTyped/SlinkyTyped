package typingsSlinky.awsLambda.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3EventRecordGlacierEventData extends js.Object {
  var restoreEventData: S3EventRecordGlacierRestoreEventData = js.native
}

object S3EventRecordGlacierEventData {
  @scala.inline
  def apply(restoreEventData: S3EventRecordGlacierRestoreEventData): S3EventRecordGlacierEventData = {
    val __obj = js.Dynamic.literal(restoreEventData = restoreEventData.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3EventRecordGlacierEventData]
  }
  @scala.inline
  implicit class S3EventRecordGlacierEventDataOps[Self <: S3EventRecordGlacierEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestoreEventData(value: S3EventRecordGlacierRestoreEventData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreEventData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

